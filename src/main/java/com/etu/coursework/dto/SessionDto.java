package com.etu.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SessionDto {
    @NotNull
    @Positive
    private Integer id;
    @NotNull
    @Positive
    private Integer hallId;
    @NotNull
    @Positive
    private Integer movieId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date startTime;
    @NotNull
    @Positive
    private BigDecimal price;
    @NotNull
    @Positive
    private Integer soldTickets;
}
