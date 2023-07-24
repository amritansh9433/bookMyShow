package com.example.bookMyShow.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookMyShow.Dto.OneShowDto;

@Service
public interface ShowService{
    public List<OneShowDto> getAllShows();
    public List<OneShowDto> getAllShowsOfMovie(String movieName);
    public List<OneShowDto> getAllShowsInCity(String city);
}
