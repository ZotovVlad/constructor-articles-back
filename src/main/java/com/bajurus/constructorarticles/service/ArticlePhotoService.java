package com.bajurus.constructorarticles.service;

import com.bajurus.constructorarticles.model.ArticlePhoto;

public interface ArticlePhotoService {
    ArticlePhoto saveArticlePhoto(ArticlePhoto articlePhoto);

    ArticlePhoto getArticlePhoto(Integer id);
}
