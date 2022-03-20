package com.bajurus.constructorarticles.service.impl;

import com.bajurus.constructorarticles.dao.ImageDAO;
import com.bajurus.constructorarticles.model.Image;
import com.bajurus.constructorarticles.service.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageDAO imageDAO;

    public ImageServiceImpl(ImageDAO imageDAO) {
        this.imageDAO = imageDAO;
    }

    @Override
    public Image saveImage(Image image) {
        return imageDAO.saveImage(image);
    }

    @Override
    public Image getImage(Integer id) {
        return imageDAO.getImage(id);
    }
}
