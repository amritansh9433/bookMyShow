package com.example.bookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookMyShow.Entity.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Long>{
    
}
