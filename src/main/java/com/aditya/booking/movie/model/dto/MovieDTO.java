package com.aditya.booking.movie.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class MovieDTO {
    private Long id ;
    private String title;

    private LocalDate releaseDate;
    private String genre;
    private String imageLink;
    private String youtubeLink;
}
