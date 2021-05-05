package com.example.gecas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.gecas.entities.Category;
import com.example.gecas.entities.DesertItem;
import com.example.gecas.entities.DrinkItem;
import com.example.gecas.entities.FoodItem;
import com.example.gecas.entities.SubCategory;
import com.example.gecas.repositories.CategoryRepository;
import com.example.gecas.repositories.DesertItemRepository;
import com.example.gecas.repositories.DrinkCategoryRepository;
import com.example.gecas.repositories.DrinkItemRepository;
import com.example.gecas.repositories.FoodItemRepository;
import com.example.gecas.repositories.IngredientRepository;
import com.example.gecas.repositories.ProducerRepository;
import com.example.gecas.repositories.SubCategoryRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MenuController {
	
	@Autowired
	DesertItemRepository ditRepository;
	
	@Autowired
	DrinkCategoryRepository dcRepository;
	
	@Autowired
	DrinkItemRepository diRepository;
	
	@Autowired
	FoodItemRepository fiRepository;
	
	@Autowired
	IngredientRepository ingredientRepository;
	
	@Autowired
	ProducerRepository producerRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	SubCategoryRepository subRepository;
	
	
	@GetMapping("/categories")
	public List<Category> findAllCategories() {
		
		return categoryRepository.findAll();
	}
	
	public List<SubCategory> findSubCategoryByCategoryId(@PathVariable("id")Long id) {
		
		return subRepository.findAllByCategoryId(id);
	}
	
	public List<DrinkItem> findAllDrinksByDrinkCategoryId(Long id) {
		
		return diRepository.findAllByDrCategoryId(id);
	}
	
	public List<DrinkItem> findAllDrinksBySubCategoryId(Long id) {
		
		return diRepository.findAllBySubId(id);
	}
	
	public List<FoodItem> findAllFoodItemsBySubCategoryId(Long id) {
		
		return fiRepository.findAllBySubCategoryId(id);
	}
	
	public List<DesertItem> findAllByDesertsBySubCategoryId(Long id) {
		
		return ditRepository.findAllBySubId(id);
	}

}
