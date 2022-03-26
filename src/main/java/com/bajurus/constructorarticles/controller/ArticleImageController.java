package com.bajurus.constructorarticles.controller;

import com.bajurus.constructorarticles.mapper.ArticleImageMapper;
import com.bajurus.constructorarticles.model.ArticleImage;
import com.bajurus.constructorarticles.model.dto.ArticleImageDTO;
import com.bajurus.constructorarticles.service.ArticleImageService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3")
public class ArticleImageController {

    Logger logger = LoggerFactory.getLogger(ArticleImageController.class);

    private final ArticleImageMapper articleImageMapper;
    private final ArticleImageService articleImageService;

    public ArticleImageController(ArticleImageMapper articleImageMapper, ArticleImageService articleImageService) {
        this.articleImageMapper = articleImageMapper;
        this.articleImageService = articleImageService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/articlesimage/{id}")
    public ResponseEntity<?> getArticleImage(@PathVariable Integer id) throws JsonProcessingException {
        ArticleImage articleImage = articleImageService.getArticleImage(id);
        logger.info("Received: " + articleImage.toString());
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        return new ResponseEntity<>(mapper.writeValueAsString(articleImage), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/articleimage")
    public ResponseEntity<?> saveArticleImage(@RequestBody ArticleImageDTO articleImageDTO) {
        ArticleImage articleImage = articleImageMapper.toEntity(articleImageDTO);
        articleImage = articleImageService.saveArticleImage(articleImage);
        logger.info("Created: " + articleImage.toString());
        return new ResponseEntity<>(articleImage, HttpStatus.CREATED);
    }
}