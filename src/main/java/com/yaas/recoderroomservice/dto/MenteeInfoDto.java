package com.yaas.recoderroomservice.dto;

public class MenteeInfoDto {
	  private long menteeId;
	  
	  public String toString() {
	    return "MenteeInfoDto(menteeId=" + getMenteeId() + ")";
	  }
	  
	  public int hashCode() {
	    int PRIME = 59;
	    int result = 1;
	    long $menteeId = getMenteeId();
	    return result * 59 + (int)($menteeId >>> 32L ^ $menteeId);
	  }
	  
	  protected boolean canEqual(Object other) {
	    return other instanceof com.yaas.recoderroomservice.dto.MenteeInfoDto;
	  }
	  
	  public boolean equals(Object o) {
	    if (o == this)
	      return true; 
	    if (!(o instanceof com.yaas.recoderroomservice.dto.MenteeInfoDto))
	      return false; 
	    com.yaas.recoderroomservice.dto.MenteeInfoDto other = (com.yaas.recoderroomservice.dto.MenteeInfoDto)o;
	    return !other.canEqual(this) ? false : (!(getMenteeId() != other.getMenteeId()));
	  }
	  
	  public void setMenteeId(long menteeId) {
	    this.menteeId = menteeId;
	  }
	  
	  public long getMenteeId() {
	    return this.menteeId;
	  }
}
