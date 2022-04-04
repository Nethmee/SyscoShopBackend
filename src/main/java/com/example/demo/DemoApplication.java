package com.example.demo;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Nethmee!");



	}



	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		Category c= new Category();
		c.setCategoryName("Food");
		c.setCategoryName("Supplies_&_Equipement");
		c.setCategoryName("Paper_&_Disposal");
		c.setCategoryName("Chemical_&_Janitorial");
		c.setCategoryName("Healthcare_&_Hospitality");

		Product p = new Product();
		p.setProductName("Lemons");
		p.setQuantity(5);
		p.setDescription("This is a weighted item. The exact quantity which you receive may differ slightly and as a result, your final bill will reflect not only the difference, but the prevailing price as charged per kg.");
		p.setRating(3);
		p.setSupplier("");
		p.setUnitPrice(134.50f);
		p.setUrl("https://images.pexels.com/photos/10821196/pexels-photo-10821196.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
		productRepository.save(p);

		Product p1 = new Product();
		p1.setProductName("Arugala");
		p1.setQuantity(15);
		p1.setDescription("Arugula or rocket is an edible annual plant in the family Brassicaceae used as a leaf vegetable for its fresh, tart, bitter, and peppery flavor. Other common names include garden rocket, and eruca.");
		p1.setRating(4.5f);
		p1.setSupplier("Tom Radcliff");
		p1.setUnitPrice(199.50f);
		p1.setUrl("https://images.pexels.com/photos/3298064/pexels-photo-3298064.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		productRepository.save(p1);

		Product p2 = new Product();
		p.setProductName("Pumpkin");
		p.setQuantity(7);
		p.setDescription("A pumpkin is a cultivar of winter squash that is round with smooth, slightly ribbed skin, and is most often deep yellow to orange in coloration.");
		p.setRating(2.5f);
		p.setSupplier("Jeff Peterson");
		p.setUnitPrice(25.50f);
		p.setUrl("https://images.pexels.com/photos/6129264/pexels-photo-6129264.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		productRepository.save(p);

		p.setProductName("Sakura Shrimp");
		p.setQuantity(15);
		p.setDescription("A pumpkin is a cultivar of winter squash that is round with smooth, slightly ribbed skin, and is most often deep yellow to orange in coloration.");
		p.setRating(5);
		p.setSupplier("Jeff Peterson");
		p.setUnitPrice(325.50f);
		p.setUrl("https://images.pexels.com/photos/4471757/pexels-photo-4471757.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260");
		productRepository.save(p);

		p.setProductName("Shrimp");
		p.setQuantity(15);
		p.setDescription("A pumpkin is a cultivar of winter squash that is round with smooth, slightly ribbed skin, and is most often deep yellow to orange in coloration.");
		p.setRating(5);
		p.setSupplier("Jeff Peterson");
		p.setUnitPrice(325.50f);
		p.setUrl("https://images.pexels.com/photos/3680164/pexels-photo-3680164.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
		productRepository.save(p);

		p.setProductName("Pork");
		p.setQuantity(15);
		p.setDescription("Pork is the culinary name for the meat of the domestic pig. It is the most commonly consumed meat worldwide, with evidence of pig husbandry dating back to 5000 BC.");
		p.setRating(5);
		p.setSupplier("Jeff Peterson");
		p.setUnitPrice(325.50f);
		p.setUrl("https://images.pexels.com/photos/5774154/pexels-photo-5774154.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		productRepository.save(p);
	}
}


