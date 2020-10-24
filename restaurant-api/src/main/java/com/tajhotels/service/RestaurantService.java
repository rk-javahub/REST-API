/**
 * 
 */
package com.tajhotels.service;

import java.util.List;

import com.tajhotels.model.Restaurant;

/**
 * @author Rohit
 *
 */
public interface RestaurantService {
	Restaurant addRestaurant(Restaurant restaurant);

	Restaurant updateRestaurant(Restaurant restaurant);

	Restaurant getRestaurantById(Integer restaurantId);

	void deleteRestaurant(Integer restaurantId);

	List<Restaurant> getRestaurantByCity(String city);

	List<Restaurant> getRestaurantByMenu(String menuName);
	
	List<Restaurant> getRestaurantByDelivery(String aprtnerName);
	
	List<Restaurant> getRestaurantByLocation(String location);
	
	List<Restaurant> getRestaurantByLocationAndMenu(String location,String menuName);

}
