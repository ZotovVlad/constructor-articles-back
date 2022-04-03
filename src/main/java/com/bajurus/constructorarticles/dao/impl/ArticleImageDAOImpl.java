package com.bajurus.constructorarticles.dao.impl;

import com.bajurus.constructorarticles.dao.ArticleImageDAO;
import com.bajurus.constructorarticles.model.ArticleImage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleImageDAOImpl implements ArticleImageDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public ArticleImage saveArticleImage(ArticleImage articleImage) {
        Session session = sessionFactory.getCurrentSession();
        session.save(articleImage);
        return articleImage;
    }

    @Override
    public ArticleImage getArticleImage(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(ArticleImage.class, id);
    }

    @Override
    public List<ArticleImage> getAllArticleImage() {
        Session session = sessionFactory.getCurrentSession();
        return session.createSQLQuery("SELECT * FROM articles_image").addEntity(ArticleImage.class).list();
    }
}