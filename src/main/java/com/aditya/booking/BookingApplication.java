package com.aditya.booking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}


//	@Bean
//	CommandLineRunner init(MakeTableFordData makeTableFordData) {
//		return args -> {
//			makeTableFordData.insertMovieData();
//		};
//	}
}
