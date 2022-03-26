package com.bajurus.constructorarticles.dao.impl;

import com.bajurus.constructorarticles.dao.ArticlePhotoDAO;
import com.bajurus.constructorarticles.model.ArticlePhoto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticlePhotoDAOImpl implements ArticlePhotoDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public ArticlePhoto saveArticlePhoto(ArticlePhoto articlePhoto) {
        Session session = sessionFactory.getCurrentSession();
        session.save(articlePhoto);
        return articlePhoto;
    }

    @Override
    public ArticlePhoto getArticlePhoto(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(ArticlePhoto.class, id);
    }
}
