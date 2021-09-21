package com.infygobooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygobooking.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {

}
