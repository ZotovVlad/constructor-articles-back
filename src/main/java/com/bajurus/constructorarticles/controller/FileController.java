package com.bajurus.constructorarticles.controller;

import com.bajurus.constructorarticles.mapper.FileMapper;
import com.bajurus.constructorarticles.model.File;
import com.bajurus.constructorarticles.service.FileService;
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
public class FileController {

    Logger logger = LoggerFactory.getLogger(FileController.class);

    private final FileMapper fileMapper;
    private final FileService fileService;

    public FileController(FileMapper fileMapper, FileService fileService) {
        this.fileMapper = fileMapper;
        this.fileService = fileService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/files/{id}")
    public ResponseEntity<?> getImage(@PathVariable Integer id) throws IOException {
        File file = fileService.getImage(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("fileName", file.getOriginalFileName())
                .contentType(MediaType.valueOf(file.getContentType()))
                .contentLength(file.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(file.getBytes())));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/file")
    public ResponseEntity<?> saveImage(@RequestParam("file") MultipartFile file) throws IOException {
        File image = fileMapper.toEntity(file);
        image = fileService.saveImage(image);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("fileName", image.getOriginalFileName())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(image.getBytes())));
    }
}
