package com.aditya.booking.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "movies")
public class MovieNew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate releaseDate;
    private String genre;
    private String imageLink;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String youtubeLink;
}
