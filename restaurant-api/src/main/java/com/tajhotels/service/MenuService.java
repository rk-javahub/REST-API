package com.tajhotels.service;

import java.util.List;

import com.tajhotels.model.Menu;

public interface MenuService {
	List<Menu> getMenuByRestaurant(String restaurant);
	
	List<Menu> getMenuByRestaurantJPQL(String restaurant);
	
	List<Menu> getMenuByRestaurantSQL(String restaurant);

}
