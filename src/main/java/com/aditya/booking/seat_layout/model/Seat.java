package com.aditya.booking.seat_layout.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "seat-layout")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Seat {
    @Field
    private int GridSeatNum;
    @Field
    private String SeatStatus;
    @Field
    private int seatNumber;

}
