package com.bajurus.constructorarticles.service;

import com.bajurus.constructorarticles.model.ArticleImage;

public interface ArticleImageService {
    ArticleImage saveArticleImage(ArticleImage articleImage);

    ArticleImage getArticleImage(Integer id);
}