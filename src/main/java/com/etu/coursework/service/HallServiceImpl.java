package com.etu.coursework.service;

import com.etu.coursework.dto.HallDto;
import com.etu.coursework.entity.HallEntity;
import com.etu.coursework.repository.HallRepository;
import com.etu.coursework.exception.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HallServiceImpl implements HallService {

    @Autowired
    private HallRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public HallDto getHall(Integer id) {
        Optional<HallEntity> hallEntity = repository.findById(id);
        if (hallEntity.isEmpty()) {
            throw new NotFoundException("Hall with that id: " + id + " cannot be found");
        }
        HallDto hallDto = modelMapper.map(hallEntity.get(), HallDto.class);

        return hallDto;
    }
}
