package com.etu.coursework.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "halls")
public class HallEntity {
    @Id
    @Column(name = "hall_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hall_number")
    private Integer hallNumber;

    @Column(name = "hall_name")
    private String hallName;

    @Column(name = "capacity")
    private Integer capacity;
}
