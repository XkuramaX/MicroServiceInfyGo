package com.infygobooking.dto;

import com.infygobooking.model.CreditCard;

public class CreditCardDTO {
	private String id;
	private String name;
	private String cvv;
	private String pin;
	private String expiryMonth;
	private String expiryYear;
	private Integer totalBill;
	 
	public CreditCardDTO() {
		
	}
	
	public CreditCardDTO(String id, String name, String cvv, String pin, String expiryMonth, String expiryYear, String totalBill) {
		this.id = id;
		this.name = name;
		this.cvv = cvv;
		this.pin = pin;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.totalBill = Integer.parseInt(totalBill);
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

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public Integer getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(Integer totalBill) {
		this.totalBill = totalBill;
	}
	
	public Boolean equals(CreditCardDTO card) {
		if (this.getId().equals(card.getId()) && this.getExpiryMonth().equals(card.getExpiryMonth()) && this.getCvv().equals(card.getCvv()) && this.getExpiryYear().equals(card.getExpiryYear()) && this.pin.equals(card.pin) && this.name.equals(card.name)) {
			return true;
		}
		return false;
	}
	
	public static CreditCard prepareCreditCard(CreditCardDTO credit) {
		CreditCard card = new CreditCard();
		card.setCvv(credit.getCvv());
		card.setExpiryMonth(credit.getExpiryMonth());
		card.setExpiryYear(credit.getExpiryYear());
		card.setId(credit.getId());
		card.setName(credit.getName());
		card.setPin(credit.getPin());
		card.setTotalBill(credit.getTotalBill());
		
		return card;
	}
	
	
}

