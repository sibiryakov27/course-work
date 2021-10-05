package com.etu.coursework.service;

import com.etu.coursework.dto.MovieDto;
import com.etu.coursework.entity.MovieEntity;
import com.etu.coursework.repository.MovieRepository;
import com.etu.coursework.exception.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public MovieDto getMovie(Integer id) {
        Optional<MovieEntity> movieEntity = repository.findById(id);
        if (movieEntity.isEmpty()) {
            throw new NotFoundException("Movie with that id: " + id + " cannot be found");
        }
        MovieDto movieDto = modelMapper.map(movieEntity.get(), MovieDto.class);

        return movieDto;
    }
}
