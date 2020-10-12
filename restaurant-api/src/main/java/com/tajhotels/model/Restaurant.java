package com.tajhotels.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
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
public class Restaurant {
	@Id
	@GeneratedValue(generator = "restaurant_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "reataurant_id", sequenceName = "restaurnat_id")
	private Integer restaurantId;
	private String restaurantName;
	@OneToOne
	private Address address;
	@OneToMany
	private Set<Menu> menuList;
	@ManyToMany
	private Set<Delivery> delivery;

}
