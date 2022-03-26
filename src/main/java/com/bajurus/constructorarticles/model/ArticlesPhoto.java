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
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource1", unique = true)
    private Image resource1;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource2", unique = true)
    private Image resource2;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource3", unique = true)
    private Image resource3;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource4", unique = true)
    private Image resource4;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource5", unique = true)
    private Image resource5;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource6", unique = true)
    private Image resource6;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource7", unique = true)
    private Image resource7;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource8", unique = true)
    private Image resource8;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource9", unique = true)
    private Image resource9;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource10", unique = true)
    private Image resource10;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Image getResource1() {
        return resource1;
    }

    public void setResource1(Image resource1) {
        this.resource1 = resource1;
    }

    public Image getResource2() {
        return resource2;
    }

    public void setResource2(Image resource2) {
        this.resource2 = resource2;
    }

    public Image getResource3() {
        return resource3;
    }

    public void setResource3(Image resource3) {
        this.resource3 = resource3;
    }

    public Image getResource4() {
        return resource4;
    }

    public void setResource4(Image resource4) {
        this.resource4 = resource4;
    }

    public Image getResource5() {
        return resource5;
    }

    public void setResource5(Image resource5) {
        this.resource5 = resource5;
    }

    public Image getResource6() {
        return resource6;
    }

    public void setResource6(Image resource6) {
        this.resource6 = resource6;
    }

    public Image getResource7() {
        return resource7;
    }

    public void setResource7(Image resource7) {
        this.resource7 = resource7;
    }

    public Image getResource8() {
        return resource8;
    }

    public void setResource8(Image resource8) {
        this.resource8 = resource8;
    }

    public Image getResource9() {
        return resource9;
    }

    public void setResource9(Image resource9) {
        this.resource9 = resource9;
    }

    public Image getResource10() {
        return resource10;
    }

    public void setResource10(Image resource10) {
        this.resource10 = resource10;
    }

    public ArticlesPhoto() {
    }

    public ArticlesPhoto(Integer id, String fio, String email, String author, String annotation, String keywords, String type, LocalDateTime date, Image resource1, Image resource2, Image resource3, Image resource4, Image resource5, Image resource6, Image resource7, Image resource8, Image resource9, Image resource10) {
        this.id = id;
        this.fio = fio;
        this.email = email;
        this.author = author;
        this.annotation = annotation;
        this.keywords = keywords;
        this.type = type;
        this.date = date;
        this.resource1 = resource1;
        this.resource2 = resource2;
        this.resource3 = resource3;
        this.resource4 = resource4;
        this.resource5 = resource5;
        this.resource6 = resource6;
        this.resource7 = resource7;
        this.resource8 = resource8;
        this.resource9 = resource9;
        this.resource10 = resource10;
    }

    @Override
    public String toString() {
        return "ArticlesPhoto{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                ", author='" + author + '\'' +
                ", annotation='" + annotation + '\'' +
                ", keywords='" + keywords + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", resource1=" + resource1 +
                ", resource2=" + resource2 +
                ", resource3=" + resource3 +
                ", resource4=" + resource4 +
                ", resource5=" + resource5 +
                ", resource6=" + resource6 +
                ", resource7=" + resource7 +
                ", resource8=" + resource8 +
                ", resource9=" + resource9 +
                ", resource10=" + resource10 +
                '}';
    }
}