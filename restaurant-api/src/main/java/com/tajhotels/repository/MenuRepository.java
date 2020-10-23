/**
 * 
 */
package com.tajhotels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tajhotels.model.Menu;
import com.tajhotels.model.Restaurant;

/**
 * @author Rohit
 *
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

	// Derived Queries
	List<Menu> findByRestaurantRestaurantName(String city);

	// JPQL Queries
	@Query("FROM Menu m inner join m.restaurant r where r.restaurantName=?1")
	List<Menu> findMenuByRestaurantJPQL(String city);

	// Native SQL Query
	@Query(value = "select * from menu m inner join restaurant r on r.restaurant_id=m.restaurant_id where r.restaurant_name=?1", nativeQuery = true)
	List<Menu> findMenuByRestaurantSQL(String city);
}
