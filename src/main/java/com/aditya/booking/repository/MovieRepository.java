package com.aditya.booking.repository;

import com.aditya.booking.model.MovieNew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieNew,Long> {

}
