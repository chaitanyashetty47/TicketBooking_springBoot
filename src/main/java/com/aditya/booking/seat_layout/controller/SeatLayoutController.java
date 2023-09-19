package com.aditya.booking.seat_layout.controller;


import com.aditya.booking.seat_layout.model.SeatLayout;
import com.aditya.booking.seat_layout.repository.SeatLayoutRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatLayoutController {


    @Autowired
    SeatLayoutRepository seatLayoutRepository;

    @GetMapping("/getSeatLayoutByID/")
    SeatLayout getSeatLayoutByID(){
        SeatLayout test =  seatLayoutRepository.findSeatLayoutById(new ObjectId("6506c36fd523c19c07612283"));

        test.getObjAreaTest().get(1).getObjRow().get(0).getObjSeat().get(0).setSeatStatus("120");

        return  test;
    }
}
