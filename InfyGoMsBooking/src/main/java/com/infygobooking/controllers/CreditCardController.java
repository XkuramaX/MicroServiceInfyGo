package com.infygobooking.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygobooking.dto.CreditCardDTO;
import com.infygobooking.model.CreditCard;
import com.infygobooking.rest.objs.CreditCardRequestBody;
import com.infygobooking.service.CreditCardServiceImpl;

@RequestMapping("InfyGoBoot/payment")
@RestController
public class CreditCardController {

	public final CreditCardServiceImpl service;
	@Autowired
	public CreditCardController(CreditCardServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping
	public List<CreditCard> getAllCards(){
		return service.getAllCreditCards();
	}
	
	@GetMapping("{id}")
	public CreditCardDTO getCreditCard(@PathVariable String id) {
		return service.getCreditCard(id);
	}
	
	@PostMapping
	public Boolean payment(@RequestBody CreditCardRequestBody request) {
		return service.transaction(request);
	}
	
}
