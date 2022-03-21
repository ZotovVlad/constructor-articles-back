package com.bajurus.constructorarticles.dao.impl;

import com.bajurus.constructorarticles.dao.FileDAO;
import com.bajurus.constructorarticles.model.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileDAOImpl implements FileDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public File saveImage(File file) {
        Session session = sessionFactory.getCurrentSession();
        session.save(file);
        return file;
    }

    @Override
    public File getImage(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(File.class, id);
    }
}
