package com.infygobooking.dto;

import com.infygobooking.model.Ticket;

public class TicketDTO {

	private String pnr;
	private String bookingDate;
	private String departureDate;
	private String departureTime;
	private String totalFare;
	private String flightId;
	private String userId;
	private String noOfSeats;
	
	public TicketDTO() {
		
	}
	
	public TicketDTO(String pnr, String bookingDate, String departureDate, String departureTime, String totalFare,
			String flightId, String userId, String noOfSeats) {
		super();
		this.pnr = pnr;
		this.bookingDate = bookingDate;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.totalFare = totalFare;
		this.flightId = flightId;
		this.userId = userId;
		this.noOfSeats = noOfSeats;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public static Ticket prepareTicket(TicketDTO req) {
		Ticket obj = new Ticket();
		obj.setBookingDate(req.getBookingDate());
		obj.setDepartureDate(req.getDepartureDate());
		obj.setDepartureTime(req.getDepartureTime());
		obj.setFlightId(req.getFlightId());
		obj.setNoOfSeats(req.getNoOfSeats());
		obj.setPnr(req.getPnr());
		obj.setTotalFare(req.getTotalFare());
		obj.setUserId(req.getUserId());
		
		return obj;
	}
	
	
	
	
}

