package com.bajurus.constructorarticles.dao;

import com.bajurus.constructorarticles.model.ArticlePhoto;

public interface ArticlePhotoDAO {

    ArticlePhoto saveArticlePhoto(ArticlePhoto articlePhoto);

    ArticlePhoto getArticlePhoto(Integer id);
}
