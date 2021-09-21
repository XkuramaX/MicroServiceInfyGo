package com.infygobooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infygobooking.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, String> {

}
