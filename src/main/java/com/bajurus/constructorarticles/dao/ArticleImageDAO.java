package com.bajurus.constructorarticles.dao;

import com.bajurus.constructorarticles.model.ArticleImage;

public interface ArticleImageDAO {

    ArticleImage saveArticleImage(ArticleImage articleImage);

    ArticleImage getArticleImage(Integer id);
}