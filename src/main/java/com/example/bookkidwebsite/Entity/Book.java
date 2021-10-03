package com.example.bookkidwebsite.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

@Table(name = "books")
@Entity
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_type_id")
    private Book_type book_type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private Collection<Order_detail> order_details;

    @Column(name = "manufacturing_date")
    private Date bookManufacturingDate;

    @Column(name = "publisher")
    private String bookPublisher;

    @Column(name = "title")
    private String bookTitle;

    @Column(name = "price")
    private Double bookPrice;

    @Column(name = "quantity")
    private Integer bookQuantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book_type getBook_type() {
        return book_type;
    }

    public void setBook_type(Book_type book_type) {
        this.book_type = book_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getBookManufacturingDate() {
        return bookManufacturingDate;
    }

    public void setBookManufacturingDate(Date bookManufacturingDate) {
        this.bookManufacturingDate = bookManufacturingDate;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(Integer bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public Collection<Order_detail> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(Collection<Order_detail> order_details) {
        this.order_details = order_details;
    }
}
