package com.aditya.booking;

import com.aditya.booking.api.Movie;
import com.aditya.booking.api.subTypes.Casts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MakeTableFordData {

    @Autowired
    private DataTableMaker repo;

    public void insertMovieData() {
        List<Casts> casts = new ArrayList<>();
        casts.add(new Casts("Aditya Salunke", ""));
        repo.save(new Movie("ATLA", "", "", casts));

        casts.clear();
        casts.add(new Casts("Ariba Salunke", ""));
        repo.save(new Movie("Avengers", "", "", casts));

        casts.clear();
        casts.add(new Casts("Pratik Salunke", ""));
        repo.save(new Movie("Dhoom", "", "", casts));
    }
}
