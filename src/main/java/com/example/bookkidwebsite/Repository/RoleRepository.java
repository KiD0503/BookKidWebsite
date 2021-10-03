package com.example.bookkidwebsite.Repository;

import com.example.bookkidwebsite.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    @Query("SELECT r FROM Role r WHERE r.roleName = ?1")
    public Role findByName(String name);
}