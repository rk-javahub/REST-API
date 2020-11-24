/**
 * 
 */
package com.tajhotels.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tajhotels.model.Restaurant;
import com.tajhotels.service.RestaurantService;

/**
 * @author Rohit
 *
 */
@RestController
@RequestMapping("/restaurant-management")
public class RestaurantController {
	@Autowired
	RestaurantService restaurantService;

	@PostMapping("/add-restaurant")
	ResponseEntity<Restaurant> addRestaurant(@RequestBody @Valid Restaurant restaurant) {
		Restaurant restaurant1 = restaurantService.addRestaurant(restaurant);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Description", "One Restaurant added");
		return ResponseEntity.ok().headers(headers).body(restaurant1);
	}

	@PutMapping("/update-restaurant")
	ResponseEntity<String> updateRestaurant(@RequestBody @Valid Restaurant restaurant) {
		restaurantService.updateRestaurant(restaurant);
		return ResponseEntity.ok("Restaurant updated");
	}

	@GetMapping("/get-restaurant/{restaurantid}")
	ResponseEntity<Restaurant> getRestaurantById(@PathVariable int restaurantid) {
		Restaurant restaurant = restaurantService.getRestaurantById(restaurantid);
		return ResponseEntity.ok().header("Description", "One Restaurant instance retrived").body(restaurant);
	}

	@DeleteMapping("/delete-restaurant/{restaurantid}")
	ResponseEntity<Void> deleteRestaurant(@PathVariable int restaurantid) {
		restaurantService.deleteRestaurant(restaurantid);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/get-restaurantbycity/{cityname}")
	ResponseEntity<List<Restaurant>> getRestaurantByCity(@PathVariable String cityname) {
		List<Restaurant> restaurants = restaurantService.getRestaurantByCity(cityname);
		return ResponseEntity.ok(restaurants);
	}

	@GetMapping("/get-restaurantbymenu/{menuname}")
	ResponseEntity<List<Restaurant>> getRestaurantByMenu(@PathVariable String menuname) {
		List<Restaurant> restaurants = restaurantService.getRestaurantByMenu(menuname);
		return ResponseEntity.ok(restaurants);
	}

	@GetMapping("/get-restaurantbydelivery/{deliveryname}")
	ResponseEntity<List<Restaurant>> getRestaurantByDelivery(@PathVariable String deliveryname) {
		List<Restaurant> restaurants = restaurantService.getRestaurantByDelivery(deliveryname);
		return ResponseEntity.ok(restaurants);
	}

	@GetMapping("/get-restaurantbylocation/{location}")
	ResponseEntity<List<Restaurant>> getRestaurantByLocation(@PathVariable String location) {
		List<Restaurant> restaurants = restaurantService.getRestaurantByLocation(location);
		return ResponseEntity.ok(restaurants);
	}

	@GetMapping("/get-restaurantbycityandmenu/location/{location}/menuname/{menuname}")
	ResponseEntity<List<Restaurant>> getRestaurantByLocationAndMenu(@PathVariable String location,
			@PathVariable String menuname) {
		List<Restaurant> restaurants = restaurantService.getRestaurantByLocationAndMenu(location, menuname);
		return ResponseEntity.ok(restaurants);
	}
}
