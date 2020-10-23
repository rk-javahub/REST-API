package com.tajhotels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tajhotels.model.Restaurant;
import com.tajhotels.service.DeliveryService;
import com.tajhotels.service.RestaurantService;

@SpringBootApplication
public class RestaurantApiApplication implements CommandLineRunner {
	@Autowired
	RestaurantService restaurantService;

	@Autowired
	DeliveryService deliveryService;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * // Setting Address entity Address address = new Address();
		 * address.setCity("Solapur"); address.setState("Maharashtra");
		 * address.setStreetName("Hotgi Road"); address.setZipcode(411014);
		 * 
		 * //Setting Munu entity Menu menu = new Menu(); menu.setMenuName("Thali");
		 * menu.setPrice(200d);
		 * 
		 * Menu menu1 = new Menu(); menu1.setMenuName("Lassi"); menu1.setPrice(40d);
		 * 
		 * Set<Menu> menuList = new HashSet<Menu>(); menuList.add(menu);
		 * menuList.add(menu1);
		 * 
		 * //Setting Delivery entity Delivery delivery = new Delivery();
		 * delivery.setPartnerName("Zomato"); delivery.setCharges(50d);
		 * 
		 * Delivery delivery1 = new Delivery(); delivery1.setPartnerName("Swiggi");
		 * delivery1.setCharges(45d);
		 * 
		 * Delivery delivery2 = new Delivery(); delivery2.setPartnerName("Uber Eats");
		 * delivery2.setCharges(45d);
		 * 
		 * Set<Delivery> deliveryList = new HashSet<Delivery>();
		 * deliveryList.add(delivery); deliveryList.add(delivery1);
		 * deliveryList.add(delivery2);
		 * 
		 * //Setting restaurant entity Restaurant restaurant = new Restaurant();
		 * restaurant.setRestaurantName("Kinara Hotel"); restaurant.setAddress(address);
		 * restaurant.setMenuList(menuList); restaurant.setDelivery(deliveryList);
		 * 
		 * System.out.println(restaurant); restaurantService.addRestaurant(restaurant);
		 */

		/*
		 * System.out.println("Restaurants in Pune");
		 * restaurantService.getRestaurantByCity("Pune").stream().forEach((r)
		 * ->System.out.println(r.getRestaurantName()));
		 * 
		 * System.out.println("\nRestaurants at Hotgi Road location");
		 * restaurantService.getRestaurantByLocation("Hotgi Road").stream().forEach((r)
		 * ->System.out.println(r.getRestaurantName()));
		 * 
		 * System.out.println("\nRestaurants whos Menu List contain Roti");
		 * restaurantService.getRestaurantByMenu("Roti").stream().forEach((r)
		 * ->System.out.println(r.getRestaurantName()));
		 * 
		 * System.out.println("\nRestaurants who provide delivery service by Swiggi");
		 * restaurantService.getRestaurantByDelivery("Uber Eats").stream().forEach((r)
		 * ->System.out.println(r.getRestaurantName()));
		 */

		
		System.out.println("\nRestaurants in Solapur which Provide Lassi");
		restaurantService.getRestaurantByLocationAndMenu("Hotgi Road", "lassi").stream()
				.forEach((r) -> System.out.println(r.getRestaurantName() +" "+r.getAddress().getCity()));

	}
}
