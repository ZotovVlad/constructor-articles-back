package com.bajurus.constructorarticles.model.dto;

import com.bajurus.constructorarticles.model.Image;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ArticleImageDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("fio")
    private String fio;
    @JsonProperty("email")
    private String email;
    @JsonProperty("author")
    private String author;
    @JsonProperty("annotation")
    private String annotation;
    @JsonProperty("keywords")
    private String keywords;
    @JsonProperty("type")
    private String type;
    @JsonProperty("date")
    private String date;
    @JsonProperty("resources")
    private ArrayList<Image> resources;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Image> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Image> resources) {
        this.resources = resources;
    }

    public ArticleImageDTO() {
    }

    public ArticleImageDTO(String id, String fio, String email, String author, String annotation, String keywords, String type, String date, ArrayList<Image> resources) {
        this.id = id;
        this.fio = fio;
        this.email = email;
        this.author = author;
        this.annotation = annotation;
        this.keywords = keywords;
        this.type = type;
        this.date = date;
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "ArticleImageDTO{" +
                "id='" + id + '\'' +
                ", fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                ", author='" + author + '\'' +
                ", annotation='" + annotation + '\'' +
                ", keywords='" + keywords + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", resources=" + resources +
                '}';
    }
}