package com.etu.coursework.controller;

import com.etu.coursework.dto.HallDto;
import com.etu.coursework.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/halls")
public class HallController {
    @Autowired
    private HallService hallService;

    @GetMapping("/{id}")
    public HallDto getHall(@PathVariable Integer id) {
        return hallService.getHall(id);
    }
}
