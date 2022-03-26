package com.bajurus.constructorarticles.service.impl;

import com.bajurus.constructorarticles.dao.ArticlePhotoDAO;
import com.bajurus.constructorarticles.model.ArticlePhoto;
import com.bajurus.constructorarticles.service.ArticlePhotoService;
import org.springframework.stereotype.Service;

@Service
public class ArticlePhotoServiceImpl implements ArticlePhotoService {

    private final ArticlePhotoDAO articlePhotoDAO;

    public ArticlePhotoServiceImpl(ArticlePhotoDAO articlePhotoDAO) {
        this.articlePhotoDAO = articlePhotoDAO;
    }

    @Override
    public ArticlePhoto saveArticlePhoto(ArticlePhoto articlePhoto) {
        return articlePhotoDAO.saveArticlePhoto(articlePhoto);
    }

    @Override
    public ArticlePhoto getArticlePhoto(Integer id) {
        return articlePhotoDAO.getArticlePhoto(id);
    }
}
