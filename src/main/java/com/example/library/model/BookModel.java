package com.example.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class BookModel {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="CUST_SEQ")
    private int id;
    private String title;
    private String image;
    private String description;
    private String releasedYear;
    private String price;
    private String author;

    public BookModel() {
    }

    public BookModel(int id, String title, String image, String description, String releasedYear, String price, String author) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.releasedYear = releasedYear;
        this.price = price;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
