package com.yaas.recoderroomservice.service;

import com.yaas.recoderroomservice.exception.FileUploadException;
import com.yaas.recoderroomservice.file.FileUploadProperties;
import java.net.MalformedURLException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
    private final Path fileLocation;

    @Autowired
    public FileUploadService(FileUploadProperties prop) {
        this.fileLocation = Paths.get(prop.getUploadDir(), new String[0]).toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileLocation, (FileAttribute<?>[])new FileAttribute[0]);
        } catch (Exception e) {
            throw new FileUploadException("파일을 업로드 할 디렉토리를 생성하지 못했습니다.", e);
        }
    }

    public String uploadFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (fileName.contains(".."))
                throw new FileUploadException("파일 명에 부적합한 문자가 포함되어 있습니다. " + fileName);
            Path targetLocation = this.fileLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
            return fileName;
        } catch (Exception e) {
            throw new FileUploadException("[" + fileName + "] 파일 업로드에 실패하였습니다. 다시 시도해주세요.");
        }
    }

    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileLocation.resolve(fileName).normalize();
            System.out.println(">>>> filePath : " + filePath);
            UrlResource urlResource = new UrlResource(filePath.toUri());
            System.out.println(">>> resource " + urlResource);
            if (urlResource.exists())
                return (Resource)urlResource;
            throw new FileUploadException(fileName + " 파일을 찾을 수 없습니다.");
        } catch (MalformedURLException e) {
            throw new FileUploadException(fileName + " 파일을 찾을 수 없습니다.");
        }
    }
}
