package com.yaas.recoderroomservice.service;

import com.yaas.recoderroomservice.client.UsersService;
import com.yaas.recoderroomservice.dto.MentorRoomDto;
import com.yaas.recoderroomservice.dto.RoomsDto;
import com.yaas.recoderroomservice.entity.Rooms;
import com.yaas.recoderroomservice.model.UmentorNicknameModel;
import com.yaas.recoderroomservice.repository.IRoomMapper;
import com.yaas.recoderroomservice.service.IRoomsService;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class RoomsServiceImpl implements IRoomsService {
    private static final Logger log = LoggerFactory.getLogger(com.yaas.recoderroomservice.service.RoomsServiceImpl.class);

    IRoomMapper mapper;

    UsersService usersService;

    @Autowired
    public RoomsServiceImpl(IRoomMapper mapper, UsersService usersService) {
        this.mapper = mapper;
        this.usersService = usersService;
    }

    public RoomsDto createRoom(RoomsDto roomsDto) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Rooms roomEntity = (Rooms)modelMapper.map(roomsDto, Rooms.class);
        System.out.println("room 테이블 생성");
        this.mapper.createRoom(roomEntity);
        System.out.println("과연 파일은? " + roomEntity.getRoomPicture());
        System.out.println();
        RoomsDto returnValue = (RoomsDto)modelMapper.map(roomEntity, RoomsDto.class);
        return returnValue;
    }

    public int updateRoomInfo(Rooms rooms) {
        int updateRoom = this.mapper.updateRoomInfo(rooms);
        return updateRoom;
    }

    public int deleteRoom(@PathVariable long roomId) {
        int deleteRoom = this.mapper.deleteRoom(roomId);
        return deleteRoom;
    }

    public List<MentorRoomDto> getRoomByMentorId(@PathVariable long mentorId) {
        List<MentorRoomDto> mentorRoomDto = this.mapper.getRoomByMentorId(mentorId);
        if (mentorRoomDto == null)
            log.info(String.format("not exists %s", new Object[] { Long.valueOf(mentorId) }));
        return mentorRoomDto;
    }

    public RoomsDto getRoomByRoomId(@PathVariable long roomId) {
        Rooms roomEntity = this.mapper.getRoomByRoomId(roomId);
        if (roomEntity == null)
            log.info(String.format("not exists use : %s", new Object[] { Long.valueOf(roomId) }));
        return (RoomsDto)(new ModelMapper()).map(roomEntity, RoomsDto.class);
    }

    public List<Rooms> getAllRooms() {
        List<Rooms> getAllRooms = this.mapper.getAllRooms();
        System.out.println("getAllRooms 서비스!");
        if (getAllRooms == null) {
            log.info(String.format("not exists rooms", new Object[0]));
            return new ArrayList<>();
        }
        log.info("유저 >>> Before calling users microservice");
        for(int i = 0; i < getAllRooms.size(); i++) {
            UmentorNicknameModel umentorNicknameModel = this.usersService.getMentorNickname(((Rooms)getAllRooms.get(i)).getMentorId());
            ((Rooms)getAllRooms.get(i)).setMentorNickname(umentorNicknameModel.getMentorNickname());
        }
        log.info("유저 >>> After calling users microservice");
        return getAllRooms;
    }
}
