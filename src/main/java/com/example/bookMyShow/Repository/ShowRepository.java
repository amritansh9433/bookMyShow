package com.example.bookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookMyShow.Entity.OneShow;

@Repository
public interface ShowRepository extends JpaRepository<OneShow,Long>{
    
}
