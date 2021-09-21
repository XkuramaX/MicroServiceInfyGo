package com.infygoflight.dto;


import java.time.LocalDate;

import com.infygoflight.model.Flights;


public class FlightsDTO {
	
	private String id;
	private String airlines;
	private String source;
	private String destination;
	private Double fare;
	private LocalDate flightAvailableDate;
	private String departureTime;
	private String arrivalTime;
	private Integer seatCount;
	
	public FlightsDTO() {
		
	}
	
	public FlightsDTO(String id, String airlines, String source, String destination, Double fare, LocalDate flightAvailableDate, String departureTime, String arrivalTime, Integer seatCount) {
		
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public LocalDate getFlightAvailableDate() {
		return flightAvailableDate;
	}

	public void setFlightAvailableDate(LocalDate flightAvailableDate) {
		this.flightAvailableDate = flightAvailableDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}
	
	public static Flights prepareFlights(FlightsDTO flights) {
		Flights flight = new Flights();
		flight.setId(flights.getId());
		flight.setAirlines(flights.getAirlines());
		flight.setSource(flights.getSource());
		flight.setDestination(flights.getDestination());
		flight.setFare(flights.getFare());
		flight.setFlightAvailableDate(flights.getFlightAvailableDate());
		flight.setDepartureTime(flights.getDepartureTime());
		flight.setArrivalTime(flights.getArrivalTime());
		flight.setSeatCount(flights.getSeatCount());
		return flight;
	}
	
}
