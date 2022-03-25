package com.bajurus.constructorarticles.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "articles_photo")
public class ArticlesPhoto {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fio")
    private String fio;
    @Column(name = "email")
    private String email;
    @Column(name = "author")
    private String author;
    @Column(name = "annotation")
    private String annotation;
    @Column(name = "keywords")
    private String keywords;
    @Column(name = "type")
    private String type;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "resource1")
    private Integer resource1;
    @Column(name = "resource2")
    private Integer resource2;
    @Column(name = "resource3")
    private Integer resource3;
    @Column(name = "resource4")
    private Integer resource4;
    @Column(name = "resource5")
    private Integer resource5;
    @Column(name = "resource6")
    private Integer resource6;
    @Column(name = "resource7")
    private Integer resource7;
    @Column(name = "resource8")
    private Integer resource8;
    @Column(name = "resource9")
    private Integer resource9;
    @Column(name = "resource10")
    private Integer resource10;


}