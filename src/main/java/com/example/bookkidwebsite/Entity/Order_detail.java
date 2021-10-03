package com.example.bookkidwebsite.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_details")
public class Order_detail implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderDetailID orderDetailId;


    @ManyToOne
    @MapsId("order_id")
    @JoinColumn(name = "order_id")
    private Order orders;

    @ManyToOne
    @MapsId("book_id")
    @JoinColumn(name = "book_id")
    private Book books;

    @Column(name = "price")
    private Double oderdetailPrice;

    @Column(name = "quantity")
    private Integer orderdetailQuantity;

    public OrderDetailID getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(OrderDetailID orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public Double getOderdetailPrice() {
        return oderdetailPrice;
    }

    public void setOderdetailPrice(Double oderdetailPrice) {
        this.oderdetailPrice = oderdetailPrice;
    }

    public Integer getOrderdetailQuantity() {
        return orderdetailQuantity;
    }

    public void setOrderdetailQuantity(Integer orderdetailQuantity) {
        this.orderdetailQuantity = orderdetailQuantity;
    }

    public Order_detail(OrderDetailID orderDetailId, Order orders, Book books, Double oderdetailPrice, Integer orderdetailQuantity) {
        this.orderDetailId = orderDetailId;
        this.orders = orders;
        this.books = books;
        this.oderdetailPrice = oderdetailPrice;
        this.orderdetailQuantity = orderdetailQuantity;
    }

    public Order_detail() {
    }
}
