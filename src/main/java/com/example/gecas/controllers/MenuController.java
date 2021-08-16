package com.example.gecas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.gecas.entities.Category;
import com.example.gecas.entities.Ingredient;
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
	
	@PostMapping("/item/{id}/newDescription")
	public MenuItem updateItemDescription(@PathVariable("id") Long id, MenuItem item) {
		
		MenuItem itemForUpdate = itemRepository.findById(id).get();
		itemForUpdate.setDescription(item.getDescription());
		
		return itemRepository.save(itemForUpdate);
		
	}
	
	@PostMapping("/item/{id}/addQuantity")
	public MenuItem updateItemQty(@PathVariable("id") Long id, MenuItem item) {
		
		MenuItem itemForUpdate = itemRepository.findById(id).get();
		itemForUpdate.setQty(itemForUpdate.getQty() + item.getQty());
		
		return itemRepository.save(itemForUpdate);
		
	}
	
	@PostMapping("/item/{id}/newPrice")
	public MenuItem updateItemPrice(@PathVariable("id") Long id, MenuItem item) {
		
		MenuItem itemForUpdate = itemRepository.findById(id).get();
		itemForUpdate.setPrice(item.getPrice());
		
		return itemRepository.save(itemForUpdate);
		
	}
	
	@PostMapping("/item/{id}/newProducer")
	public MenuItem updateItemProducer(@PathVariable("id") Long id, MenuItem item) {
		
		MenuItem itemForUpdate = itemRepository.findById(id).get();
		itemForUpdate.setProducer(item.getProducer());
		
		return itemRepository.save(itemForUpdate);
		
	}
	@PostMapping("/item/{id}/newSubcategory")
	public MenuItem updateItemSubCategory(@PathVariable("id") Long id, MenuItem item) {
		
		MenuItem itemForUpdate = itemRepository.findById(id).get();
		itemForUpdate.setSubCategory(item.getSubCategory());
		
		return itemRepository.save(itemForUpdate);
		
	}
	
	@PostMapping("/item/{id}/newIngredients")
	public MenuItem updateItemIngredients(@PathVariable("id") Long id, MenuItem item) {
		
		MenuItem itemForUpdate = itemRepository.findById(id).get();
		itemForUpdate.setIgredients(item.getIgredients());
		
		return itemRepository.save(itemForUpdate);
		
	}
	
	@PostMapping("/newItem")
	public MenuItem newItem(@RequestBody MenuItem item) {
		MenuItem newItem = new MenuItem();
		
		newItem .setId(Long.valueOf(item.getId()));
		newItem.setDescription(item.getDescription());
		newItem.setPrice(Double.valueOf(item.getPrice()));
		return itemRepository.save(newItem);
	}
	
	@GetMapping("/allIngredients")
	public List<Ingredient> getAllIngredients (){
		return ingredientRepository.findAll();
		
	}
	
	
	
	
}
