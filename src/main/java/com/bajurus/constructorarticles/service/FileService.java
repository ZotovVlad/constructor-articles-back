package com.bajurus.constructorarticles.service;

import com.bajurus.constructorarticles.model.File;

public interface FileService {
    File saveImage(File file);

    File getImage(Integer id);
}
