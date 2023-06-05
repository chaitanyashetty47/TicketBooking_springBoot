package com.aditya.booking;

import com.aditya.booking.api.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataTableMaker extends JpaRepository<Movie, Long> {
}
