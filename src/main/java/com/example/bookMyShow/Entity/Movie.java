package com.example.bookMyShow.Entity;

import java.util.ArrayList;
import java.util.List;

import com.example.bookMyShow.Dto.MovieDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movie_id;

    private String name;

    private int durationInMins;

    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY,mappedBy = "movie")
    private List<OneShow> shows=new ArrayList<>();

    public MovieDto toDTO() {
        MovieDto movieDTO = new MovieDto();
        movieDTO.setMovie_id(this.movie_id);
        movieDTO.setName(this.name);
        movieDTO.setDurationInMins(this.durationInMins);
        return movieDTO;
    }
}
