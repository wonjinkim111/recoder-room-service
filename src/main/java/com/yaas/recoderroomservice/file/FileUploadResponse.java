package com.yaas.recoderroomservice.file;

public class FileUploadResponse {
    private String fileName;

    private String fileDownloadUri;

    private String fileType;

    private long fileSize;

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public void setFileDownloadUri(final String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public void setFileType(final String fileType) {
        this.fileType = fileType;
    }

    public void setFileSize(final long fileSize) {
        this.fileSize = fileSize;
    }

    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.yaas.recoderroomservice.file.FileUploadResponse))
            return false;
        com.yaas.recoderroomservice.file.FileUploadResponse other = (FileUploadResponse)o;
        if (!other.canEqual(this))
            return false;
        Object this$fileName = this.getFileName(), other$fileName = other.getFileName();
        if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName))
            return false;
        Object this$fileDownloadUri = this.getFileDownloadUri(), other$fileDownloadUri = other.getFileDownloadUri();
        if ((this$fileDownloadUri == null) ? (other$fileDownloadUri != null) : !this$fileDownloadUri.equals(other$fileDownloadUri))
            return false;
        Object this$fileType = this.getFileType(), other$fileType = other.getFileType();
        return ((this$fileType == null) ? (other$fileType != null) : !this$fileType.equals(other$fileType) ? false : (!(getFileSize() != other.getFileSize())));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.yaas.recoderroomservice.file.FileUploadResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $fileName = this.getFileName();
        result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode());
        Object $fileDownloadUri = this.getFileDownloadUri();
        result = result * 59 + (($fileDownloadUri == null) ? 43 : $fileDownloadUri.hashCode());
        Object $fileType = this.getFileType();
        result = result * 59 + (($fileType == null) ? 43 : $fileType.hashCode());
        long $fileSize = this.getFileSize();
        return result * 59 + (int)($fileSize >>> 32 ^ $fileSize);
    }

    public String toString() {
        return "FileUploadResponse(fileName=" + this.getFileName() + ", fileDownloadUri=" + this.getFileDownloadUri() + ", fileType=" + this.getFileType() + ", fileSize=" + this.getFileSize() + ")";
    }

    public FileUploadResponse(final String fileName, final String fileDownloadUri, final String fileType, final long fileSize) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public FileUploadResponse() {
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileDownloadUri() {
        return this.fileDownloadUri;
    }

    public String getFileType() {
        return this.fileType;
    }

    public long getFileSize() {
        return this.fileSize;
    }
}
