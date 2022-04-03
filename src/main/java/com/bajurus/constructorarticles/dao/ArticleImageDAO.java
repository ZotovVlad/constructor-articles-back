package com.bajurus.constructorarticles.dao;

import com.bajurus.constructorarticles.model.ArticleImage;

import java.util.List;

public interface ArticleImageDAO {

    ArticleImage saveArticleImage(ArticleImage articleImage);

    ArticleImage getArticleImage(Integer id);

    List<ArticleImage> getAllArticleImage();
}