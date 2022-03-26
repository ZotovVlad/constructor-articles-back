package com.bajurus.constructorarticles.controller;

import com.bajurus.constructorarticles.mapper.ImageMapper;
import com.bajurus.constructorarticles.model.Image;
import com.bajurus.constructorarticles.service.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@RequestMapping("/api/v3")
public class ArticlePhotoController {

    Logger logger = LoggerFactory.getLogger(ArticlePhotoController.class);

    private final ImageMapper imageMapper;
    private final ImageService imageService;

    public ArticlePhotoController(ImageMapper imageMapper, ImageService imageService) {
        this.imageMapper = imageMapper;
        this.imageService = imageService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/articlesphoto/{id}")
    public ResponseEntity<?> getImage(@PathVariable Integer id) throws IOException {
        Image image = imageService.getImage(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("fileName", image.getOriginalFileName())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(image.getBytes())));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/articlephoto")
    public ResponseEntity<?> saveImage(@RequestParam("file") MultipartFile file) throws IOException {
        Image image = imageMapper.toEntity(file);
        image = imageService.saveImage(image);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("fileName", image.getOriginalFileName())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(image.getBytes())));
    }
}
