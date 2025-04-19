package com.yaas.recoderroomservice.entity;

import com.yaas.recoderroomservice.dto.PictureDto;
import java.util.Date;
import java.util.List;

public class Rooms {
    private long roomId;

    private long mentorId;

    private String roomName;

    private int roomIsPrivate;

    private String roomInfo;

    private int roomMax;

    private List<PictureDto> dtoRoomPicture;

    private String roomPicture;

    private Date regDate;

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

    public void setRoomIsPrivate(final int roomIsPrivate) {
        this.roomIsPrivate = roomIsPrivate;
    }

    public void setRoomInfo(final String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public void setRoomMax(final int roomMax) {
        this.roomMax = roomMax;
    }

    public void setDtoRoomPicture(final List<PictureDto> dtoRoomPicture) {
        this.dtoRoomPicture = dtoRoomPicture;
    }

    public void setRoomPicture(final String roomPicture) {
        this.roomPicture = roomPicture;
    }

    public void setRegDate(final Date regDate) {
        this.regDate = regDate;
    }

    public void setMentorNickname(final String mentorNickname) {
        this.mentorNickname = mentorNickname;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.entity.Rooms))
            return false;
        com.yaas.recoderroomservice.entity.Rooms other = (com.yaas.recoderroomservice.entity.Rooms)o;
        if (!other.canEqual(this))
            return false;
        if (getRoomId() != other.getRoomId())
            return false;
        if (getMentorId() != other.getMentorId())
            return false;
        Object this$roomName = getRoomName(), other$roomName = other.getRoomName();
        if ((this$roomName == null) ? (other$roomName != null) : !this$roomName.equals(other$roomName))
            return false;
        if (getRoomIsPrivate() != other.getRoomIsPrivate())
            return false;
        Object this$roomInfo = getRoomInfo(), other$roomInfo = other.getRoomInfo();
        if ((this$roomInfo == null) ? (other$roomInfo != null) : !this$roomInfo.equals(other$roomInfo))
            return false;
        if (getRoomMax() != other.getRoomMax())
            return false;
        Object this$dtoRoomPicture = this.getDtoRoomPicture(), other$dtoRoomPicture = other.getDtoRoomPicture();
        if ((this$dtoRoomPicture == null) ? (other$dtoRoomPicture != null) : !this$dtoRoomPicture.equals(other$dtoRoomPicture))
            return false;
        Object this$roomPicture = getRoomPicture(), other$roomPicture = other.getRoomPicture();
        if ((this$roomPicture == null) ? (other$roomPicture != null) : !this$roomPicture.equals(other$roomPicture))
            return false;
        Object this$regDate = getRegDate(), other$regDate = other.getRegDate();
        if ((this$regDate == null) ? (other$regDate != null) : !this$regDate.equals(other$regDate))
            return false;
        Object this$mentorNickname = getMentorNickname(), other$mentorNickname = other.getMentorNickname();
        return !((this$mentorNickname == null) ? (other$mentorNickname != null) : !this$mentorNickname.equals(other$mentorNickname));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.entity.Rooms;
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
        result = result * 59 + this.getRoomIsPrivate();
        Object $roomInfo = this.getRoomInfo();
        result = result * 59 + (($roomInfo == null) ? 43 : $roomInfo.hashCode());
        result = result * 59 + this.getRoomMax();
        Object $dtoRoomPicture = this.getDtoRoomPicture();
        result = result * 59 + (($dtoRoomPicture == null) ? 43 : $dtoRoomPicture.hashCode());
        Object $roomPicture = this.getRoomPicture();
        result = result * 59 + (($roomPicture == null) ? 43 : $roomPicture.hashCode());
        Object $regDate = this.getRegDate();
        result = result * 59 + (($regDate == null) ? 43 : $regDate.hashCode());
        Object $mentorNickname = this.getMentorNickname();
        return result * 59 + (($mentorNickname == null) ? 43 : $mentorNickname.hashCode());
    }

    public String toString() {
        return "Rooms(roomId=" + this.getRoomId() + ", mentorId=" + this.getMentorId() + ", roomName=" + this.getRoomName() + ", roomIsPrivate=" + this.getRoomIsPrivate() + ", roomInfo=" + this.getRoomInfo() + ", roomMax=" + this.getRoomMax() + ", dtoRoomPicture=" + this.getDtoRoomPicture() + ", roomPicture=" + this.getRoomPicture() + ", regDate=" + this.getRegDate() + ", mentorNickname=" + this.getMentorNickname() + ")";
    }

    public Rooms(final long roomId, final long mentorId, final String roomName, final int roomIsPrivate, final String roomInfo, final int roomMax, final List<PictureDto> dtoRoomPicture, final String roomPicture, final Date regDate, final String mentorNickname) {
        this.roomId = roomId;
        this.mentorId = mentorId;
        this.roomName = roomName;
        this.roomIsPrivate = roomIsPrivate;
        this.roomInfo = roomInfo;
        this.roomMax = roomMax;
        this.dtoRoomPicture = dtoRoomPicture;
        this.roomPicture = roomPicture;
        this.regDate = regDate;
        this.mentorNickname = mentorNickname;
    }

    public Rooms() {
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

    public int getRoomIsPrivate() {
        return this.roomIsPrivate;
    }

    public String getRoomInfo() {
        return this.roomInfo;
    }

    public int getRoomMax() {
        return this.roomMax;
    }

    public List<PictureDto> getDtoRoomPicture() {
        return this.dtoRoomPicture;
    }

    public String getRoomPicture() {
        return this.roomPicture;
    }

    public Date getRegDate() {
        return this.regDate;
    }

    public String getMentorNickname() {
        return this.mentorNickname;
    }

    public Rooms(long roomId, long mentorId, String roomName, int roomIsPrivate, String roomInfo, int roomMax, List<PictureDto> dtoRoomPicture, String roomPicture, Date regDate) {
        this.roomId = roomId;
        this.mentorId = mentorId;
        this.roomName = roomName;
        this.roomIsPrivate = roomIsPrivate;
        this.roomInfo = roomInfo;
        this.roomMax = roomMax;
        this.dtoRoomPicture = dtoRoomPicture;
        this.roomPicture = roomPicture;
        this.regDate = regDate;
    }
}
