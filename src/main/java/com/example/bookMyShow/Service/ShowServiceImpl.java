package com.example.bookMyShow.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookMyShow.Dto.OneShowDto;
import com.example.bookMyShow.Entity.OneShow;
import com.example.bookMyShow.Repository.ShowRepository;

@Service
public class ShowServiceImpl implements ShowService{
   
    @Autowired
    public ShowRepository showRepository;

    public List<OneShowDto> getAllShows(){
        List<OneShow> allShows=showRepository.findAll();
        List<OneShowDto> allShowsDto=new ArrayList<>();
        for(OneShow os:allShows){
            OneShowDto showDTO=os.toDTO();
            allShowsDto.add(showDTO);
        }
        return allShowsDto;
    }

    @Override
    public List<OneShowDto> getAllShowsOfMovie(String movieName) {
        List<OneShow> allShows=showRepository.findAll();
        List<OneShowDto> allShowsDto=new ArrayList<>();
        for(OneShow os:allShows){
            OneShowDto showDTO=os.toDTO();
            if(showDTO.getMoviename().toLowerCase().equals(movieName.toLowerCase())){
            allShowsDto.add(showDTO);
            }
        }
        return allShowsDto;
    }

    @Override
    public List<OneShowDto> getAllShowsInCity(String city) {
        List<OneShow> allShows=showRepository.findAll();
        List<OneShowDto> allShowsDto=new ArrayList<>();
        for(OneShow os:allShows){
            OneShowDto showDTO=os.toDTO();
            if(showDTO.getTheatrecity().toLowerCase().equals(city.toLowerCase())){
            allShowsDto.add(showDTO);
            }
        }
        return allShowsDto;
    }
    
}
