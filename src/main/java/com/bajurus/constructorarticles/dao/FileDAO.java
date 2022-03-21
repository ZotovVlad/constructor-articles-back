package com.bajurus.constructorarticles.dao;

import com.bajurus.constructorarticles.model.File;

public interface FileDAO {
    File saveImage(File file);

    File getImage(Integer id);
}
