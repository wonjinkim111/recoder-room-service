package com.yaas.recoderroomservice.model;

public class ResultResponseModel {
    private long returnCode;

    public String toString() {
        return "ResultResponseModel(returnCode=" + this.getReturnCode() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $returnCode = this.getReturnCode();
        return result * 59 + (int)($returnCode >>> 32 ^ $returnCode);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.model.ResultResponseModel;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.model.ResultResponseModel))
            return false;
        com.yaas.recoderroomservice.model.ResultResponseModel other = (com.yaas.recoderroomservice.model.ResultResponseModel)o;
        return !other.canEqual(this) ? false : (!(this.getReturnCode() != other.getReturnCode()));
    }

    public void setReturnCode(final long returnCode) {
        this.returnCode = returnCode;
    }

    public long getReturnCode() {
        return this.returnCode;
    }
}
