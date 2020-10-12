package com.tajhotels.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Rohit
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {
	private Integer deliveryId;
	private String partnerName;
	private Double charges;
	@ManyToMany(mappedBy = "delivery")
	Set<Restaurant> restaurantList = new HashSet<Restaurant>();

}
