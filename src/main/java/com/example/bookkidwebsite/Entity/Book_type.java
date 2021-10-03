package com.example.bookkidwebsite.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_types")
public class Book_type implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type_name")
    private String booktypeName;

    @Column(name = "desc_long")
    private String booktypeDescLong;

    @Column(name = "author")
    private String booktypeAuthor;

    @Column(name = "image")
    private String booktypeImage;

    @Column(name = "desc_short")
    private String booktypeDescShort;

    @Column(name = "is_deleted")
    private Boolean booktypeIsDeleted;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Book_type() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBooktypeName() {
        return booktypeName;
    }

    public void setBooktypeName(String booktypeName) {
        this.booktypeName = booktypeName;
    }

    public String getBooktypeDescLong() {
        return booktypeDescLong;
    }

    public void setBooktypeDescLong(String booktypeDescLong) {
        this.booktypeDescLong = booktypeDescLong;
    }

    public String getBooktypeAuthor() {
        return booktypeAuthor;
    }

    public void setBooktypeAuthor(String booktypeAuthor) {
        this.booktypeAuthor = booktypeAuthor;
    }

    public String getBooktypeImage() {
        return booktypeImage;
    }

    public void setBooktypeImage(String booktypeImage) {
        this.booktypeImage = booktypeImage;
    }

    public String getBooktypeDescShort() {
        return booktypeDescShort;
    }

    public void setBooktypeDescShort(String booktypeDescShort) {
        this.booktypeDescShort = booktypeDescShort;
    }

    public Boolean getBooktypeIsDeleted() {
        return booktypeIsDeleted;
    }

    public void setBooktypeIsDeleted(Boolean booktypeIsDeleted) {
        this.booktypeIsDeleted = booktypeIsDeleted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
