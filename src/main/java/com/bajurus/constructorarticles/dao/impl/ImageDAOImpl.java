package com.bajurus.constructorarticles.dao.impl;

import com.bajurus.constructorarticles.dao.ImageDAO;
import com.bajurus.constructorarticles.model.Image;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDAOImpl implements ImageDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Image saveImage(Image image) {
        Session session = sessionFactory.getCurrentSession();
        session.save(image);
        return image;
    }

    @Override
    public Image getImage(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Image.class, id);
    }
}
