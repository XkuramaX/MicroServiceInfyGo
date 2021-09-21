package com.infygobooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygobooking.dto.PassengerDTO;
import com.infygobooking.model.Passenger;
import com.infygobooking.repository.PassengerRepository;
import com.infygobooking.rest.objs.PassengerRequestBody;

@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository repo;
	
	@Override
	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public PassengerDTO getPassenger(String id) {
		// TODO Auto-generated method stub
		Optional<Passenger> passenger = repo.findById(id);
		if (passenger.isPresent()) {
			PassengerDTO response = Passenger.preparePassengerDTO(passenger.get());
			return response;
		}
		return null;
	}

	@Override
	public PassengerDTO createPassenger(PassengerRequestBody req, String pnr) {
		// TODO Auto-generated method stub
		PassengerDTO obj = new PassengerDTO();
		obj.setAge(req.getPassengerAge());
		obj.setName(req.getPassengerName());
		obj.setPnr(pnr);
		obj.setGender(req.getPassengerGender());
		obj.setId(""+(int)(Math.random()*1000000));
		
		Passenger passenger = PassengerDTO.preparePassenger(obj);
		repo.saveAndFlush(passenger);
		
		return obj;
	}
	
	

}
