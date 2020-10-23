/**
 * 
 */
package com.tajhotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tajhotels.model.Menu;
import com.tajhotels.repository.MenuRepository;

/**
 * @author Rohit
 *
 */
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuRepository menuRepository;

	@Override
	public List<Menu> getMenuByRestaurant(String restaurant) {
		return menuRepository.findByRestaurantRestaurantName(restaurant);
	}

	@Override
	public List<Menu> getMenuByRestaurantJPQL(String restaurant) {

		return menuRepository.findMenuByRestaurantJPQL(restaurant);
	}

	@Override
	public List<Menu> getMenuByRestaurantSQL(String restaurant) {
		// TODO Auto-generated method stub
		return menuRepository.findMenuByRestaurantSQL(restaurant);
	}

}
