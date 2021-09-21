package com.infygoflight.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygoflight.dto.FlightsDTO;
import com.infygoflight.model.Flights;
import com.infygoflight.repository.FlightRepository;

@Service("flightService")
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository repo;
	
	@Override
	public List<Flights> getAllFlights() {
		List<Flights> allFlights = repo.findAll();
		return allFlights;
	}

	@Override
	public FlightsDTO getFlight(String id) {
		FlightsDTO requiredFlight = repo.findById(id).isPresent()? Flights.prepareFlightsDTO(repo.findById(id).get()): null;
		return requiredFlight;
	}

	@Override
	public List<Flights> getRequiredFlights(String source, String destination, String date) {
		// TODO Auto-generated method stub
		LocalDate day = LocalDate.parse(date);
		List<Flights> requiredFlights = repo.findAll();
		List<Flights> response = requiredFlights.stream().filter((flight)-> flight.getDestination().equals(destination) && flight.getFlightAvailableDate().equals(day) && flight.getSource().equals(source)).toList();
		return response;
	}

	@Override
	public List<String> getAllSources() {
		// TODO Auto-generated method stub
		List<Flights> allFlights = getAllFlights();
		List<String> allSources = new ArrayList<>();
		for(Flights flight : allFlights) {
			allSources.add(flight.getSource());
		}
		allSources.sort((a,b)->a.compareToIgnoreCase(b));
		return allSources;
	}

	@Override
	public List<String> getAllDestinations() {
		// TODO Auto-generated method stub
		List<Flights> allFlights = getAllFlights();
		List<String> allDestinations = new ArrayList<>();
		for(Flights flight : allFlights) {
			allDestinations.add(flight.getDestination());
		}
		allDestinations.sort((a,b)->a.compareToIgnoreCase(b));
		return allDestinations;
	}

}
