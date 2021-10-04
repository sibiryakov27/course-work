package com.etu.coursework.controller;

import com.etu.coursework.dto.MovieDto;
import com.etu.coursework.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{id}")
    public MovieDto getMovie(@PathVariable Integer id) {
        return movieService.getMovie(id);
    }

}
