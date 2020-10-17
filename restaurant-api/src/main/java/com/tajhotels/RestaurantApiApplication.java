package com.tajhotels;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tajhotels.model.Address;
import com.tajhotels.model.Delivery;
import com.tajhotels.model.Menu;
import com.tajhotels.model.Restaurant;
import com.tajhotels.service.RestaurantService;

@SpringBootApplication
public class RestaurantApiApplication implements CommandLineRunner {
	@Autowired
	RestaurantService restaurantService;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Setting Address entity
		Address address = new Address();
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setStreetName("Marine lines road");
		address.setZipcode(411325);

		//Setting Munu entity
		Menu menu = new Menu();
		menu.setMenuName("Chicken Masala");
		menu.setPrice(250d);

		Menu menu1 = new Menu();
		menu1.setMenuName("Roti");
		menu1.setPrice(15d);

		Set<Menu> menuList = new HashSet<Menu>();
		menuList.add(menu);
		menuList.add(menu1);

		//Setting Delivery entity
		Delivery delivery = new Delivery();
		delivery.setPartnerName("Zomato");
		delivery.setCharges(50d);

		Delivery delivery1 = new Delivery();
		delivery1.setPartnerName("Swiggi");
		delivery1.setCharges(45d);

		Set<Delivery> deliveryList = new HashSet<Delivery>();
		deliveryList.add(delivery);
		deliveryList.add(delivery1);

		//Setting restaurant entity
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantName("Taj");
		restaurant.setAddress(address);
		restaurant.setMenuList(menuList);
		restaurant.setDelivery(deliveryList);

		System.out.println(restaurant);
		restaurantService.addRestaurant(restaurant);
	}
}
