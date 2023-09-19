package com.aditya.booking.seat_layout.repository;

import com.aditya.booking.seat_layout.model.SeatLayout;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SeatLayoutRepository  extends MongoRepository<SeatLayout,String> {
    SeatLayout findSeatLayoutById(ObjectId id);
}
