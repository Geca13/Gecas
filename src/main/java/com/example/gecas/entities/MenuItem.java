package com.example.gecas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Producer producer;
	
	private String description;
	
	
	private Double price;
	
	@ManyToOne
	private SubCategory subCategory;
	
	@ManyToMany
	private List<Ingredient> igredients = new ArrayList<>();
	
	
	private String imageUrl;
	
	private Integer qty;
	
	

}
