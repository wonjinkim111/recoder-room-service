package com.yaas.recoderroomservice.dto;

import org.springframework.web.multipart.MultipartFile;

public class PictureDto {
    private long roomPictureId;

    private long roomId;

    private String roomPicture;

    private MultipartFile picture;

    public void setRoomPictureId(final long roomPictureId) {
        this.roomPictureId = roomPictureId;
    }

    public void setRoomId(final long roomId) {
        this.roomId = roomId;
    }

    public void setRoomPicture(final String roomPicture) {
        this.roomPicture = roomPicture;
    }

    public void setPicture(final MultipartFile picture) {
        this.picture = picture;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.dto.PictureDto))
            return false;
        com.yaas.recoderroomservice.dto.PictureDto other = (com.yaas.recoderroomservice.dto.PictureDto)o;
        if (!other.canEqual(this))
            return false;
        if (this.getRoomPictureId() != other.getRoomPictureId())
            return false;
        if (this.getRoomId() != other.getRoomId())
            return false;
            Object this$roomPicture = this.getRoomPicture(), other$roomPicture = other.getRoomPicture();
            if ((this$roomPicture == null) ? (other$roomPicture != null) : !this$roomPicture.equals(other$roomPicture))
                return false;
            Object this$picture = this.getPicture(), other$picture = other.getPicture();
            return !((this$picture == null) ? (other$picture != null) : !this$picture.equals(other$picture));
        }

        protected boolean canEqual(final Object other) {
            return other instanceof com.yaas.recoderroomservice.dto.PictureDto;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            long $roomPictureId = this.getRoomPictureId();
            result = result * 59 + (int)($roomPictureId >>> 32 ^ $roomPictureId);
            long $roomId = this.getRoomId();
            result = result * 59 + (int)($roomId >>> 32 ^ $roomId);
            Object $roomPicture = this.getRoomPicture();
            result = result * 59 + (($roomPicture == null) ? 43 : $roomPicture.hashCode());
            Object $picture = this.getPicture();
            return result * 59 + (($picture == null) ? 43 : $picture.hashCode());
        }

        public String toString() {
            return "PictureDto(roomPictureId=" + this.getRoomPictureId() + ", roomId=" + this.getRoomId() + ", roomPicture=" + this.getRoomPicture() + ", picture=" + this.getPicture() + ")";
        }

        public long getRoomPictureId() {
            return this.roomPictureId;
        }

        public long getRoomId() {
            return this.roomId;
        }

        public String getRoomPicture() {
            return this.roomPicture;
        }

        public MultipartFile getPicture() {
            return this.picture;
        }
}
