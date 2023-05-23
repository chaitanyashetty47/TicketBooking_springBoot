package com.aditya.booking.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@JsonSerialize
@Getter
@Setter
public class Movie {
    private final int id;
    private final String name;

    private final String thumbnail;
    private final String image;

    public  Movie(int id ,String name,String thumbnail,String image){
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.image = image;
    }

}
