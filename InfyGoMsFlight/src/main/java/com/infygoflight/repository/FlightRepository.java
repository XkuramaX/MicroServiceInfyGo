package com.infygoflight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygoflight.model.Flights;

public interface FlightRepository extends JpaRepository<Flights, String> {

}
