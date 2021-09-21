package com.infygobooking.service;

import java.util.List;

import com.infygobooking.dto.CreditCardDTO;
import com.infygobooking.model.CreditCard;
import com.infygobooking.rest.objs.CreditCardRequestBody;

public interface CreditCardService {
	public List<CreditCard>  getAllCreditCards();
	public CreditCardDTO getCreditCard(String id);
	public Boolean transaction(CreditCardRequestBody card);
}
