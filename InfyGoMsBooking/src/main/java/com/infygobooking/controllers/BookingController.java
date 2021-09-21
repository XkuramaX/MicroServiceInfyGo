package com.infygobooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygobooking.model.Ticket;
import com.infygobooking.rest.objs.TicketRequestBody;
import com.infygobooking.rest.objs.TicketResponse;
import com.infygobooking.service.TicketServiceImpl;

@RequestMapping("/api/booking")
@RestController
public class BookingController {
	public final TicketServiceImpl service;
	
	@Autowired
	public BookingController(TicketServiceImpl service) {
		this.service = service;
	}
	
	@PostMapping("{flightId}/{userId}")
	public TicketResponse book(@PathVariable String flightId, @PathVariable String userId, @RequestBody TicketRequestBody request) {
		return service.bookTicket(request, flightId, userId);
	}
	
	@GetMapping
	public List<Ticket> getAllBookings(){
		return service.getAllTickets();
	}
}
