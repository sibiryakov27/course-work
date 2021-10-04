package com.etu.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class HallDto {
    @NotNull
    @Positive
    private Integer id;
    @NotNull
    @Positive
    private Integer hallNumber;
    private String hallName;
    @NotNull
    @Positive
    private Integer capacity;
}
