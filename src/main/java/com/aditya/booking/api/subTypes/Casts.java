package com.aditya.booking.api.subTypes;


import com.aditya.booking.api.Movie;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Casts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private      long id;

    @Column
    private  String name;
    @Column
    private  String image;

    @ManyToOne
    private Movie movie;


    public Casts(String img,String name){
        this.image = img;
        this.name = name;
    }


    public Casts() {

    }
}
