package com.infygoflight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygoflight.dto.FlightsDTO;
import com.infygoflight.model.Flights;
import com.infygoflight.service.FlightServiceImpl;

@RequestMapping("/api/flights")
@RestController
public class FlightController {

	public final FlightServiceImpl service;
	
	@Autowired
	public FlightController(FlightServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Flights> getAllFlights(){
		return service.getAllFlights();
	}
	
	@GetMapping("/{id}")
	public FlightsDTO getFlightById(@PathVariable String id) {
		return service.getFlight(id);
	}
	
	@GetMapping("/destinations")
	public List<String> getAllDestinations(){
		return service.getAllDestinations();
	}
	
	@GetMapping("/sources")
	public List<String> getAllSource() {
		return service.getAllSources();
	}
	
	@GetMapping("{source}/{destination}/{date}")
	public List<Flights> getRequiredFlights(@PathVariable String source,@PathVariable String destination,@PathVariable String date){
		System.out.println(source+" "+" "+ destination +" "+ date);
		return service.getRequiredFlights(source, destination, date);
	}
	
}
