package com.example.bookkidwebsite.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private Collection<Order_detail> order_details;

    @Column(name = "total_price")
    private Double orderTotalPrice;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "total_book")
    private Integer orderTotalBook;

    @Column(name = "address")
    private String orderAddress;

    @Column(name = "phonenumber")
    private String orderPhoneNumber;

    @Column(name = "fullname")
    private String orderFullName;

    @Column(name = "status")
    private Integer orderStatus;

    @Column(name = "order_delivery")
    private Date orderDelivery;

    @Column(name = "is_rejected")
    private Boolean orderIsRejected;

    @Column(name = "is_deleted")
    private Boolean orderIsDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<Order_detail> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(Collection<Order_detail> order_details) {
        this.order_details = order_details;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderTotalBook() {
        return orderTotalBook;
    }

    public void setOrderTotalBook(Integer orderTotalBook) {
        this.orderTotalBook = orderTotalBook;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderPhoneNumber() {
        return orderPhoneNumber;
    }

    public void setOrderPhoneNumber(String orderPhoneNumber) {
        this.orderPhoneNumber = orderPhoneNumber;
    }

    public String getOrderFullName() {
        return orderFullName;
    }

    public void setOrderFullName(String orderFullName) {
        this.orderFullName = orderFullName;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(Date orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public Boolean getOrderIsRejected() {
        return orderIsRejected;
    }

    public void setOrderIsRejected(Boolean orderIsRejected) {
        this.orderIsRejected = orderIsRejected;
    }

    public Boolean getOrderIsDeleted() {
        return orderIsDeleted;
    }

    public void setOrderIsDeleted(Boolean orderIsDeleted) {
        this.orderIsDeleted = orderIsDeleted;
    }

    public Order() {
    }


}
