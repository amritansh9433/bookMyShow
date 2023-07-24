package com.example.bookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookMyShow.Entity.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Long>{
    
}
