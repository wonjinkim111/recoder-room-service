package com.yaas.recoderroomservice.dto;

public class RoomListDto {
    private long roomId;

    private long mentorId;

    private String roomName;

    private boolean roomIsPrivate;

    private String roomInfo;

    private int roomMax;

    private String roomPicture;

    private String mentorNickname;

    public void setRoomId(final long roomId) {
        this.roomId = roomId;
    }

    public void setMentorId(final long mentorId) {
        this.mentorId = mentorId;
    }

    public void setRoomName(final String roomName) {
        this.roomName = roomName;
    }

    public void setRoomIsPrivate(final boolean roomIsPrivate) {
        this.roomIsPrivate = roomIsPrivate;
    }

    public void setRoomInfo(final String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public void setRoomMax(final int roomMax) {
        this.roomMax = roomMax;
    }

    public void setRoomPicture(final String roomPicture) {
        this.roomPicture = roomPicture;
    }

    public void setMentorNickname(final String mentorNickname) {
        this.mentorNickname = mentorNickname;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.dto.RoomListDto))
            return false;
        com.yaas.recoderroomservice.dto.RoomListDto other = (com.yaas.recoderroomservice.dto.RoomListDto)o;
        if (!other.canEqual(this))
            return false;
        if (this.getRoomId() != other.getRoomId())
            return false;
        if (this.getMentorId() != other.getMentorId())
            return false;
        Object this$roomName = this.getRoomName(), other$roomName = other.getRoomName();
        if ((this$roomName == null) ? (other$roomName != null) : !this$roomName.equals(other$roomName))
            return false;
        if (this.isRoomIsPrivate() != other.isRoomIsPrivate())
            return false;
        Object this$roomInfo = this.getRoomInfo(), other$roomInfo = other.getRoomInfo();
        if ((this$roomInfo == null) ? (other$roomInfo != null) : !this$roomInfo.equals(other$roomInfo))
            return false;
        if (this.getRoomMax() != other.getRoomMax())
            return false;
        Object this$roomPicture = this.getRoomPicture(), other$roomPicture = other.getRoomPicture();
        if ((this$roomPicture == null) ? (other$roomPicture != null) : !this$roomPicture.equals(other$roomPicture))
            return false;
        Object this$mentorNickname = this.getMentorNickname(), other$mentorNickname = other.getMentorNickname();
        return !((this$mentorNickname == null) ? (other$mentorNickname != null) : !this$mentorNickname.equals(other$mentorNickname));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.dto.RoomListDto;
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
        result = result * 59 + (this.isRoomIsPrivate() ? 79 : 97);
        Object $roomInfo = this.getRoomInfo();
        result = result * 59 + (($roomInfo == null) ? 43 : $roomInfo.hashCode());
        result = result * 59 + this.getRoomMax();
        Object $roomPicture = this.getRoomPicture();
        result = result * 59 + (($roomPicture == null) ? 43 : $roomPicture.hashCode());
        Object $mentorNickname = this.getMentorNickname();
        return result * 59 + (($mentorNickname == null) ? 43 : $mentorNickname.hashCode());
    }

    public String toString() {
        return "RoomListDto(roomId=" + this.getRoomId() + ", mentorId=" + this.getMentorId() + ", roomName=" + this.getRoomName() + ", roomIsPrivate=" + this.isRoomIsPrivate() + ", roomInfo=" + this.getRoomInfo() + ", roomMax=" + this.getRoomMax() + ", roomPicture=" + this.getRoomPicture() + ", mentorNickname=" + this.getMentorNickname() + ")";
    }

    public RoomListDto(final long roomId, final long mentorId, final String roomName, final boolean roomIsPrivate, final String roomInfo, final int roomMax, final String roomPicture, final String mentorNickname) {
        this.roomId = roomId;
        this.mentorId = mentorId;
        this.roomName = roomName;
        this.roomIsPrivate = roomIsPrivate;
        this.roomInfo = roomInfo;
        this.roomMax = roomMax;
        this.roomPicture = roomPicture;
        this.mentorNickname = mentorNickname;
    }

    public RoomListDto() {
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

    public boolean isRoomIsPrivate() {
        return this.roomIsPrivate;
    }

    public String getRoomInfo() {
        return this.roomInfo;
    }

    public int getRoomMax() {
        return this.roomMax;
    }

    public String getRoomPicture() {
        return this.roomPicture;
    }

    public String getMentorNickname() {
        return this.mentorNickname;
    }

    public RoomListDto(long roomId, long mentorId, String roomName, boolean roomIsPrivate, String roomInfo, int roomMax, String roomPicture) {
        this.roomId = roomId;
        this.mentorId = mentorId;
        this.roomName = roomName;
        this.roomIsPrivate = roomIsPrivate;
        this.roomInfo = roomInfo;
        this.roomMax = roomMax;
        this.roomPicture = roomPicture;
    }
}
