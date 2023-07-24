package com.example.bookMyShow.Dto;

import lombok.Data;

@Data
public class MovieDto {
    private Long movie_id;
    private String name;
    private int durationInMins;
}
