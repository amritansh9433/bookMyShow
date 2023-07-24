package com.example.bookMyShow.Entity;

import java.util.ArrayList;
import java.util.List;

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
@Table(name="Theatre")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theatre_id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="theatre")
    private List<Screen> screens=new ArrayList<>();

     @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy = "theatre")
     private List<OneShow> shows=new ArrayList<>();

    private String city;

    private Double longitude;

    private Double latitude;
}
