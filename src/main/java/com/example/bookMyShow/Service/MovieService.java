package com.example.bookMyShow.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookMyShow.Dto.MovieDto;
import com.example.bookMyShow.Entity.Movie;

@Service
public interface MovieService{
    public List<MovieDto> getAllMovies();

    public MovieDto getMovieByName(String name);

    public List<MovieDto> getMoviesByNameConatining(String name);
}
