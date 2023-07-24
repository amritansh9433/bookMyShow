package com.example.bookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookMyShow.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
    
}
