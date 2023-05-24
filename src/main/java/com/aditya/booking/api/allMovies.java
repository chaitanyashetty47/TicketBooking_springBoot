package com.aditya.booking.api;

import org.springframework.data.domain.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class allMovies {

    @GetMapping("/list")
    public ResponseEntity<Page<Movie>> getAll(Pageable pageable) {
        List<String> cast = new ArrayList<>();

        List<Movie> movieList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                Movie temp = new Movie(i, "Aditya", "", "");
                movieList.add(temp);
            } else {
                Movie temp = new Movie(i, "Raditya", "", "");
                movieList.add(temp);
            }
        }

        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        int totalSize = movieList.size();

        List<Movie> pagedMovies;

        if (totalSize < startItem) {
            pagedMovies = new ArrayList<>();
        } else {
            int toIndex = Math.min(startItem + pageSize, totalSize);
            pagedMovies = movieList.subList(startItem, toIndex);
        }

//        Sort sort = pageable.getSort();
//        if (sort.isSorted()) {
//            List<Sort.Order> orders = new ArrayList<>();
//            sort.forEach(order -> {
//                String property = order.getProperty();
//                Sort.Direction direction = order.getDirection();
//                orders.add(new Sort.Order(direction, property));
//            });
//
//            Sort sorted = Sort.by(orders);
//
//            // Apply sorting to the pagedMovies list
//            pagedMovies.sort(new Comparator<Movie>() {
//                @Override
//                public int compare(Movie movie1, Movie movie2) {
//                    if (sorted.getOrderFor("name").isAscending()) {
//                        return Integer.compare(movie1.getId(), movie2.getId());
//                    } else {
//                        return Integer.compare(movie2.getId(), movie1.getId());
//                    }
//                }
//            });
//        }

        Page<Movie> moviePage = new PageImpl<>(pagedMovies, PageRequest.of(currentPage, pageSize), totalSize);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(moviePage);
    }

}
