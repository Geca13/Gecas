package com.example.gecas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gecas.entities.Reservation;
import com.example.gecas.repositories.ReservationRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ReservationController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@PostMapping("/newReservation")
	public Reservation createReservation(@RequestBody Reservation reservation) {
		
		return reservationRepository.save(reservation);
		
	}

}
