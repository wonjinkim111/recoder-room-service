package com.yaas.recoderroomservice.controller;

import com.yaas.recoderroomservice.dto.MentorRoomDto;
import com.yaas.recoderroomservice.dto.RoomListDto;
import com.yaas.recoderroomservice.dto.RoomsDto;
import com.yaas.recoderroomservice.entity.Rooms;
import com.yaas.recoderroomservice.file.FileUploadResponse;
import com.yaas.recoderroomservice.model.CreateRoomResponseModel;
import com.yaas.recoderroomservice.model.ResultResponseModel;
import com.yaas.recoderroomservice.service.FileUploadService;
import com.yaas.recoderroomservice.service.IRoomsService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.google.gson.reflect.TypeToken;

@CrossOrigin
@RestController
@RequestMapping({"/room"})
public class RoomsController implements ApplicationContextAware {
    private static final Logger log = LoggerFactory.getLogger(com.yaas.recoderroomservice.controller.RoomsController.class);

    String roomUpload;

    WebApplicationContext context = null;

    IRoomsService service;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = (WebApplicationContext)applicationContext;
        this.roomUpload = this.context.getServletContext().getRealPath("recoder-img");
        log.info(String.format(": %s", new Object[] { this.roomUpload }));
    }

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    FileUploadService fileUploadService;

    @Autowired
    public RoomsController(IRoomsService service, FileUploadService fileUploadService) {
        this.service = service;
        this.fileUploadService = fileUploadService;
    }

    @PostMapping({"/uploadFile"})
    public FileUploadResponse uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = this.fileUploadService.uploadFile(file);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/usr/recoder-img/").path(fileName).toUriString();
        return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
    }

    @PostMapping({"/{mentorId}"})
    public ResponseEntity<CreateRoomResponseModel> createRoom(@ModelAttribute Rooms room, @PathVariable long mentorId, @RequestParam(value = "file", required = false) MultipartFile file) {
        log.info("createRoom controller 왔다!!!!!!!!!!!!!!");
        this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        RoomsDto roomsDto = (RoomsDto)this.modelMapper.map(room, RoomsDto.class);
        roomsDto.setMentorId(mentorId);
        if (file != null) {
            String fileName = this.fileUploadService.uploadFile(file);
            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/usr/recoder-img/").path(fileName).toUriString();
            roomsDto.setRoomPicture(fileDownloadUri);
        } else {
            roomsDto.setDtoRoomPicture(null);
        }
        log.info(roomsDto.getRoomPicture());
        RoomsDto createDto = this.service.createRoom(roomsDto);
        CreateRoomResponseModel returnValue = (CreateRoomResponseModel)this.modelMapper.map(createDto, CreateRoomResponseModel.class);
        returnValue.setRoomId(createDto.getRoomId());
        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
    }

    @DeleteMapping({"/{roomId}"})
    public ResponseEntity<ResultResponseModel> deleteUser(@PathVariable long roomId) {
        this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        long deleteResult = this.service.deleteRoom(roomId);
        ResultResponseModel sReturnValue = (ResultResponseModel)this.modelMapper.map(Long.valueOf(roomId), ResultResponseModel.class);
        ResultResponseModel fReturnValue = (ResultResponseModel)this.modelMapper.map(Integer.valueOf(0), ResultResponseModel.class);
        if (deleteResult == 1L)
            return ResponseEntity.status(HttpStatus.CREATED).body(sReturnValue);
        return ResponseEntity.status(HttpStatus.CREATED).body(fReturnValue);
    }

    @PutMapping
    public int updateUser(@ModelAttribute Rooms rooms) {
        int updateRoom = this.service.updateRoomInfo(rooms);
        return updateRoom;
    }

    @GetMapping({"/mentor/{mentorId}"})
    @ResponseBody
    public List<MentorRoomDto> getRoomByMentorId(@PathVariable long mentorId) {
        List<MentorRoomDto> returnValue = new ArrayList<>();
        List<MentorRoomDto> mentorRoom = this.service.getRoomByMentorId(mentorId);
        if (mentorRoom == null || mentorRoom.isEmpty())
            return returnValue;
        Type listType = (new TypeToken<List<MentorRoomDto>>() {
        }).getType();
        returnValue = (List<MentorRoomDto>)(new ModelMapper()).map(mentorRoom, listType);
        log.info("Returning " + returnValue.size() + " mentor's room");
        return returnValue;
    }

    @GetMapping({"/{roomId}"})
    @ResponseBody
    public RoomsDto getRoomByRoomId(@PathVariable long roomId) {
        RoomsDto roomInfo = this.service.getRoomByRoomId(roomId);
        return roomInfo;
    }

    @GetMapping
    @ResponseBody
    public List<RoomListDto> getAllRooms() {
        List<RoomListDto> returnValue = new ArrayList<>();
        List<Rooms> roomEntity = this.service.getAllRooms();
        if (roomEntity == null || roomEntity.isEmpty())
            return returnValue;
        Type listType = (new TypeToken<List<RoomListDto>>() {
        }).getType();
        returnValue = (List<RoomListDto>)(new ModelMapper()).map(roomEntity, listType);
        log.info("Returning " + returnValue.size() + " all rooms");
        return returnValue;
    }
}
