/**
 * 
 */
package com.tajhotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tajhotels.model.Restaurant;
import com.tajhotels.repository.RestaurantRepository;

/**
 * @author Rohit
 *
 */
@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;

	@Override
	public void addRestaurant(Restaurant restaurant) {
		System.out.println("Hello");
		restaurantRepository.save(restaurant);
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);

	}

	@Override
	public Restaurant getRestaurantById(Integer restaurantId) {
		return restaurantRepository.findById(restaurantId).get();
	}

	@Override
	public void deleteRestaurant(Integer restaurantId) {
		restaurantRepository.deleteById(restaurantId);

	}

	@Override
	public List<Restaurant> getRestaurantByCity(String city) {
		return restaurantRepository.findByAddressCity(city);
	}

	@Override
	public List<Restaurant> getRestaurantByLocation(String location) {
		return restaurantRepository.findByAddressStreetName(location);
	}

	@Override
	public List<Restaurant> getRestaurantByMenu(String menuName) {
		return restaurantRepository.getRestaurantByMenu(menuName);
	}

	@Override
	public List<Restaurant> getRestaurantByDelivery(String partnerName) {
		return restaurantRepository.getRestaurantByDelivery(partnerName);
	}

	@Override
	public List<Restaurant> getRestaurantByLocationAndMenu(String location, String menuName) {
		
		return restaurantRepository.getRestaurantByLocationAndMenu(location, menuName);
	}

}
