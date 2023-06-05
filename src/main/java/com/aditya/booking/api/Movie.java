package com.aditya.booking.api;

import com.aditya.booking.DataTableMaker;
import com.aditya.booking.api.subTypes.Casts;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@JsonSerialize
@Getter
@Setter
@Entity
@Table

public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @NotNull
    private  String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @NotNull
    private List<Casts> cast;
    @NotNull
    private  String thumbnail;
    @NotNull
    private  String image;

    public  Movie( String name,String thumbnail,String image,List<Casts> cast){

        this.name = name;
        this.thumbnail = thumbnail;
        this.image = image;
        this.cast = cast;
    }


    public Movie() {

    }

    public static void main(String args[]){

    }
}
