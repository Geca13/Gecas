package com.example.gecas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.gecas.entities.Category;
import com.example.gecas.entities.MenuItem;
import com.example.gecas.entities.SubCategory;
import com.example.gecas.repositories.CategoryRepository;

import com.example.gecas.repositories.IngredientRepository;
import com.example.gecas.repositories.MenuItemRepository;
import com.example.gecas.repositories.ProducerRepository;
import com.example.gecas.repositories.SubCategoryRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MenuController {
	
	
	
	@Autowired
	IngredientRepository ingredientRepository;
	
	@Autowired
	ProducerRepository producerRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	SubCategoryRepository subRepository;
	
	@Autowired
	MenuItemRepository itemRepository;
	
	
	@GetMapping("/categories")
	public List<Category> findAllCategories() {
		
		return categoryRepository.findAll();
	}
	
	@GetMapping("/subCategories/{id}")
	public List<SubCategory> findAllByCategoryId(@PathVariable ("id")Long id) {
		
		return subRepository.findAllByCategoryId(id);
	}
	
	
	@GetMapping("/items/{id}")
	public List<MenuItem> findAllBySubCategoriesId(@PathVariable ("id")Long id) {
		
		return itemRepository.findAllBySubCategoryId(id);
	}
	
	@GetMapping("/item/{id}")
	public MenuItem getItemById(@PathVariable ("id")Long id) {
		
		return itemRepository.findById(id).get();
	}
	
	@GetMapping("/items")
	public List<MenuItem> findAllItems() {
		
		return itemRepository.findAll();
	}
	
	
	
}
