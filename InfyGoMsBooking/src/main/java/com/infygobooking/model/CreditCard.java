package com.infygobooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infygobooking.dto.CreditCardDTO;

@Entity
@Table(name="creditcard_details")
public class CreditCard {
	@Id
	@Column(name="cardnumber")
	private String id;
	@Column(name="cardholdername")
	private String name;
	private String cvv;
	@Column(name="securepin")
	private String pin;
	@Column(name="expirymonth")
	private String expiryMonth;
	@Column(name="expiryyear")
	private String expiryYear;
	private Integer totalBill;
	 
	public CreditCard() {
		
	}
	
	public CreditCard(String id, String name, String cvv, String pin, String expiryMonth, String expiryYear, String totalBill) {
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
	
	public static CreditCardDTO prepareCreditCardDTO(CreditCard credit) {
		CreditCardDTO card = new CreditCardDTO();
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
