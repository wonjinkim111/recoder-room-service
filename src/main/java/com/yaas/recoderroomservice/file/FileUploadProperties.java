package com.yaas.recoderroomservice.file;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
        prefix = "file"
)
public class FileUploadProperties {
    private String uploadDir;

    public String getUploadDir() {
        return this.uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
