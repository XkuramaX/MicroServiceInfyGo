package com.infygobooking.rest.objs;

public class CreditCardRequestBody {
	
	private String cardNumber;
	private String cardHolderName;
	private String cvv;
	private String pin;
	private String expiryMonth;
	private String expiryYear;
	
	public CreditCardRequestBody() {
		
	}
	
	public CreditCardRequestBody(String cardNumber, String cardHolderName, String cvv, String pin, String expiryMonth, String expiryYear) {
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.pin = pin;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
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
}
