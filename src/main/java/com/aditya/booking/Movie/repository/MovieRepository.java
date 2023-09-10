package com.aditya.booking.Movie.repository;

import com.aditya.booking.Movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
