package com.bajurus.constructorarticles.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "original_filename")
    private String originalFileName;
    @Column(name = "content_type")
    private String contentType;
    @Column(name = "size")
    private Integer size;
    @Lob
    @Column(name = "bytes")
    private byte[] bytes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Image() {
    }

    public Image(Integer id, String name, String originalFileName, String contentType, Integer size, byte[] bytes) {
        this.id = id;
        this.name = name;
        this.originalFileName = originalFileName;
        this.contentType = contentType;
        this.size = size;
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", originalFileName='" + originalFileName + '\'' +
                ", contentType='" + contentType + '\'' +
                ", size=" + size +
                ", bytes=" + Arrays.toString(bytes) +
                '}';
    }
}