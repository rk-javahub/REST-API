/**
 * 
 */
package com.tajhotels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tajhotels.model.Restaurant;

/**
 * @author Rohit
 *
 */
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
	List<Restaurant> findByAddressCity(String city);

	List<Restaurant> findByAddressStreetName(String location);
	
	@Query("FROM Restaurant r INNER JOIN r.menuList m WHERE m.menuName=?1")
	List<Restaurant> getRestaurantByMenu(String menuName);
	
	@Query("FROM Restaurant r INNER JOIN r.delivery d WHERE d.partnerName=?1")
	List<Restaurant> getRestaurantByDelivery(String partnerName);
	
	@Query("FROM Restaurant r INNER JOIN r.address ad INNER JOIN r.menuList m where ad.streetName=?1 AND m.menuName=?2")
	List<Restaurant> getRestaurantByLocationAndMenu(String location, String menuName);

}
