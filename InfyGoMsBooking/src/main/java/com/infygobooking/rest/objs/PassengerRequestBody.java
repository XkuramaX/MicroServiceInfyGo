package com.infygobooking.rest.objs;

public class PassengerRequestBody {
	private String passengerName;
	private Integer passengerAge;
	private String passengerGender;
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Integer getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public PassengerRequestBody(String passengerName, Integer passengerAge, String passengerGender) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
	}
	
	public PassengerRequestBody() {
		
	}
	
}
