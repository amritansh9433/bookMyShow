package com.example.bookMyShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookMyShow.Dto.OneShowDto;
import com.example.bookMyShow.Service.ShowService;

@RestController
@RequestMapping("/shows")
public class ShowController {

    @Autowired
    private ShowService showService;
    
    @GetMapping("/All")
    public List<OneShowDto> getAllShows(){
        return showService.getAllShows();
    }

    @GetMapping("/showOfMovie/{movieName}")
    public List<OneShowDto> getShowsOfMovie(@PathVariable String movieName){
        return showService.getAllShowsOfMovie(movieName);
    }

    @GetMapping("/showInCity/{city}")
    public List<OneShowDto> getShowsInCity(@PathVariable String city){
        return showService.getAllShowsInCity(city);
    }
}
