package com.yaas.recoderroomservice.service;

import com.yaas.recoderroomservice.dto.MentorRoomDto;
import com.yaas.recoderroomservice.dto.RoomsDto;
import com.yaas.recoderroomservice.entity.Rooms;
import java.util.List;

public interface IRoomsService {
    RoomsDto createRoom(RoomsDto paramRoomsDto);

    int deleteRoom(long paramLong);

    int updateRoomInfo(Rooms paramRooms);

    List<MentorRoomDto> getRoomByMentorId(long paramLong);

    RoomsDto getRoomByRoomId(long paramLong);

    List<Rooms> getAllRooms();
}
