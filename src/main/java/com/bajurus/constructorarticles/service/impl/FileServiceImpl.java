package com.bajurus.constructorarticles.service.impl;

import com.bajurus.constructorarticles.dao.FileDAO;
import com.bajurus.constructorarticles.model.File;
import com.bajurus.constructorarticles.service.FileService;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {

    private final FileDAO fileDAO;

    public FileServiceImpl(FileDAO fileDAO) {
        this.fileDAO = fileDAO;
    }

    @Override
    public File saveImage(File file) {
        return fileDAO.saveImage(file);
    }

    @Override
    public File getImage(Integer id) {
        return fileDAO.getImage(id);
    }
}
