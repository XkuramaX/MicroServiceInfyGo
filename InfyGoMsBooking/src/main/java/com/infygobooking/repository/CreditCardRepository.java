package com.infygobooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygobooking.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, String> {

}
