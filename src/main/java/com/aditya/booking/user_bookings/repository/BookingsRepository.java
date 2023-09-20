package com.aditya.booking.user_bookings.repository;

import com.aditya.booking.user_bookings.model.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingsRepository extends JpaRepository<Bookings,Integer> {

    List<Bookings> findByShowId(int id);
 }
