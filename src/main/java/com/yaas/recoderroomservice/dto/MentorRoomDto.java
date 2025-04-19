package com.yaas.recoderroomservice.dto;

import com.yaas.recoderroomservice.dto.MenteeInfoDto;
import java.util.List;

public class MentorRoomDto {
    private long roomId;

    private long mentorId;

    private String roomName;

    private int roomMax;

    private List<MenteeInfoDto> mentees;

    public void setRoomId(final long roomId) {
        this.roomId = roomId;
    }

    public void setMentorId(final long mentorId) {
        this.mentorId = mentorId;
    }

    public void setRoomName(final String roomName) {
        this.roomName = roomName;
    }

    public void setRoomMax(final int roomMax) {
        this.roomMax = roomMax;
    }

    public void setMentees(final List<MenteeInfoDto> mentees) {
        this.mentees = mentees;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.dto.MentorRoomDto))
            return false;
        com.yaas.recoderroomservice.dto.MentorRoomDto other = (com.yaas.recoderroomservice.dto.MentorRoomDto)o;
        if (!other.canEqual(this))
            return false;
        if (this.getRoomId() != other.getRoomId())
            return false;
        if (this.getMentorId() != other.getMentorId())
            return false;
        Object this$roomName = this.getRoomName(), other$roomName = other.getRoomName();
        if ((this$roomName == null) ? (other$roomName != null) : !this$roomName.equals(other$roomName))
            return false;
        if (this.getRoomMax() != other.getRoomMax())
            return false;
        Object this$mentees = this.getMentees(), other$mentees = other.getMentees();
        return !((this$mentees == null) ? (other$mentees != null) : !this$mentees.equals(other$mentees));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.dto.MentorRoomDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $roomId = this.getRoomId();
        result = result * 59 + (int)($roomId >>> 32 ^ $roomId);
        long $mentorId = this.getMentorId();
        result = result * 59 + (int)($mentorId >>> 32 ^ $mentorId);
        Object $roomName = this.getRoomName();
        result = result * 59 + (($roomName == null) ? 43 : $roomName.hashCode());
        result = result * 59 + this.getRoomMax();
        Object $mentees = this.getMentees();
        return result * 59 + (($mentees == null) ? 43 : $mentees.hashCode());
    }

    public String toString() {
        return "MentorRoomDto(roomId=" + this.getRoomId() + ", mentorId=" + this.getMentorId() + ", roomName=" + this.getRoomName() + ", roomMax=" + this.getRoomMax() + ", mentees=" + this.getMentees() + ")";
    }

    public MentorRoomDto(final long roomId, final long mentorId, final String roomName, final int roomMax, final List<MenteeInfoDto> mentees) {
        this.roomId = roomId;
        this.mentorId = mentorId;
        this.roomName = roomName;
        this.roomMax = roomMax;
        this.mentees = mentees;
    }

    public MentorRoomDto() {
    }

    public long getRoomId() {
        return this.roomId;
    }

    public long getMentorId() {
        return this.mentorId;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public int getRoomMax() {
        return this.roomMax;
    }

    public List<MenteeInfoDto> getMentees() {
        return this.mentees;
    }

    public MentorRoomDto(long roomId, long mentorId, String roomName, int roomMax) {
        this.roomId = roomId;
        this.mentorId = mentorId;
        this.roomName = roomName;
        this.roomMax = roomMax;
    }
}
