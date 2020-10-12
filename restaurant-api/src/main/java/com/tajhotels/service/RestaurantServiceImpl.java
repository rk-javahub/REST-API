/**
 * 
 */
package com.tajhotels.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tajhotels.model.Restaurant;

/**
 * @author Rohit
 *
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Override
	public void addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub

	}

	@Override
	public Restaurant getRestaurantById(Integer restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRestaurant(Integer restaurantId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Restaurant> getRestaurantByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurantByMenu(String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurantByDelivery(String aprtnerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurantByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getRestaurantByLocationAndMenu(String location, String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

}
