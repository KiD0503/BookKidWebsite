package com.example.bookkidwebsite.Entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Collection<Order> orders;

    @NotNull(message = "Full Name can not be empty!")
    @Min(value = 4,message = "Please enter your real name!")
    @Column(name = "fullname")
    private String customerFullName;

    @Column(name = "address")
    private String customerAddress;

    @Column(name = "phonenumber")
    private String customerPhoneNumber;

    @Column(name = "email")
    private String customerEmail;

    @Min(value = 8, message = "Your password not strong!")
    @Column(name = "password")
    private String customerPassword;

    @Column(name = "is_deleted")
    private Boolean customerIsDeleted;

    public Boolean getCustomerIsDeleted() {
        return customerIsDeleted;
    }

    public void setCustomerIsDeleted(Boolean customerIsDeleted) {
        this.customerIsDeleted = customerIsDeleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public Customer() {
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }
}
