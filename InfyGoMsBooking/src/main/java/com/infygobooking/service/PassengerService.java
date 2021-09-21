package com.infygobooking.service;

import java.util.List;

import com.infygobooking.dto.PassengerDTO;
import com.infygobooking.model.Passenger;
import com.infygobooking.rest.objs.PassengerRequestBody;

public interface PassengerService {
	public List<Passenger> getAllPassengers();
	public PassengerDTO getPassenger(String id);
	public PassengerDTO createPassenger(PassengerRequestBody req, String pnr);
}
