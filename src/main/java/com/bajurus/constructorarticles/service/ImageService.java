package com.bajurus.constructorarticles.service;

import com.bajurus.constructorarticles.model.Image;

public interface ImageService {
    Image saveImage(Image image);

    Image getImage(Integer id);
}
