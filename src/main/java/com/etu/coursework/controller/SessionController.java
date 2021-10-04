package com.etu.coursework.controller;

import com.etu.coursework.dto.SessionDto;
import com.etu.coursework.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/{id}")
    public SessionDto getSession(@PathVariable Integer id) {
        return sessionService.getSession(id);
    }

}
