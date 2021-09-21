package com.infygobooking.rest.objs;

import java.util.List;

public class TicketRequestBody {
	private List<PassengerRequestBody> passengerList;

	public List<PassengerRequestBody> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<PassengerRequestBody> passengerList) {
		this.passengerList = passengerList;
	}

	public TicketRequestBody(List<PassengerRequestBody> passengerList) {
		super();
		this.passengerList = passengerList;
	}
	
	public TicketRequestBody() {
		
	}
	
}
