/**
 * 
 */
package com.tajhotels.service;

import java.util.List;

import com.tajhotels.exceptionhandling.RestaurantNotFoundException;
import com.tajhotels.model.Restaurant;

/**
 * @author Rohit
 *
 */
public interface RestaurantService {
	Restaurant addRestaurant(Restaurant restaurant);

	Restaurant updateRestaurant(Restaurant restaurant);

	Restaurant getRestaurantById(Integer restaurantId);

	void deleteRestaurant(int restaurantId);

	List<Restaurant> getAllRestaurants();

	List<Restaurant> getRestaurantByCity(String city) throws RestaurantNotFoundException;

	List<Restaurant> getRestaurantByMenu(String menuName) throws RestaurantNotFoundException;

	List<Restaurant> getRestaurantByDelivery(String aprtnerName) throws RestaurantNotFoundException;

	List<Restaurant> getRestaurantByLocation(String location) throws RestaurantNotFoundException;

	List<Restaurant> getRestaurantByLocationAndMenu(String location, String menuName)
			throws RestaurantNotFoundException;

}
