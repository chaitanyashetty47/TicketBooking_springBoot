package com.aditya.booking.Movie.service;

import com.aditya.booking.Movie.model.Movie;
import com.aditya.booking.Movie.model.dto.MovieDTO;
import com.aditya.booking.Movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository m) {
        this.movieRepository = m;
    }

    public Page<MovieDTO> getMoviesPaginated(int page, int size, String baseUrl) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Movie> moviesPage = movieRepository.findAll(pageable);
        return moviesPage.map(movie -> converToDto(movie, baseUrl));
    }

    private MovieDTO converToDto(Movie movie, String baseUrl) {
        MovieDTO movieDto = new MovieDTO();
        movieDto.setId(movie.getId());
        movieDto.setTitle(movie.getTitle());
        movieDto.setReleaseDate(movie.getReleaseDate());
        movieDto.setGenre(movie.getGenre());
        movieDto.setImageLink(baseUrl + "/getImage/" + movie.getImageLink());
        movieDto.setYoutubeLink(movie.getYoutubeLink());
        return movieDto;
    }
}