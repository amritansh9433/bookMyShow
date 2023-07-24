package com.example.bookMyShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookMyShow.Entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{
    public Movie findByName(String name);
    public List<Movie> findByNameContaining(String name);
}
