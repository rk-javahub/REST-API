/**
 * 
 */
package com.tajhotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tajhotels.exceptionhandling.RestaurantIdNotFoundException;
import com.tajhotels.exceptionhandling.RestaurantNotFoundException;
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
	public Restaurant addRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);

	}

	@Override
	public Restaurant getRestaurantById(Integer restaurantId) {
		return restaurantRepository.findById(restaurantId)
				.orElseThrow(() -> new RestaurantIdNotFoundException("Restaurant Id not found..."));
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		restaurantRepository.deleteById(restaurantId);

	}

	@Override
	public List<Restaurant> getRestaurantByCity(String city) {
		List<Restaurant> restaurants = restaurantRepository.findByAddressCity(city);
		if (restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("Restaurant not found in city : " + city);
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> getRestaurantByLocation(String location) {
		List<Restaurant> restaurants = restaurantRepository.findByAddressStreetName(location);
		if (restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("Restaurant not found at given location : " + location);
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> getRestaurantByMenu(String menuName) {
		List<Restaurant> restaurants = restaurantRepository.getRestaurantByMenu(menuName);
		if (restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("Restaurant not found which provide given menu : " + menuName);
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> getRestaurantByDelivery(String partnerName) {
		List<Restaurant> restaurants = restaurantRepository.getRestaurantByDelivery(partnerName);
		if (restaurants.isEmpty()) {
			throw new RestaurantNotFoundException(
					"Cant find restaurant which covered by delivery service : " + partnerName);
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> getRestaurantByLocationAndMenu(String location, String menuName) {
		List<Restaurant> restaurants = restaurantRepository.getRestaurantByLocationAndMenu(location, menuName);
		if (restaurants.isEmpty()) {
			throw new RestaurantNotFoundException(
					"Cant find restaurant at location : " + location + " providing menu : " + menuName);
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.findAll();
	}
}
