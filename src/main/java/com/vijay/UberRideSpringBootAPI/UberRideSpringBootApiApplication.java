package com.vijay.UberRideSpringBootAPI;

import com.vijay.UberRideSpringBootAPI.models.UberRide;
import com.vijay.UberRideSpringBootAPI.repositories.UberRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UberRideSpringBootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberRideSpringBootApiApplication.class, args);
	}
	@Bean
	public CommandLineRunner sampleData(UberRideRepository repository) {
		return (args) -> {
			repository.save(new UberRide("Tata Safari", "A ride that speeds you along.", 5, 3));
			repository.save(new UberRide("Audi Q8", "A ride with plenty of splashes.", 3, 6));
			repository.save(new UberRide("BMW Class C", "Spinning ride in a giant cup of comfort.", 2, 10));
		};
	}
}
