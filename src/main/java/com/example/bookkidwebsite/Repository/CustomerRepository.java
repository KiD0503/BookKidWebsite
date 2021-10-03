package com.example.bookkidwebsite.Repository;

import com.example.bookkidwebsite.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT c FROM Customer c WHERE c.customerEmail = ?1")
    Customer findByEmail(String email);

}