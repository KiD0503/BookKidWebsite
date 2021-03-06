package com.example.bookkidwebsite.Repository;

import com.example.bookkidwebsite.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT u FROM User u WHERE u.userEmail = ?1")
    public User findByEmail(String email);
}
