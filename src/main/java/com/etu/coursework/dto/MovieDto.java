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
public class MovieDto {
    @NotNull
    @Positive
    private Integer id;
    @NotBlank
    private String title;
    @NotBlank
    private String country;
    @NotBlank
    private String genre;
    @NotNull
    @Positive
    private Integer duration;
}
