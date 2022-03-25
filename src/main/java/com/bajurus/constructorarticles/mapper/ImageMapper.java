package com.bajurus.constructorarticles.mapper;

import com.bajurus.constructorarticles.model.Image;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class ImageMapper {
    public Image toEntity(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setContentType(file.getContentType());
        image.setSize((int) file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }
}
