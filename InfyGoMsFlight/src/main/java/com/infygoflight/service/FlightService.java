package com.infygoflight.service;

import java.util.List;

import com.infygoflight.dto.FlightsDTO;
import com.infygoflight.model.Flights;

public interface FlightService {
	public List<Flights> getAllFlights();
	public FlightsDTO getFlight(String id);
	public List<Flights> getRequiredFlights(String source, String destination, String date);
	public List<String> getAllSources();
	public List<String> getAllDestinations();
}
