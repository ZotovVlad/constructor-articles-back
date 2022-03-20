package com.bajurus.constructorarticles.dao;

import com.bajurus.constructorarticles.model.Image;

public interface ImageDAO {
    Image saveImage(Image image);

    Image getImage(Integer id);
}
