package com.vijay.UberRideSpringBootAPI.controllers;


import com.vijay.UberRideSpringBootAPI.models.UberRide;
import com.vijay.UberRideSpringBootAPI.repositories.UberRideRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class UberRideController {

    //@Autowired
    private final UberRideRepository uberRideRepository;

    public UberRideController(UberRideRepository uberRideRepository) {
        this.uberRideRepository = uberRideRepository;
    }

    @GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UberRide> getRides() {
        return uberRideRepository.findAll();
    }

    @GetMapping(value = "/ride/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UberRide getRide(@PathVariable long id){
        return uberRideRepository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                String.format("Invalid ride id %s", id)
                        )
                );
    }

    @PostMapping(value = "/ride", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UberRide createRide(@Valid @RequestBody UberRide uberRide) {
        return uberRideRepository.save(uberRide);
    }
}

