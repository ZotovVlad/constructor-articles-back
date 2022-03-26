package com.bajurus.constructorarticles.service.impl;

import com.bajurus.constructorarticles.dao.ArticleImageDAO;
import com.bajurus.constructorarticles.model.ArticleImage;
import com.bajurus.constructorarticles.service.ArticleImageService;
import org.springframework.stereotype.Service;

@Service
public class ArticleImageServiceImpl implements ArticleImageService {

    private final ArticleImageDAO articleImageDAO;

    public ArticleImageServiceImpl(ArticleImageDAO articleImageDAO) {
        this.articleImageDAO = articleImageDAO;
    }

    @Override
    public ArticleImage saveArticleImage(ArticleImage articleImage) {
        return articleImageDAO.saveArticleImage(articleImage);
    }

    @Override
    public ArticleImage getArticleImage(Integer id) {
        return articleImageDAO.getArticleImage(id);
    }
}