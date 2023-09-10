package com.aditya.booking.movie.controllers;

import com.aditya.booking.movie.model.dto.MovieDTO;
import com.aditya.booking.movie.service.MovieService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;
    private final HttpServletRequest request;

    @Autowired
    public MovieController(MovieService movieService, HttpServletRequest request) {
        this.movieService = movieService;
        this.request = request;
    }

    @GetMapping("/fetchMovies")
    public ResponseEntity<Page<MovieDTO>> getAllMovies(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        // Get the base URL from the HttpServletRequest object
        String baseUrl = request.getRequestURL().toString();
        String baseApiUrl = baseUrl.substring(0, baseUrl.length() - request.getRequestURI().length()) + request.getContextPath();

        Page<MovieDTO> movies = movieService.getMoviesPaginated(page, size, baseApiUrl);
        System.out.println("Hitting data");
        return ResponseEntity.ok(movies);
    }
}
