/**
 * 
 */
package com.tajhotels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tajhotels.model.Menu;
import com.tajhotels.model.Restaurant;

/**
 * @author Rohit
 *
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
