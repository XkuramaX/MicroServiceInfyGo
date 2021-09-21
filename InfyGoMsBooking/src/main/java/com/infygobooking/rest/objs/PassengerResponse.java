package com.infygobooking.rest.objs;

import com.infygobooking.dto.TicketDTO;

public class PassengerResponse {
	
	public PassengerResponse() {
		
	}
	
	public PassengerResponse(String passengerId, String passengerName, String passengerAge, String passengerGender,
			TicketDTO ticket) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.ticket = ticket;
	}
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(String passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public TicketDTO getTicket() {
		return ticket;
	}
	public void setTicket(TicketDTO ticket) {
		this.ticket = ticket;
	}
	private String passengerId;
	private String passengerName;
	private String passengerAge;
	private String passengerGender;
	private TicketDTO ticket;
	
}
