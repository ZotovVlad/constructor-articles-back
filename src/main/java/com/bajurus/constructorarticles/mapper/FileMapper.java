package com.bajurus.constructorarticles.mapper;

import com.bajurus.constructorarticles.model.File;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class FileMapper {
    public File toEntity(MultipartFile file) throws IOException {
        File image = new File();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setContentType(file.getContentType());
        image.setSize((int) file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }
}
