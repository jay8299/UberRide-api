package com.vijay.UberRideSpringBootAPI.repositories;

import com.vijay.UberRideSpringBootAPI.models.UberRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UberRideRepository extends CrudRepository<UberRide, Long> {

    List<UberRide> findByName(String name);
}

