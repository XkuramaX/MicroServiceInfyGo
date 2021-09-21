package com.infygobooking.service;

import java.util.List;

import com.infygobooking.model.Ticket;
import com.infygobooking.rest.objs.TicketRequestBody;
import com.infygobooking.rest.objs.TicketResponse;

public interface TicketService {
	public TicketResponse bookTicket(TicketRequestBody request, String flightId, String userId);
	public List<Ticket> getAllTickets();
}
