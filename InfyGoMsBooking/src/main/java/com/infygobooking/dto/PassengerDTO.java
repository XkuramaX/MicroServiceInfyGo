package com.infygobooking.dto;

import com.infygobooking.model.Passenger;

public class PassengerDTO {
	
	
	private String id;
	
	private String name;
	
	private String gender;
	
	private Integer age;
	private String pnr;
	
	public PassengerDTO () {
		
	}
	
	public PassengerDTO(String id, String name, String gender, int age, String pnr) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.pnr = pnr;
	}
	
	@Override
	public String toString() {
		return "Passenger[id="+this.id+" name="+this.name+" gender="+this.gender+" age="+this.age+"  pnr="+this.pnr+"]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	
	public static Passenger preparePassenger(PassengerDTO req) {
		Passenger obj = new Passenger();
		obj.setAge(req.getAge());
		obj.setGender(req.getGender());
		obj.setId(req.getId());
		obj.setName(req.getName());
		obj.setPnr(req.getPnr());
		return obj;
	}
	
}
