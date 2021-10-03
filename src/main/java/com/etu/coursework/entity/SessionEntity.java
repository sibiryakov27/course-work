package com.etu.coursework.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "sessions")
public class SessionEntity {
    @Id
    @Column(name = "session_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hall_id")
    private Integer hallId;

    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "price")
    private Double price;

    @Column(name = "sold_tickets")
    private Integer soldTickets;
}
