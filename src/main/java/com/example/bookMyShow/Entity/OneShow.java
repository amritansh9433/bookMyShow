package com.example.bookMyShow.Entity;

import java.util.Date;

import com.example.bookMyShow.Dto.OneShowDto;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="OneShow")
public class OneShow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long show_id;
    private String show_name;
    private Date start;
    private Date end;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="movie_id",referencedColumnName = "movie_id")
    private Movie movie;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="theatre_id",referencedColumnName = "theatre_id")
    private Theatre theatre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="screen_id",referencedColumnName = "screen_id")
    private Screen screen;

    private Double priceOfTicket;

    public OneShowDto toDTO() {
        OneShowDto showDTO = new OneShowDto();
        showDTO.setShow_id(this.show_id);
        showDTO.setShow_name(this.show_name);
        showDTO.setPriceOfTicket(this.priceOfTicket);
        showDTO.setMoviename(movie.getName());
        showDTO.setTheatrename(theatre.getName());
        showDTO.setTheatrecity(theatre.getCity());
        return showDTO;
    }
}
