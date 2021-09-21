package com.infygobooking.rest.objs;

import java.util.List;

public class TicketResponse {
	private String pnr;
	private Double totalFare;
	private List<PassengerResponse> passengerList;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public Double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}
	public List<PassengerResponse> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<PassengerResponse> passengerList) {
		this.passengerList = passengerList;
	}
	public TicketResponse(String pnr, Double totalFare, List<PassengerResponse> passengerList) {
		super();
		this.pnr = pnr;
		this.totalFare = totalFare;
		this.passengerList = passengerList;
	}
	
	public TicketResponse() {
		
	}
	
}
