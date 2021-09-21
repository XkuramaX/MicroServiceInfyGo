package com.infygobooking.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infygobooking.dto.FlightsDTO;
import com.infygobooking.dto.PassengerDTO;
import com.infygobooking.dto.TicketDTO;
import com.infygobooking.model.Ticket;
import com.infygobooking.repository.TicketRepository;
import com.infygobooking.rest.objs.PassengerRequestBody;
import com.infygobooking.rest.objs.PassengerResponse;
import com.infygobooking.rest.objs.TicketRequestBody;
import com.infygobooking.rest.objs.TicketResponse;

@Service("ticketService")
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	PassengerServiceImpl passengerService;
	
	@Override
	public TicketResponse bookTicket(TicketRequestBody request, String flightId, String userId) {
		
		FlightsDTO flight = restTemplate.getForObject("http://localhost:9002/api/flights/"+flightId, FlightsDTO.class);
		
		if (flight != null && flight.getSeatCount() >= request.getPassengerList().size()) {
			
			TicketResponse obj = new TicketResponse();
			String pnr = ""+(int)(Math.random()*10000000);
			
			int totalPassengers = request.getPassengerList().size();
			obj.setPnr(pnr);
			obj.setTotalFare(flight.getFare() * totalPassengers);
			
			TicketDTO ticketDTO = new TicketDTO();
			
			ticketDTO.setTotalFare(""+obj.getTotalFare());
			ticketDTO.setBookingDate(LocalDate.now().toString());
			ticketDTO.setPnr(pnr);
			ticketDTO.setUserId(userId);
			ticketDTO.setNoOfSeats(""+totalPassengers);
			ticketDTO.setFlightId(flightId);
			ticketDTO.setDepartureTime(flight.getDepartureTime());
			ticketDTO.setDepartureDate(flight.getFlightAvailableDate().toString());
			
			List<PassengerResponse> passengers = new ArrayList<>();
			List<PassengerRequestBody> passengerRequests = request.getPassengerList();
			
			
			
			for(PassengerRequestBody passenger : passengerRequests) {
				PassengerDTO passengerDTO = passengerService.createPassenger(passenger, pnr);
				if(passengerDTO == null) {
					return null;
				}
				PassengerResponse passengerResp = new PassengerResponse();
				passengerResp.setPassengerAge(""+passengerDTO.getAge());
				passengerResp.setPassengerGender(passengerDTO.getGender());
				passengerResp.setPassengerId(passengerDTO.getId());
				passengerResp.setPassengerName(passengerDTO.getName());
				passengerResp.setTicket(ticketDTO);
				passengers.add(passengerResp);
			}
			repo.saveAndFlush(TicketDTO.prepareTicket(ticketDTO));
			obj.setPassengerList(passengers);
			return obj;
			
		}
		
		return null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		return repo.findAll();
	}

}
