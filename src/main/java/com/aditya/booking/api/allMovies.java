package com.aditya.booking.api;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class allMovies {




    @GetMapping("/getAll")
    public ResponseEntity<List<Movie>> getAll(){
        List<String> cast = new ArrayList<String>();
        Movie temp = new Movie(1 ,"Aditya" ,"","");
//
        List<Movie> arr = new ArrayList<Movie>();
     for(int i = 0;i<10;i++){
            arr.add(temp);
       }

        return ResponseEntity.ok(arr);
    }
}
