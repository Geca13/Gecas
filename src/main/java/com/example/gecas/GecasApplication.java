package com.example.gecas;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.gecas.entities.DesertCategory;
import com.example.gecas.entities.DesertItem;
import com.example.gecas.entities.Ingredient;
import com.example.gecas.entities.Producer;
import com.example.gecas.repositories.DesertCategoryRepository;
import com.example.gecas.repositories.DesertItemRepository;
import com.example.gecas.repositories.DesertSubCategoryRepository;
import com.example.gecas.repositories.DrinkCategoryRepository;
import com.example.gecas.repositories.DrinkItemRepository;
import com.example.gecas.repositories.DrinkSubCategoryRepository;
import com.example.gecas.repositories.FoodCategoryRepository;
import com.example.gecas.repositories.FoodItemRepository;
import com.example.gecas.repositories.FoodSubCategoryRepository;
import com.example.gecas.repositories.IngredientRepository;
import com.example.gecas.repositories.ProducerRepository;



@SpringBootApplication
public class GecasApplication {

	@Autowired
	DesertCategoryRepository dcatRepository;
	
	@Autowired
	DesertItemRepository ditRepository;
	
	@Autowired
	DesertSubCategoryRepository dsubcRepository;
	
	@Autowired
	DrinkCategoryRepository dcRepository;
	
	@Autowired
	DrinkItemRepository diRepository;
	
	@Autowired
	DrinkSubCategoryRepository dscRepository;
	
	@Autowired
	FoodCategoryRepository fcRepository;
	
	@Autowired
	FoodItemRepository fiRepository;
	
	@Autowired
	FoodSubCategoryRepository fscRepository;
	
	@Autowired
	IngredientRepository ingredientRepository;
	
	@Autowired
	ProducerRepository producerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GecasApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		try {
			
			producerRepository.save(new Producer(1L, "Coca-Cola"));
			producerRepository.save(new Producer(2L, "Pepsi"));
			producerRepository.save(new Producer(3L, "Tikves"));
			producerRepository.save(new Producer(4L, "Bovin"));
			producerRepository.save(new Producer(5L, "Skopska Pivara"));
			producerRepository.save(new Producer(6L, "Prilepska Pivara"));
			producerRepository.save(new Producer(7L, "Pelisterka"));
			producerRepository.save(new Producer(8L, "Gorska"));
			
			dcatRepository.save(new DesertCategory(1L, "Pancakes", ""));
			dcatRepository.save(new DesertCategory(2L, "Ice-Cream", ""));
			dcatRepository.save(new DesertCategory(3L, "Cakes", ""));
			
			ditRepository.save(new DesertItem(1L,"Honey And Nuts", dcatRepository.findById(1L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(2L,"Cream And Banana", dcatRepository.findById(1L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(3L,"Nutella And Vanilla", dcatRepository.findById(2L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(4L,"Mixed Forest Fruits", dcatRepository.findById(2L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(5L,"Strachatella", dcatRepository.findById(2L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			
		} catch (Exception e) {
			System.err.println(e);
		}
	
	
}

}
