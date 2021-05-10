package com.example.gecas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

	@Id
	private Long id;
	
	private String street;
	
	private String number;
	
	private String zipCode;
	
	private String city;
}
