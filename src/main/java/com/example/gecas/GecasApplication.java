package com.example.gecas;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.gecas.entities.Category;
import com.example.gecas.entities.DesertCategory;
import com.example.gecas.entities.DesertItem;
import com.example.gecas.entities.DrinkCategory;
import com.example.gecas.entities.DrinkItem;
import com.example.gecas.entities.DrinkSubCategory;
import com.example.gecas.entities.FoodCategory;
import com.example.gecas.entities.FoodItem;
import com.example.gecas.entities.Ingredient;
import com.example.gecas.entities.Producer;
import com.example.gecas.repositories.CategoryRepository;
import com.example.gecas.repositories.DesertCategoryRepository;
import com.example.gecas.repositories.DesertItemRepository;
import com.example.gecas.repositories.DrinkCategoryRepository;
import com.example.gecas.repositories.DrinkItemRepository;
import com.example.gecas.repositories.DrinkSubCategoryRepository;
import com.example.gecas.repositories.FoodCategoryRepository;
import com.example.gecas.repositories.FoodItemRepository;
import com.example.gecas.repositories.IngredientRepository;
import com.example.gecas.repositories.ProducerRepository;



@SpringBootApplication
public class GecasApplication {

	@Autowired
	DesertCategoryRepository dcatRepository;
	
	@Autowired
	DesertItemRepository ditRepository;
	
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
	IngredientRepository ingredientRepository;
	
	@Autowired
	ProducerRepository producerRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GecasApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		try {
			
			categoryRepository.save(new Category(1L,"Food",""));
			categoryRepository.save(new Category(2L,"Desert",""));
			categoryRepository.save(new Category(3L,"Drinks",""));
			
			dcRepository.save(new DrinkCategory(1L,"Alcoholic", ""));
			dcRepository.save(new DrinkCategory(2L,"NonAlcoholic", ""));
			
			dscRepository.save(new DrinkSubCategory(1L,"Wine",dcRepository.findById(1L).get(),"", categoryRepository.findById(3L).get()));
			dscRepository.save(new DrinkSubCategory(2L,"Beer",dcRepository.findById(1L).get(),"", categoryRepository.findById(3L).get()));
			dscRepository.save(new DrinkSubCategory(3L,"Distilled Drinks",dcRepository.findById(1L).get(),"", categoryRepository.findById(3L).get()));
			dscRepository.save(new DrinkSubCategory(4L,"Pops",dcRepository.findById(2L).get(),"", categoryRepository.findById(3L).get()));
			dscRepository.save(new DrinkSubCategory(5L,"Water",dcRepository.findById(2L).get(),"", categoryRepository.findById(3L).get()));
			
			dcatRepository.save(new DesertCategory(1L, "Pancakes", "", categoryRepository.findById(2L).get()));
			dcatRepository.save(new DesertCategory(2L, "Ice-Cream", "", categoryRepository.findById(2L).get()));
			dcatRepository.save(new DesertCategory(3L, "Cakes", "", categoryRepository.findById(2L).get()));
			
			fcRepository.save(new FoodCategory(1L, "BBQ", "", categoryRepository.findById(1L).get()));
			fcRepository.save(new FoodCategory(2L, "Salads", "", categoryRepository.findById(1L).get()));
			fcRepository.save(new FoodCategory(3L, "Fish", "", categoryRepository.findById(1L).get()));
			fcRepository.save(new FoodCategory(4L, "Pizza And Pasta", "", categoryRepository.findById(1L).get()));
			fcRepository.save(new FoodCategory(5L, "Cold Plates", "", categoryRepository.findById(1L).get()));
			fcRepository.save(new FoodCategory(6L, "Fried Plates", "", categoryRepository.findById(1L).get()));
			
			
			fiRepository.save(new FoodItem(1L, "Margarita", 200.00, fcRepository.findById(4L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(2L, "Kaprichioza", 250.00, fcRepository.findById(4L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(3L, "Vegeterijana", 250.00, fcRepository.findById(4L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(4L, "Quatro Formagio", 350.00, fcRepository.findById(4L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(5L, "BeffStake 300 gr", 500.00, fcRepository.findById(1L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(6L, "Pork Ribs 500gr", 450.00, fcRepository.findById(1L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(7L, "Kebap 10 pc", 200.00, fcRepository.findById(1L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(8L, "Chicken Brest 300gr", 250.00, fcRepository.findById(1L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(9L, "Salmon 500gr", 400.00, fcRepository.findById(3L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(10L, "Orada 500gr", 750.00, fcRepository.findById(3L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(11L, "Brancin 500gr", 800.00, fcRepository.findById(3L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(12L, "Millanezze", 250.00, fcRepository.findById(4L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(13L, "Bollogneze", 250.00, fcRepository.findById(4L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(14L, "4 x 50 gr Cheese Plate", 250.00, fcRepository.findById(5L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(15L, "4 x 100 gr Cheese Plate", 450.00, fcRepository.findById(5L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(16L, "4 x 50 gr Dry Meats Plate", 350.00, fcRepository.findById(5L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(17L, "4 x 100 gr Dry Meats Plate", 650.00, fcRepository.findById(5L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(18L, "600 gr Mixed Fried Plate", 250.00, fcRepository.findById(6L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(19L, "Sopska", 120.00, fcRepository.findById(2L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(20L, "Mixed Fresh", 100.00, fcRepository.findById(2L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(21L, "Cezar", 200.00, fcRepository.findById(2L).get(), new ArrayList<Ingredient>(), "", "", true));
			fiRepository.save(new FoodItem(22L, "Macedonian", 130.00, fcRepository.findById(2L).get(), new ArrayList<Ingredient>(), "", "", true));
			
			producerRepository.save(new Producer(1L, "Skopska Pivara"));
			producerRepository.save(new Producer(2L, "Prilepska Pivara"));
			producerRepository.save(new Producer(3L, "Tikves"));
			producerRepository.save(new Producer(4L, "Bovin"));
			producerRepository.save(new Producer(5L, "Nestle"));
			producerRepository.save(new Producer(6L, "Johnnie Walker"));
			producerRepository.save(new Producer(7L, "Pelisterka"));
			producerRepository.save(new Producer(8L, "Gorska"));
			producerRepository.save(new Producer(9L, "Jack Daniel's"));
			
			ditRepository.save(new DesertItem(1L,"Honey And Nuts", dcatRepository.findById(1L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(2L,"Cream And Banana", dcatRepository.findById(1L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(3L,"Nutella And Vanilla", dcatRepository.findById(2L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(4L,"Mixed Forest Fruits", dcatRepository.findById(2L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(5L,"Strachatella", dcatRepository.findById(2L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(6L,"Ohridska", dcatRepository.findById(3L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(7L,"Cheese Cake", dcatRepository.findById(3L).get(), 150.00,"", new ArrayList<Ingredient>(),true));
			ditRepository.save(new DesertItem(8L,"Nutella And Nuts", dcatRepository.findById(2L).get(), 150.00,"", new ArrayList<Ingredient>(),true));

			diRepository.save(new DrinkItem(1L,producerRepository.findById(1L).get(),"Fanta 1 lit",50.00,dscRepository.findById(4L).get(),"https://www.paket.mk/wp-content/uploads/2017/06/ZMA32111-800x800.jpg", true));
			diRepository.save(new DrinkItem(2L,producerRepository.findById(1L).get(),"Coca-Cola 1 lit",80.00,dscRepository.findById(4L).get(),"https://www.paket.mk/wp-content/uploads/2018/07/ZMA28243-1-800x800.jpg",true));
			diRepository.save(new DrinkItem(3L,producerRepository.findById(1L).get(),"Fanta 0.5 lit",40.00,dscRepository.findById(4L).get(),"https://www.paket.mk/wp-content/uploads/2017/06/ZMA12305-800x800.jpg", true));
			diRepository.save(new DrinkItem(4L,producerRepository.findById(1L).get(),"Coca-Cola 0.5 lit",40.00,dscRepository.findById(4L).get(),"https://www.paket.mk/wp-content/uploads/2019/11/SKP19437-1-800x800.jpg",true));
			diRepository.save(new DrinkItem(5L,producerRepository.findById(1L).get(),"Skopsko 1,5 lit",120.00,dscRepository.findById(2L).get(),"https://e-tinex.mk/TinexImagesPrivremeno/501563.jpg", true));
			diRepository.save(new DrinkItem(6L,producerRepository.findById(1L).get(),"Skopsko Smuth 1,5 lit",150.00,dscRepository.findById(2L).get(),"https://e-tinex.mk/TinexImagesPrivremeno/600290.jpg",true));
			diRepository.save(new DrinkItem(7L,producerRepository.findById(1L).get(),"Skopsko 0.5 lit",80.00,dscRepository.findById(2L).get(),"https://cdn.shopify.com/s/files/1/2216/3143/products/Skopsko-0.33l_800x.jpg?v=1569050875", true));
			diRepository.save(new DrinkItem(8L,producerRepository.findById(1L).get(),"Heineken 0.33 lit",100.00,dscRepository.findById(2L).get(),"https://www.paket.mk/wp-content/uploads/2017/06/ZMA20794-1-800x800.jpg",true));
		
			diRepository.save(new DrinkItem(9L,producerRepository.findById(2L).get(),"Zlaten Dab 0.5 lit",80.00,dscRepository.findById(2L).get(),"", true));
			diRepository.save(new DrinkItem(10L,producerRepository.findById(2L).get(),"Zlaten Dab Dark 0.33 lit",70.00,dscRepository.findById(2L).get(),"",true));
			diRepository.save(new DrinkItem(11L,producerRepository.findById(2L).get(),"Pepsi 1 lit",50.00,dscRepository.findById(1L).get(),"", true));
			diRepository.save(new DrinkItem(12L,producerRepository.findById(2L).get(),"Zlaten Dab 1,5 lit",100.00,dscRepository.findById(2L).get(),"https://e-tinex.mk/TinexImagesPrivremeno/300505.jpg",true));
			diRepository.save(new DrinkItem(13L,producerRepository.findById(2L).get(),"Pepsi 0.5 lit",40.00,dscRepository.findById(2L).get(),"", true));
			diRepository.save(new DrinkItem(14L,producerRepository.findById(2L).get(),"Tuborg 0.75 lit",90.00,dscRepository.findById(2L).get(),"https://e-tinex.mk/TinexImagesPrivremeno/115019.jpg",true));
			
			diRepository.save(new DrinkItem(15L,producerRepository.findById(8L).get(),"Gorska Negazirana 1 lit",70.00,dscRepository.findById(5L).get(),"", true));
			diRepository.save(new DrinkItem(16L,producerRepository.findById(8L).get(),"Gorska Gazirana 1 lit",70.00,dscRepository.findById(5L).get(),"",true));
			diRepository.save(new DrinkItem(17L,producerRepository.findById(8L).get(),"Gorska Negazirana 0.25 lit",80.00,dscRepository.findById(5L).get(),"", true));
			diRepository.save(new DrinkItem(18L,producerRepository.findById(8L).get(),"Gorska Gazirana 0.25 lit",100.00,dscRepository.findById(5L).get(),"",true));
			diRepository.save(new DrinkItem(19L,producerRepository.findById(7L).get(),"Pelisterka Gazirana 1 lit",80.00,dscRepository.findById(5L).get(),"", true));
			diRepository.save(new DrinkItem(20L,producerRepository.findById(7L).get(),"Pelisterka Gazirana 0.75 lit",70.00,dscRepository.findById(5L).get(),"",true));
			diRepository.save(new DrinkItem(21L,producerRepository.findById(7L).get(),"Pelisterka Negazirana 0.75 lit",70.00,dscRepository.findById(5L).get(),"", true));
			
			diRepository.save(new DrinkItem(22L,producerRepository.findById(3L).get(),"Special Selection 0.75 lit",1000.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-merlot-special-selection-tikves-075l-60412e1726ac4.jpg",true));
			diRepository.save(new DrinkItem(23L,producerRepository.findById(3L).get(),"Alexandria Couve 0.75 lit",1140.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-tikves_alexandria_cuvee_rose_075l_381.jpg", true));
			diRepository.save(new DrinkItem(24L,producerRepository.findById(3L).get(),"T'ga za Jug 0.75 lit",790.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-tga_za_jug_tikves_075l_145.jpg",true));
			diRepository.save(new DrinkItem(25L,producerRepository.findById(3L).get(),"Temjanika 0.75 lit",770.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-temjanika_tikves_075l_992.jpg", true));
			diRepository.save(new DrinkItem(26L,producerRepository.findById(3L).get(),"Bela Voda 0.75 lit",1700.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/images/bela_voda_tikves_075l_507.jpg",true));
			diRepository.save(new DrinkItem(27L,producerRepository.findById(3L).get(),"T'ga za jug 0.25 lit",180.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-tga_za_jug_tikves_075l_145.jpg", true));
			diRepository.save(new DrinkItem(28L,producerRepository.findById(3L).get(),"Alexandria belo 0.25 lit",160.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-vino_aleksandria_bela_02l_568.jpg",true));
			diRepository.save(new DrinkItem(29L,producerRepository.findById(3L).get(),"Alexandria crveno 0.25 lit",160.00,dscRepository.findById(1L).get(),"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-aleksandria_crna_02l_931.jpg", true));
			diRepository.save(new DrinkItem(30L,producerRepository.findById(3L).get(),"Barovo 0.75 lit",1800.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2017/11/Barovo-White-png.png",true));
            diRepository.save(new DrinkItem(31L,producerRepository.findById(4L).get(),"Dissan 0.75 lit",1770.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2017/11/9_Bovin-Dissan-Barrique-2010-750ml-375x400.png", true));
			diRepository.save(new DrinkItem(32L,producerRepository.findById(4L).get(),"Darron 0.75 lit",1700.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2017/11/bovin-red-wine-daron-375x400.png",true));
			diRepository.save(new DrinkItem(33L,producerRepository.findById(4L).get(),"Alexandar 0.75 lit",1140.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2020/04/bovin-red-wine-alexandar-375x400.png", true));
			diRepository.save(new DrinkItem(34L,producerRepository.findById(4L).get(),"Venus 0.75 lit",1190.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2017/11/bovin-red-wine-venus-375x400.png",true));
			diRepository.save(new DrinkItem(35L,producerRepository.findById(4L).get(),"Imperator 0.75 lit",2770.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2017/11/bovin-red-wine-imperator-375x400.png", true));
			diRepository.save(new DrinkItem(36L,producerRepository.findById(4L).get(),"Chardonnay 0.75 lit",1700.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2020/04/Chardonnay-the-one-copy-375x400.png",true));
			diRepository.save(new DrinkItem(37L,producerRepository.findById(4L).get(),"Chardonnay Barique 0.75 lit",3180.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2017/11/5_Chardonnay-Barrique-375x400.png", true));
			diRepository.save(new DrinkItem(38L,producerRepository.findById(4L).get(),"Temjanika 0.75 lit",1160.00,dscRepository.findById(1L).get(),"https://wine.mk/wp-content/uploads/2017/11/Muscat-Temjanika-375x400.png",true));
			diRepository.save(new DrinkItem(39L,producerRepository.findById(4L).get(),"Sv. Trifun 0.5 lit",760.00,dscRepository.findById(3L).get(),"https://wine.mk/wp-content/uploads/2020/04/bovin-brandy-yellow-375x400.png", true));
			diRepository.save(new DrinkItem(40L,producerRepository.findById(4L).get(),"Sv. Trifun Premium 0.5 lit",1200.00,dscRepository.findById(3L).get(),"https://wine.mk/wp-content/uploads/2020/04/bovin-brandy-sv-trifun-premium-375x400.png",true));
			
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
	
	
}

}
