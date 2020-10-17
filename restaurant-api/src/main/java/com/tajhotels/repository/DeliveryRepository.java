/**
 * 
 */
package com.tajhotels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tajhotels.model.Delivery;
import com.tajhotels.model.Restaurant;

/**
 * @author Rohit
 *
 */
@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
	Delivery findByPartnerName(String partnerName);
}
