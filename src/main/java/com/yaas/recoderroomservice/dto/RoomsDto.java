package com.yaas.recoderroomservice.dto;

import com.yaas.recoderroomservice.dto.PictureDto;
import java.util.Date;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public class RoomsDto {
    private long roomId;

    private long mentorId;

    private String roomName;

    private boolean roomIsPrivate;

    private String roomInfo;

    private int roomMax;

    private List<PictureDto> dtoRoomPicture;

    private MultipartFile picture;

    private String roomPicture;

    private Date regDate;

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

    public void setDtoRoomPicture(final List<PictureDto> dtoRoomPicture) {
        this.dtoRoomPicture = dtoRoomPicture;
    }

    public void setPicture(final MultipartFile picture) {
        this.picture = picture;
    }

    public void setRoomPicture(final String roomPicture) {
        this.roomPicture = roomPicture;
    }

    public void setRegDate(final Date regDate) {
        this.regDate = regDate;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.dto.RoomsDto))
            return false;
        com.yaas.recoderroomservice.dto.RoomsDto other = (com.yaas.recoderroomservice.dto.RoomsDto)o;
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
        Object this$dtoRoomPicture = this.getDtoRoomPicture(), other$dtoRoomPicture = other.getDtoRoomPicture();
        if ((this$dtoRoomPicture == null) ? (other$dtoRoomPicture != null) : !this$dtoRoomPicture.equals(other$dtoRoomPicture))
            return false;
        Object this$picture = this.getPicture(), other$picture = other.getPicture();
        if ((this$picture == null) ? (other$picture != null) : !this$picture.equals(other$picture))
            return false;
        Object this$roomPicture = this.getRoomPicture(), other$roomPicture = other.getRoomPicture();
        if ((this$roomPicture == null) ? (other$roomPicture != null) : !this$roomPicture.equals(other$roomPicture))
            return false;
        Object this$regDate = this.getRegDate(), other$regDate = other.getRegDate();
        return !((this$regDate == null) ? (other$regDate != null) : !this$regDate.equals(other$regDate));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.dto.RoomsDto;
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
        Object $dtoRoomPicture = this.getDtoRoomPicture();
        result = result * 59 + (($dtoRoomPicture == null) ? 43 : $dtoRoomPicture.hashCode());
        Object $picture = this.getPicture();
        result = result * 59 + (($picture == null) ? 43 : $picture.hashCode());
        Object $roomPicture = this.getRoomPicture();
        result = result * 59 + (($roomPicture == null) ? 43 : $roomPicture.hashCode());
        Object $regDate = this.getRegDate();
        return result * 59 + (($regDate == null) ? 43 : $regDate.hashCode());
    }

    public String toString() {
        return "RoomsDto(roomId=" + this.getRoomId() + ", mentorId=" + this.getMentorId() + ", roomName=" + this.getRoomName() + ", roomIsPrivate=" + this.isRoomIsPrivate() + ", roomInfo=" + this.getRoomInfo() + ", roomMax=" + this.getRoomMax() + ", dtoRoomPicture=" + this.getDtoRoomPicture() + ", picture=" + this.getPicture() + ", roomPicture=" + this.getRoomPicture() + ", regDate=" + this.getRegDate() + ")";
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

    public List<PictureDto> getDtoRoomPicture() {
        return this.dtoRoomPicture;
    }

    public MultipartFile getPicture() {
        return this.picture;
    }

    public String getRoomPicture() {
        return this.roomPicture;
    }

    public Date getRegDate() {
        return this.regDate;
    }
}
