package com.yaas.recoderroomservice.repository;

import com.yaas.recoderroomservice.dto.MentorRoomDto;
import com.yaas.recoderroomservice.dto.PictureDto;
import com.yaas.recoderroomservice.entity.Rooms;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IRoomMapper {
    int createRoom(Rooms paramRooms);

    int insertRoomPicture(PictureDto paramPictureDto);

    int deleteRoom(long paramLong);

    int updateRoomInfo(Rooms paramRooms);

    List<MentorRoomDto> getRoomByMentorId(long paramLong);

    Rooms getRoomByRoomId(long paramLong);

    List<Rooms> getAllRooms();
}
