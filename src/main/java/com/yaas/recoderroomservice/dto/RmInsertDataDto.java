package com.yaas.recoderroomservice.dto;

public class RmInsertDataDto {
    private long roomId;

    private long menteeId;

    public void setRoomId(final long roomId) {
        this.roomId = roomId;
    }

    public void setMenteeId(final long menteeId) {
        this.menteeId = menteeId;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.dto.RmInsertDataDto))
            return false;
        com.yaas.recoderroomservice.dto.RmInsertDataDto other = (com.yaas.recoderroomservice.dto.RmInsertDataDto)o;
        return !other.canEqual(this) ? false : ((getRoomId() != other.getRoomId()) ? false : (!(getMenteeId() != other.getMenteeId())));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.dto.RmInsertDataDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $roomId = this.getRoomId();
        result = result * 59 + (int)($roomId >>> 32 ^ $roomId);
        long $menteeId = this.getMenteeId();
        return result * 59 + (int)($menteeId >>> 32 ^ $menteeId);
    }

    public String toString() {
        return "RmInsertDataDto(roomId=" + this.getRoomId() + ", menteeId=" + this.getMenteeId() + ")";
    }

    public RmInsertDataDto(final long roomId, final long menteeId) {
        this.roomId = roomId;
        this.menteeId = menteeId;
    }

    public RmInsertDataDto() {
    }

    public long getRoomId() {
        return this.roomId;
    }

    public long getMenteeId() {
        return this.menteeId;
    }
}
