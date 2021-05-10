package com.example.gecas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gecas.entities.Location;
import com.example.gecas.repositories.LocationRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class LocationController {
	
	@Autowired
	LocationRepository locationRepository;
	
	@GetMapping("/locations")
	public List<Location> findAll(){
		return locationRepository.findAll();
		
	}

}
