package com.bajurus.constructorarticles.service;

import com.bajurus.constructorarticles.model.ArticleImage;

import java.util.List;

public interface ArticleImageService {
    ArticleImage saveArticleImage(ArticleImage articleImage);

    ArticleImage getArticleImage(Integer id);

    List<ArticleImage> getAllArticleImage();
}