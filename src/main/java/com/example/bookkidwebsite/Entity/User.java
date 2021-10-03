package com.example.bookkidwebsite.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.Set;

@Table(name = "users")
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Collection<Book> books;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Collection<Book_type> book_types;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    @Column(name = "fullname")
    private String userFullName;

    @Column(name = "address")
    private String userAddress;

    @Column(name = "phonenumber")
    private String userPhonenumber;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "role")
    private String userRole;

    @Column(name = "end_job_date")
    private Date userEndJobDate;

    @Column(name = "start_job_date")
    private Date userStartJobDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public Collection<Book_type> getBook_types() {
        return book_types;
    }

    public void setBook_types(Collection<Book_type> book_types) {
        this.book_types = book_types;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Date getUserEndJobDate() {
        return userEndJobDate;
    }

    public void setUserEndJobDate(Date userEndJobDate) {
        this.userEndJobDate = userEndJobDate;
    }

    public Date getUserStartJobDate() {
        return userStartJobDate;
    }

    public void setUserStartJobDate(Date userStartJobDate) {
        this.userStartJobDate = userStartJobDate;
    }

    public User() {
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }
}
