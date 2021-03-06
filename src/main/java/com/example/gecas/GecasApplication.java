package com.example.gecas;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.gecas.entities.Category;

import com.example.gecas.entities.Ingredient;
import com.example.gecas.entities.Location;
import com.example.gecas.entities.MenuItem;
import com.example.gecas.entities.Producer;
import com.example.gecas.entities.SubCategory;
import com.example.gecas.repositories.CategoryRepository;

import com.example.gecas.repositories.IngredientRepository;
import com.example.gecas.repositories.LocationRepository;
import com.example.gecas.repositories.MenuItemRepository;
import com.example.gecas.repositories.ProducerRepository;
import com.example.gecas.repositories.SubCategoryRepository;



@SpringBootApplication
public class GecasApplication {

	@Autowired
	LocationRepository locationRepository;
	

	
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
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(GecasApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		try {
			
			ingredientRepository.save(new Ingredient(1L,"Eggs"));
			ingredientRepository.save(new Ingredient(2L,"Yellow Cheese"));
			ingredientRepository.save(new Ingredient(3L,"Blue Cheese"));
			ingredientRepository.save(new Ingredient(4L,"White Cheese"));
			ingredientRepository.save(new Ingredient(5L,"Mozzarella"));
			ingredientRepository.save(new Ingredient(6L,"Parmigiano"));
			ingredientRepository.save(new Ingredient(7L,"Ham"));
			ingredientRepository.save(new Ingredient(8L,"Bacon"));
			ingredientRepository.save(new Ingredient(9L,"Pork Prosciutto"));
			ingredientRepository.save(new Ingredient(10L,"Beef Prosciutto"));
			ingredientRepository.save(new Ingredient(11L,"Beef Stake"));
			ingredientRepository.save(new Ingredient(12L,"Pork Ribs"));
			ingredientRepository.save(new Ingredient(13L,"Sausage"));
			ingredientRepository.save(new Ingredient(14L,"Trout"));
			ingredientRepository.save(new Ingredient(15L,"Salmon"));
			ingredientRepository.save(new Ingredient(16L,"Orada"));
			ingredientRepository.save(new Ingredient(17L,"French Fries"));
			ingredientRepository.save(new Ingredient(18L,"Baked Potatos"));
			ingredientRepository.save(new Ingredient(19L,"Tomatos"));
			ingredientRepository.save(new Ingredient(20L,"Gabage"));
			ingredientRepository.save(new Ingredient(21L,"Cucumber"));
			ingredientRepository.save(new Ingredient(22L,"Lettuce"));
			ingredientRepository.save(new Ingredient(23L,"Dough"));
			ingredientRepository.save(new Ingredient(24L,"Tomato Sause"));
			ingredientRepository.save(new Ingredient(25L,"Origano"));
			ingredientRepository.save(new Ingredient(26L,"Mashrooms"));
			ingredientRepository.save(new Ingredient(27L,"Chicken Wings"));
			ingredientRepository.save(new Ingredient(28L,"Nutella"));
			ingredientRepository.save(new Ingredient(29L,"Honey"));
			ingredientRepository.save(new Ingredient(30L,"Nuts"));
			ingredientRepository.save(new Ingredient(31L,"Vanila"));
			ingredientRepository.save(new Ingredient(32L,"Strachatella"));
			ingredientRepository.save(new Ingredient(33L,"Crepes"));
			ingredientRepository.save(new Ingredient(34L,"Chocolate cream"));
			ingredientRepository.save(new Ingredient(35L,"Frosting"));
			ingredientRepository.save(new Ingredient(36L,"Walnut"));
			ingredientRepository.save(new Ingredient(37L,"Spaghetti"));
			ingredientRepository.save(new Ingredient(38L,"Chocolate Crumbs"));
			ingredientRepository.save(new Ingredient(39L,"Carrot"));
			ingredientRepository.save(new Ingredient(40L,"Chicken Brests"));
			ingredientRepository.save(new Ingredient(41L,"Corn"));
			ingredientRepository.save(new Ingredient(42L,"Onion"));
			ingredientRepository.save(new Ingredient(43L,"Garlic"));
			ingredientRepository.save(new Ingredient(44L,"Fried Green Pepper"));
			ingredientRepository.save(new Ingredient(45L,"Parsley"));
			ingredientRepository.save(new Ingredient(46L,"??inced meat"));
			ingredientRepository.save(new Ingredient(47L,"Banana"));
			ingredientRepository.save(new Ingredient(48L,"Forest Fruits"));
			ingredientRepository.save(new Ingredient(49L,"Caramel"));
			ingredientRepository.save(new Ingredient(50L,"Cream Cheese"));
			
			categoryRepository.save(new Category(1L,"Food","https://previews.123rf.com/images/fdsstudio/fdsstudio1905/fdsstudio190500013/122776211-food-icon-on-white-background-cutlery-as-a-symbol-of-food-vector-logo-for-graphic-design-.jpg"));
			categoryRepository.save(new Category(2L,"Drink","https://i.pinimg.com/564x/c9/fd/a3/c9fda33a9ee8c9d1e12dba51552753bf.jpg"));
			categoryRepository.save(new Category(3L,"Desert","https://img.freepik.com/free-vector/dessert-icon-bakery-design-vector-graphic_24908-24791.jpg?size=338&ext=jpg"));
			
			subRepository.save(new SubCategory(1L,"Wine","https://image.freepik.com/free-vector/glass-bottle-wine-icon_24640-19981.jpg", categoryRepository.findById(2L).get()));
			subRepository.save(new SubCategory(2L,"Beer","https://as2.ftcdn.net/jpg/02/69/49/73/500_F_269497335_qZ49RQoTMXkgrCZGRoVaJilE3zZBZNxG.jpg", categoryRepository.findById(2L).get()));
			subRepository.save(new SubCategory(3L,"Distilled Drinks","https://as1.ftcdn.net/jpg/02/42/96/80/500_F_242968054_AIk14tlvDM8B8Lh6q6rlaYxiztPRsPrt.jpg", categoryRepository.findById(2L).get()));
			subRepository.save(new SubCategory(4L,"Pops","https://icon-library.net/images/soda-can-icon/soda-can-icon-16.jpg", categoryRepository.findById(2L).get()));
			subRepository.save(new SubCategory(5L,"Water","https://previews.123rf.com/images/jemastock/jemastock2002/jemastock200243485/140837287-bottle-water-drink-isolated-icon-vector-illustration-design.jpg", categoryRepository.findById(2L).get()));
			
			subRepository.save(new SubCategory(6L, "Crepes", "https://i.pinimg.com/564x/40/49/e6/4049e66b9d0a493ff20a4f1fba460a45.jpg", categoryRepository.findById(3L).get()));
			subRepository.save(new SubCategory(7L, "Ice-Cream", "http://www.icons101.com/icons/59/Beach_by_DaPino/128/icecream.png", categoryRepository.findById(3L).get()));
			subRepository.save(new SubCategory(8L, "Cakes", "https://www.pngarea.com/pngm/608/4231008_cake-icon-png-slice-of-cake-icon-png.png", categoryRepository.findById(3L).get()));
			
			subRepository.save(new SubCategory(9L, "BBQ", "https://st2.depositphotos.com/1006689/9982/v/950/depositphotos_99829926-stock-illustration-bbq-vector-icon.jpg", categoryRepository.findById(1L).get()));
			subRepository.save(new SubCategory(10L, "Salads", "https://images.all-free-download.com/images/graphiclarge/salad_menu_cover_template_vegetables_bowl_icons_6831856.jpg", categoryRepository.findById(1L).get()));
			subRepository.save(new SubCategory(11L, "Fish", "http://st2.depositphotos.com/6438882/9250/v/450/depositphotos_92501282-Fish-icon-Crucian-on-white-plate-with-lemon-and-herbs-Food-seafood-dish-symbol-Vector-isolated.jpg", categoryRepository.findById(1L).get()));
			subRepository.save(new SubCategory(12L, "Pizza And Pasta", "https://iconape.com/wp-content/png_logo_vector/pasta-pizza-logo.png", categoryRepository.findById(1L).get()));
			subRepository.save(new SubCategory(13L, "Cold Plates", "https://image.freepik.com/free-vector/cheese-icon_22350-103.jpg", categoryRepository.findById(1L).get()));
			subRepository.save(new SubCategory(14L, "Fried Plates", "https://i.pinimg.com/564x/a4/22/7c/a4227cb35cfbbd4d35ed98e3652579e9.jpg", categoryRepository.findById(1L).get()));
			
			
			List<Ingredient> ohrid = new ArrayList<>();
			ohrid.add(ingredientRepository.findById(23L).get());
			ohrid.add(ingredientRepository.findById(34L).get());
			ohrid.add(ingredientRepository.findById(36L).get());
			ohrid.add(ingredientRepository.findById(49L).get());
			ohrid.add(ingredientRepository.findById(35L).get());
			
			List<Ingredient> cheeseCake = new ArrayList<>();
			cheeseCake.add(ingredientRepository.findById(50L).get());
			cheeseCake.add(ingredientRepository.findById(31L).get());
			cheeseCake.add(ingredientRepository.findById(23L).get());
			cheeseCake.add(ingredientRepository.findById(35L).get());
			cheeseCake.add(ingredientRepository.findById(38L).get());
			
			List<Ingredient> nutellaCake = new ArrayList<>();
			nutellaCake.add(ingredientRepository.findById(23L).get());
			nutellaCake.add(ingredientRepository.findById(35L).get());
			nutellaCake.add(ingredientRepository.findById(38L).get());
			nutellaCake.add(ingredientRepository.findById(34L).get());
			nutellaCake.add(ingredientRepository.findById(30L).get());
			
			List<Ingredient> nutella = new ArrayList<>();
			nutella.add(ingredientRepository.findById(29L).get());
			nutella.add(ingredientRepository.findById(36L).get());
			nutella.add(ingredientRepository.findById(33L).get());
			nutella.add(ingredientRepository.findById(34L).get());
			
			List<Ingredient> forest = new ArrayList<>();
			forest.add(ingredientRepository.findById(48L).get());
			forest.add(ingredientRepository.findById(35L).get());
			forest.add(ingredientRepository.findById(38L).get());
			forest.add(ingredientRepository.findById(34L).get());
			
			List<Ingredient> strachatela = new ArrayList<>();
			strachatela.add(ingredientRepository.findById(32L).get());
			strachatela.add(ingredientRepository.findById(38L).get());
			strachatela.add(ingredientRepository.findById(34L).get());
			
			
			List<Ingredient> honey = new ArrayList<>();
			honey.add(ingredientRepository.findById(29L).get());
			honey.add(ingredientRepository.findById(36L).get());
			honey.add(ingredientRepository.findById(33L).get());
			
			List<Ingredient> banana = new ArrayList<>();
			banana.add(ingredientRepository.findById(33L).get());
			banana.add(ingredientRepository.findById(35L).get());
			banana.add(ingredientRepository.findById(47L).get());
			banana.add(ingredientRepository.findById(34L).get());
			
			List<Ingredient> fried = new ArrayList<>();
			fried.add(ingredientRepository.findById(2L).get());
			fried.add(ingredientRepository.findById(40L).get());
			fried.add(ingredientRepository.findById(4L).get());
			fried.add(ingredientRepository.findById(27L).get());
			fried.add(ingredientRepository.findById(13L).get());
			
			List<Ingredient> cheese = new ArrayList<>();
			cheese.add(ingredientRepository.findById(2L).get());
			cheese.add(ingredientRepository.findById(3L).get());
			cheese.add(ingredientRepository.findById(4L).get());
			cheese.add(ingredientRepository.findById(6L).get());
			
			List<Ingredient> meat = new ArrayList<>();
			meat.add(ingredientRepository.findById(7L).get());
			meat.add(ingredientRepository.findById(8L).get());
			meat.add(ingredientRepository.findById(9L).get());
			meat.add(ingredientRepository.findById(10L).get());
			
			List<Ingredient> milaneze = new ArrayList<>();
			milaneze.add(ingredientRepository.findById(37L).get());
			milaneze.add(ingredientRepository.findById(46L).get());
			milaneze.add(ingredientRepository.findById(24L).get());
			milaneze.add(ingredientRepository.findById(45L).get());
			
			List<Ingredient> bolonjeze = new ArrayList<>();
			bolonjeze.add(ingredientRepository.findById(37L).get());
			bolonjeze.add(ingredientRepository.findById(2L).get());
			bolonjeze.add(ingredientRepository.findById(7L).get());
			bolonjeze.add(ingredientRepository.findById(25L).get());
			
			List<Ingredient> beefstake = new ArrayList<>();
			beefstake.add(ingredientRepository.findById(11L).get());
			beefstake.add(ingredientRepository.findById(17L).get());
			beefstake.add(ingredientRepository.findById(19L).get());
			
			List<Ingredient> porkRibs = new ArrayList<>();
			porkRibs.add(ingredientRepository.findById(12L).get());
			porkRibs.add(ingredientRepository.findById(17L).get());
			porkRibs.add(ingredientRepository.findById(19L).get());
			
			List<Ingredient> kebap = new ArrayList<>();
			kebap.add(ingredientRepository.findById(46L).get());
			kebap.add(ingredientRepository.findById(42L).get());
			
			List<Ingredient> chicken = new ArrayList<>();
			chicken.add(ingredientRepository.findById(40L).get());
			chicken.add(ingredientRepository.findById(17L).get());
			chicken.add(ingredientRepository.findById(20L).get());
			
			List<Ingredient> trout = new ArrayList<>();
			trout.add(ingredientRepository.findById(14L).get());
			trout.add(ingredientRepository.findById(18L).get());
			trout.add(ingredientRepository.findById(39L).get());
			
			List<Ingredient> orada = new ArrayList<>();
			orada.add(ingredientRepository.findById(16L).get());
			orada.add(ingredientRepository.findById(18L).get());
			orada.add(ingredientRepository.findById(39L).get());
			
			List<Ingredient> salmon = new ArrayList<>();
			salmon.add(ingredientRepository.findById(15L).get());
			salmon.add(ingredientRepository.findById(18L).get());
			salmon.add(ingredientRepository.findById(39L).get());
			
			List<Ingredient> margarita = new ArrayList<>();
			margarita.add(ingredientRepository.findById(23L).get());
			margarita.add(ingredientRepository.findById(2L).get());
			margarita.add(ingredientRepository.findById(5L).get());
			margarita.add(ingredientRepository.findById(24L).get());
			
			List<Ingredient> quatro = new ArrayList<>();
			quatro.add(ingredientRepository.findById(23L).get());
			quatro.add(ingredientRepository.findById(24L).get());
			quatro.add(ingredientRepository.findById(5L).get());
			quatro.add(ingredientRepository.findById(2L).get());
			quatro.add(ingredientRepository.findById(3L).get());
			quatro.add(ingredientRepository.findById(6L).get());
			
			List<Ingredient> vegeterian = new ArrayList<>();
			vegeterian.add(ingredientRepository.findById(23L).get());
			vegeterian.add(ingredientRepository.findById(24L).get());
			vegeterian.add(ingredientRepository.findById(5L).get());
			vegeterian.add(ingredientRepository.findById(42L).get());
			vegeterian.add(ingredientRepository.findById(19L).get());
			vegeterian.add(ingredientRepository.findById(44L).get());
			vegeterian.add(ingredientRepository.findById(26L).get());
			
			List<Ingredient> caprichioza = new ArrayList<>();
			caprichioza.add(ingredientRepository.findById(23L).get());
			caprichioza.add(ingredientRepository.findById(24L).get());
			caprichioza.add(ingredientRepository.findById(5L).get());
			caprichioza.add(ingredientRepository.findById(26L).get());
			caprichioza.add(ingredientRepository.findById(7L).get());
			caprichioza.add(ingredientRepository.findById(25L).get());
			
			
			List<Ingredient> sopska = new ArrayList<>();
			sopska.add(ingredientRepository.findById(4L).get());
			sopska.add(ingredientRepository.findById(19L).get());
			sopska.add(ingredientRepository.findById(21L).get());
			
			List<Ingredient> mixed = new ArrayList<>();
			mixed.add(ingredientRepository.findById(20L).get());
			mixed.add(ingredientRepository.findById(19L).get());
			mixed.add(ingredientRepository.findById(21L).get());
			mixed.add(ingredientRepository.findById(22L).get());
			
			List<Ingredient> cezar = new ArrayList<>();
			cezar.add(ingredientRepository.findById(41L).get());
			cezar.add(ingredientRepository.findById(19L).get());
			cezar.add(ingredientRepository.findById(22L).get());
			cezar.add(ingredientRepository.findById(40L).get());
			
			List<Ingredient> macedonian = new ArrayList<>();
			macedonian.add(ingredientRepository.findById(43L).get());
			macedonian.add(ingredientRepository.findById(19L).get());
			macedonian.add(ingredientRepository.findById(45L).get());
			macedonian.add(ingredientRepository.findById(44L).get());
			
			
			
			
			List<SubCategory> food = new ArrayList<>();
			food.add(subRepository.findById(9L).get());
			food.add(subRepository.findById(10L).get());
			food.add(subRepository.findById(11L).get());
			food.add(subRepository.findById(12L).get());
			food.add(subRepository.findById(13L).get());
			food.add(subRepository.findById(14L).get());
			
			List<SubCategory> drink = new ArrayList<>();
		
			drink.add(subRepository.findById(1L).get());
			drink.add(subRepository.findById(2L).get());
			drink.add(subRepository.findById(3L).get());
			drink.add(subRepository.findById(4L).get());
			drink.add(subRepository.findById(5L).get());
			
			List<SubCategory> dessert = new ArrayList<>();
			
			dessert.add(subRepository.findById(6L).get());
			dessert.add(subRepository.findById(7L).get());
			dessert.add(subRepository.findById(8L).get());
			
			
			
			
			
			itemRepository.save(new MenuItem(1L,null, "Margarita", 200.00, subRepository.findById(12L).get(), margarita,  "https://www.finedininglovers.com/sites/g/files/xknfdk626/files/styles/recipe_full_desktop/public/2020-09/margherita-50kalo.jpg?itok=09KbHkNy", 5));
			itemRepository.save(new MenuItem(2L,null, "Caprichioza", 250.00, subRepository.findById(12L).get(), caprichioza,  "https://www.goingmywayz.com/wp-content/uploads/2017/03/pizza-Capricciosa2.jpg", 55));
			itemRepository.save(new MenuItem(3L,null, "Vegeterijana", 250.00, subRepository.findById(12L).get(), vegeterian,  "https://www.archanaskitchen.com/images/archanaskitchen/0-Archanas-Kitchen-Recipes/2018/June-07/No_Yeast_Thin_Crust_Veggie_Pizza_Recipe-1.jpg", 5));
			itemRepository.save(new MenuItem(4L,null, "Quatro Formagio", 350.00, subRepository.findById(12L).get(), quatro,  "https://www.schaer.com/sites/default/files/styles/header_large/public/HeaderProducts_Pizza%204%20Formaggi.webp?itok=hfBO_0un", 5));
			itemRepository.save(new MenuItem(5L,null, "BeffStake 300 gr", 500.00, subRepository.findById(9L).get(), beefstake,  "https://i.dlpng.com/static/png/7307915_preview.png", 5));
			itemRepository.save(new MenuItem(6L,null, "Pork Ribs 500gr", 450.00, subRepository.findById(9L).get(), porkRibs,  "https://www.rockrecipes.com/wp-content/uploads/2016/08/Make-Ahead-Ribs-close-up-photo-of-individually-cut-ribs.jpg", 5));
			itemRepository.save(new MenuItem(7L,null, "Kebap 10 pc", 200.00, subRepository.findById(9L).get(), kebap,  "https://image.shutterstock.com/image-photo/balkan-cuisine-cevapi-grilled-dish-260nw-1026969340.jpg", 5));
			itemRepository.save(new MenuItem(8L,null, "Chicken Brest 300gr", 250.00, subRepository.findById(9L).get(), chicken,  "https://www.africanbites.com/wp-content/uploads/2018/07/IMG_2425.jpg", 5));
			itemRepository.save(new MenuItem(9L,null, "Salmon 500gr", 400.00, subRepository.findById(11L).get(), salmon,  "https://www.cookingclassy.com/wp-content/uploads/2019/06/brown-sugar-lime-baked-salmon-22-768x1152.jpg", 5));
			itemRepository.save(new MenuItem(10L,null, "Orada 500gr", 750.00, subRepository.findById(11L).get(), orada,  "https://image.jimcdn.com/app/cms/image/transf/dimension=455x1024:format=jpg/path/sdcd146a3ef2c96c2/image/ic3e7c4fbee3b0795/version/1610023607/image.jpg", 5));
			itemRepository.save(new MenuItem(11L,null, "Trout 500gr", 800.00, subRepository.findById(11L).get(), trout,  "https://media-cdn.tripadvisor.com/media/photo-s/18/6b/0a/50/ohrid-trout.jpg", 5));
			itemRepository.save(new MenuItem(12L,null, "Millanezze", 250.00, subRepository.findById(12L).get(), milaneze,  "https://www.mastercook.com/app/Image/8487222/2718046.jpg", 8));
			itemRepository.save(new MenuItem(13L,null, "Bollogneze", 250.00, subRepository.findById(12L).get(), bolonjeze,  "https://www.homemaderecipesfromscratch.com/wp-content/webp-express/webp-images/uploads/2020/05/spaghetti-bolognese-1-official-1024x576.png.webp", 5));
			itemRepository.save(new MenuItem(14L,null, "4 x 50 gr Cheese Plate", 250.00, subRepository.findById(13L).get(), cheese,  "https://media.istockphoto.com/photos/mixed-cheese-platter-picture-id509760299?s=612x612", 5));
			itemRepository.save(new MenuItem(15L,null, "4 x 100 gr Cheese Plate", 450.00, subRepository.findById(13L).get(), cheese,  "https://image.shutterstock.com/image-photo/cheese-platter-plate-mixed-600w-655605481.jpg", 5));
			itemRepository.save(new MenuItem(16L,null, "4 x 50 gr Dry Meats Plate", 350.00, subRepository.findById(13L).get(), meat,  "https://thumbs.dreamstime.com/z/mixed-italian-dried-meats-platter-croutons-grapes-plate-located-black-table-as-background-172798616.jpg", 5));
			itemRepository.save(new MenuItem(17L,null, "4 x 100 gr Dry Meats Plate", 650.00, subRepository.findById(13L).get(), meat,  "https://previews.123rf.com/images/jackf/jackf2002/jackf200204919/140547016-top-view-of-traditional-spanish-meat-platter-sliced-dry-cured-jamon-bacon-and-sausages-on-wooden-boa.jpg", 7));
			itemRepository.save(new MenuItem(18L,null, "600 gr Mixed Fried Plate", 250.00, subRepository.findById(14L).get(), fried,  "https://media-cdn.tripadvisor.com/media/photo-s/18/55/56/86/single-fried-platter.jpg", 5));
			itemRepository.save(new MenuItem(19L,null, "Sopska", 120.00, subRepository.findById(10L).get(), sopska,  "https://makturk.com/wp-content/uploads/2016/03/shopska-salata-2-696x464.jpg", 5));
			itemRepository.save(new MenuItem(20L,null, "Mixed Fresh", 100.00, subRepository.findById(10L).get(), mixed,  "https://kajmece.com/wp-content/uploads/2016/01/mesana-salata.jpg", 5));
			itemRepository.save(new MenuItem(21L,null, "Cezar", 200.00, subRepository.findById(10L).get(), cezar,  "https://cdn.shortpixel.ai/client/to_webp,q_lossy,ret_img,w_630/http://napravisam.mk/wp-content/uploads/2016/02/Ednostaven-recept-za-preubava-Cezar-salata-1.jpg", 5));
			itemRepository.save(new MenuItem(22L,null, "Macedonian", 130.00, subRepository.findById(10L).get(), macedonian,  "https://moirecepti.mk/content/uploads/2020/07/IMG_20200709_164052_149-1f6c28-800x483.jpg", 5));
			
			producerRepository.save(new Producer(1L, "Skopska Pivara"));
			producerRepository.save(new Producer(2L, "Prilepska Pivara"));
			producerRepository.save(new Producer(3L, "Tikves"));
			producerRepository.save(new Producer(4L, "Bovin"));
			producerRepository.save(new Producer(5L, "Nestle"));
			producerRepository.save(new Producer(6L, "Johnnie Walker"));
			producerRepository.save(new Producer(7L, "Pelisterka"));
			producerRepository.save(new Producer(8L, "Gorska"));
			producerRepository.save(new Producer(9L, "Jack Daniel's"));
			
			itemRepository.save(new MenuItem(23L,null,"Honey And Nuts", 150.00, subRepository.findById(6L).get(),honey,"https://thumbs.dreamstime.com/z/crepes-honey-nuts-crepes-suzette-honey-nuts-white-plate-over-dark-background-copy-space-delicious-homemade-107134983.jpg", 5));
			itemRepository.save(new MenuItem(24L,null,"Cream And Banana", 150.00, subRepository.findById(6L).get(),banana , "https://previews.123rf.com/images/rakratchada/rakratchada1305/rakratchada130500157/20008883-banana-crepe-rolls-filled-with-white-cream-and-banana-topping-with-chocolate-syrup-served-with-whipp.jpg", 7));
			itemRepository.save(new MenuItem(25L,null,"Nutella And Vanilla", 150.00, subRepository.findById(7L).get(),nutella, "https://i2.wp.com/bakingmischief.com/wp-content/uploads/2018/11/nutella-sauce-photo-683x1024.jpg",  5));
			itemRepository.save(new MenuItem(26L,null,"Mixed Forest Fruits", 150.00, subRepository.findById(7L).get(),forest, "https://barefeetinthekitchen.com/wp-content/uploads/2013/02/Mixed-Berry-Ice-Cream-6-1-of-1-1024x732.jpg", 5));
			itemRepository.save(new MenuItem(27L,null,"Strachatella", 150.00, subRepository.findById(7L).get(),strachatela, "https://www.karlijnskitchen.com/wp-content/uploads/2019/07/low-fodmap-stracciatella-ijs-beter-1.jpg",5));
			itemRepository.save(new MenuItem(28L,null,"Ohridska", 150.00, subRepository.findById(8L).get(),ohrid, "https://i.pinimg.com/564x/48/4c/80/484c80d8126113a059f22d7d36e6fd9a.jpg", 5));
			itemRepository.save(new MenuItem(29L,null,"Cheese Cake", 150.00, subRepository.findById(8L).get(), cheeseCake,"https://sugarspunrun.com/wp-content/uploads/2019/01/Best-Cheesecake-Recipe-2-1-of-1-7.jpg", 5));
			itemRepository.save(new MenuItem(30L,null,"Nutella And Nuts", 150.00, subRepository.findById(8L).get(),nutellaCake,"https://i.pinimg.com/564x/0a/4d/2f/0a4d2fb7fa6109d8329a965de528957f.jpg", 5));

			itemRepository.save(new MenuItem(31L,producerRepository.findById(1L).get(),"Fanta 1 lit",50.00,subRepository.findById(4L).get(),null,"https://www.paket.mk/wp-content/uploads/2017/06/ZMA32111-800x800.jpg", 5));
			itemRepository.save(new MenuItem(32L,producerRepository.findById(1L).get(),"Coca-Cola 1 lit",80.00,subRepository.findById(4L).get(),null,"https://www.paket.mk/wp-content/uploads/2018/07/ZMA28243-1-800x800.jpg",5));
			itemRepository.save(new MenuItem(33L,producerRepository.findById(1L).get(),"Fanta 0.5 lit",40.00,subRepository.findById(4L).get(),null,"https://www.paket.mk/wp-content/uploads/2017/06/ZMA12305-800x800.jpg", 5));
			itemRepository.save(new MenuItem(34L,producerRepository.findById(1L).get(),"Coca-Cola 0.5 lit",40.00,subRepository.findById(4L).get(),null,"https://www.paket.mk/wp-content/uploads/2019/11/SKP19437-1-800x800.jpg",5));
			itemRepository.save(new MenuItem(35L,producerRepository.findById(1L).get(),"Skopsko 1,5 lit",120.00,subRepository.findById(2L).get(),null,"https://e-tinex.mk/TinexImagesPrivremeno/501563.jpg", 5));
			itemRepository.save(new MenuItem(36L,producerRepository.findById(1L).get(),"Skopsko Smuth 1,5 lit",150.00,subRepository.findById(2L).get(),null,"https://e-tinex.mk/TinexImagesPrivremeno/600290.jpg",5));
			itemRepository.save(new MenuItem(37L,producerRepository.findById(1L).get(),"Skopsko 0.5 lit",80.00,subRepository.findById(2L).get(),null,"https://cdn.shopify.com/s/files/1/2216/3143/products/Skopsko-0.33l_800x.jpg?v=1569050875", 5));
			itemRepository.save(new MenuItem(38L,producerRepository.findById(1L).get(),"Heineken 0.33 lit",100.00,subRepository.findById(2L).get(),null,"https://www.paket.mk/wp-content/uploads/2017/06/ZMA20794-1-800x800.jpg",5));
		
			itemRepository.save(new MenuItem(39L,producerRepository.findById(2L).get(),"Zlaten Dab 0.5 lit",80.00,subRepository.findById(2L).get(),null,"https://verodrive.vero.com.mk/wp-content/uploads/2020/04/2600898020pivo20zlaten20dab20klasik200.5l20staklo.jpg", 5));
			itemRepository.save(new MenuItem(40L,producerRepository.findById(2L).get(),"Zlaten Dab Dark 0.33 lit",70.00,subRepository.findById(2L).get(),null,"https://verodrive.vero.com.mk/wp-content/uploads/2020/04/2600466920pivo20zlaten20dab20temno200.5l.jpg",5));
			itemRepository.save(new MenuItem(41L,producerRepository.findById(2L).get(),"Pepsi 1 lit",50.00,subRepository.findById(4L).get(),null,"https://beercastleny.com/wp-content/uploads/2017/11/Pepsi-Bottles-1L-1ct.jpg", 5));
			itemRepository.save(new MenuItem(42L,producerRepository.findById(2L).get(),"Zlaten Dab 1,5 lit",100.00,subRepository.findById(2L).get(),null,"https://e-tinex.mk/TinexImagesPrivremeno/300505.jpg",5));
			itemRepository.save(new MenuItem(43L,producerRepository.findById(2L).get(),"Pepsi 0.5 lit",40.00,subRepository.findById(4L).get(),null,"https://secure.ce-tescoassets.com/assets/CZ/509/8594008040509/ShotType1_540x540.jpg", 5));
			itemRepository.save(new MenuItem(44L,producerRepository.findById(2L).get(),"Tuborg 0.75 lit",90.00,subRepository.findById(2L).get(),null,"https://e-tinex.mk/TinexImagesPrivremeno/115019.jpg",5));
			
			itemRepository.save(new MenuItem(45L,producerRepository.findById(8L).get(),"Gorska Negazirana 1 lit",70.00,subRepository.findById(5L).get(),null,"https://kupigorska.mk/sites/default/files/images/products/gorska_negazirana_staklo_0.75_nova_etiketa_novo_kapache_635x687.png", 5));
			itemRepository.save(new MenuItem(46L,producerRepository.findById(8L).get(),"Gorska Gazirana 1,5 lit",70.00,subRepository.findById(5L).get(),null,"https://onestopshop.mk/wp-content/uploads/2020/07/gorska-voda-gazirana-1.5l-011790-600x600.jpg",5));
			itemRepository.save(new MenuItem(47L,producerRepository.findById(8L).get(),"Gorska Negazirana 0.25 lit",80.00,subRepository.findById(5L).get(),null,"https://www.gorska.com.mk/sites/default/files/2014/09/01/gorska_sport_par_flashi_0.png", 5));
			itemRepository.save(new MenuItem(48L,producerRepository.findById(8L).get(),"Gorska Gazirana 0.25 lit",100.00,subRepository.findById(5L).get(),null,"https://onestopshop.mk/wp-content/uploads/2021/03/3-2-1-600x600.jpg",5));
			itemRepository.save(new MenuItem(49L,producerRepository.findById(7L).get(),"Pelisterka Gazirana 1,5 lit",80.00,subRepository.findById(5L).get(),null,"https://onestopshop.mk/wp-content/uploads/2020/09/pelisterka-gazirana-1.5l-10150-600x600.jpg", 5));
			itemRepository.save(new MenuItem(50L,producerRepository.findById(7L).get(),"Pelisterka Gazirana 0.75 lit",70.00,subRepository.findById(5L).get(),null,"https://balkanwater.md/wp-content/uploads/2020/11/pg75.png",5));
			itemRepository.save(new MenuItem(51L,producerRepository.findById(7L).get(),"Pelisterka Negazirana 0.75 lit",70.00,subRepository.findById(5L).get(),null,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXv00nVksOXiPJK-8DPPUDd6W6RlxZ1w4cJVMgQNFtxY3rRmCi49AWq3T1aZvSjs2_xrQ&usqp=CAU", 5));
			
			itemRepository.save(new MenuItem(52L,producerRepository.findById(3L).get(),"Special Selection 0.75 lit",1000.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-merlot-special-selection-tikves-075l-60412e1726ac4.jpg",5));
			itemRepository.save(new MenuItem(53L,producerRepository.findById(3L).get(),"Alexandria Couve 0.75 lit",1140.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-tikves_alexandria_cuvee_rose_075l_381.jpg", 5));
			itemRepository.save(new MenuItem(54L,producerRepository.findById(3L).get(),"T'ga za Jug 0.75 lit",790.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-tga_za_jug_tikves_075l_145.jpg",5));
			itemRepository.save(new MenuItem(55L,producerRepository.findById(3L).get(),"Temjanika 0.75 lit",770.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-temjanika_tikves_075l_992.jpg", 5));
			itemRepository.save(new MenuItem(56L,producerRepository.findById(3L).get(),"Bela Voda 0.75 lit",1700.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/images/bela_voda_tikves_075l_507.jpg",5));
			itemRepository.save(new MenuItem(57L,producerRepository.findById(3L).get(),"T'ga za jug 0.25 lit",180.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-tga_za_jug_tikves_075l_145.jpg", 5));
			itemRepository.save(new MenuItem(58L,producerRepository.findById(3L).get(),"Alexandria belo 0.25 lit",160.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-vino_aleksandria_bela_02l_568.jpg",5));
			itemRepository.save(new MenuItem(59L,producerRepository.findById(3L).get(),"Alexandria crveno 0.25 lit",160.00,subRepository.findById(1L).get(),null,"https://www.ediskont.rs/uploads/store/products/thumbnails/tmb-aleksandria_crna_02l_931.jpg", 5));
			itemRepository.save(new MenuItem(60L,producerRepository.findById(3L).get(),"Barovo 0.75 lit",1800.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2017/11/Barovo-White-png.png",5));
			itemRepository.save(new MenuItem(61L,producerRepository.findById(4L).get(),"Dissan 0.75 lit",1770.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2017/11/9_Bovin-Dissan-Barrique-2010-750ml-375x400.png", 5));
			itemRepository.save(new MenuItem(62L,producerRepository.findById(4L).get(),"Darron 0.75 lit",1700.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2017/11/bovin-red-wine-daron-375x400.png",5));
			itemRepository.save(new MenuItem(63L,producerRepository.findById(4L).get(),"Alexandar 0.75 lit",1140.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2020/04/bovin-red-wine-alexandar-375x400.png", 5));
			itemRepository.save(new MenuItem(64L,producerRepository.findById(4L).get(),"Venus 0.75 lit",1190.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2017/11/bovin-red-wine-venus-375x400.png",5));
			itemRepository.save(new MenuItem(65L,producerRepository.findById(4L).get(),"Imperator 0.75 lit",2770.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2017/11/bovin-red-wine-imperator-375x400.png", 5));
			itemRepository.save(new MenuItem(66L,producerRepository.findById(4L).get(),"Chardonnay 0.75 lit",1700.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2020/04/Chardonnay-the-one-copy-375x400.png",5));
			itemRepository.save(new MenuItem(67L,producerRepository.findById(4L).get(),"Chardonnay Barique 0.75 lit",3180.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2017/11/5_Chardonnay-Barrique-375x400.png", 5));
			itemRepository.save(new MenuItem(68L,producerRepository.findById(4L).get(),"Temjanika 0.75 lit",1160.00,subRepository.findById(1L).get(),null,"https://wine.mk/wp-content/uploads/2017/11/Muscat-Temjanika-375x400.png",5));
			itemRepository.save(new MenuItem(69L,producerRepository.findById(4L).get(),"Sv. Trifun 0.5 lit",760.00,subRepository.findById(3L).get(),null,"https://wine.mk/wp-content/uploads/2020/04/bovin-brandy-yellow-375x400.png", 5));
			itemRepository.save(new MenuItem(70L,producerRepository.findById(4L).get(),"Sv. Trifun Premium 0.5 lit",1200.00,subRepository.findById(3L).get(),null,"https://wine.mk/wp-content/uploads/2020/04/bovin-brandy-sv-trifun-premium-375x400.png",5));
			
			locationRepository.save(new Location(1L, "Partizanska", "11", "1000", "Skopje", "https://i.insider.com/596e3d09dde1891cc024878c?width=700&format=jpeg&auto=webp", "076151159"));
			locationRepository.save(new Location(2L, "Jane Sandanski", "12", "1000", "Skopje", "https://i.insider.com/596e3d09dde1891cc024878f?width=700&format=jpeg&auto=webp", "077152159"));
			locationRepository.save(new Location(3L, "Heraklea", "13", "7000", "Bitola", "https://i.insider.com/596e3d09dde1891cc0248789?width=700&format=jpeg&auto=webp", "078153159"));
			locationRepository.save(new Location(4L, "Turisticka", "14", "6000", "Ohrid", "https://i.insider.com/596e3d09dde1891cc024878a?width=700&format=jpeg&auto=webp", "070154159"));
			locationRepository.save(new Location(5L, "Petar Demirski", "9", "1440", "Negotino", "https://i.insider.com/594c2fcd16160f1f008b4666?width=700&format=jpeg&auto=webp", "071154159"));
			locationRepository.save(new Location(6L, "Dziklova", "10", "2310", "Vinica", "https://i.insider.com/594c31fa298d4aab0f8b463d?width=700&format=jpeg&auto=webp", "072154159"));
			} catch (Exception e) {
			System.err.println(e);
		}
	
	}



}
