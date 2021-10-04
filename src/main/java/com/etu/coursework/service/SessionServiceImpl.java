package com.etu.coursework.service;

import com.etu.coursework.dto.SessionDto;
import com.etu.coursework.entity.SessionEntity;
import com.etu.coursework.repository.SessionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public SessionDto getSession(Integer id) {
        Optional<SessionEntity> sessionEntity = repository.findById(id);
        SessionDto sessionDto = modelMapper.map(sessionEntity.get(), SessionDto.class);
        return sessionDto;
    }
}
