package com.yaas.recoderroomservice.model;

public class UmentorNicknameModel {
    private String mentorNickname;

    public String toString() {
        return "UmentorNicknameModel(mentorNickname=" + this.getMentorNickname() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $mentorNickname = this.getMentorNickname();
        return result * 59 + (($mentorNickname == null) ? 43 : $mentorNickname.hashCode());
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.model.UmentorNicknameModel;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.model.UmentorNicknameModel))
            return false;
        com.yaas.recoderroomservice.model.UmentorNicknameModel other = (UmentorNicknameModel)o;
        if (!other.canEqual(this))
            return false;
        Object this$mentorNickname = this.getMentorNickname(), other$mentorNickname = other.getMentorNickname();
        return !((this$mentorNickname == null) ? (other$mentorNickname != null) : !this$mentorNickname.equals(other$mentorNickname));
    }

    public void setMentorNickname(final String mentorNickname) {
        this.mentorNickname = mentorNickname;
    }

    public String getMentorNickname() {
        return this.mentorNickname;
    }
}
