package com.aditya.booking.seat_layout.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "seat-layout")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatLayout {
    @Id
    private String id;

    @Field(name = "seatLayout.colAreas.intMaxSeatId")
    private int intTest ;

    @Field(name = "seatLayout.colAreas.intMinSeatId")
    private int intMinSeatID;


    @Field(name = "seatLayout.colAreas.objArea" )
    private ArrayList<Area> objAreaTest;
}

