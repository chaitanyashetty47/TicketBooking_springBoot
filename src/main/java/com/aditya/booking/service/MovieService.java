package com.aditya.booking.service;

import com.aditya.booking.model.MovieNew;
import com.aditya.booking.model.MovieDTO;
import com.aditya.booking.repository.MovieRepository;
import jakarta.servlet.http.HttpServletRequest;
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
        Page<MovieNew> moviesPage = movieRepository.findAll(pageable);
        return moviesPage.map(movie -> converToDto(movie, baseUrl));
    }

    private MovieDTO converToDto(MovieNew movie, String baseUrl) {
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