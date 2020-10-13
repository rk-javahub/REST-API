package com.tajhotels.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Rohit
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Restaurant {
	@Id
	@GeneratedValue(generator = "restaurant_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "restaurant_id", sequenceName = "restaurant_id")
	private Integer restaurantId;
	private String restaurantName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	@OneToMany(cascade = CascadeType.PERSIST)
	//@JoinColumn(name = "restaurant_id")
	private Set<Menu> menuList;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(joinColumns = @JoinColumn(name = "restaurant_id"), inverseJoinColumns = @JoinColumn(name = "delivery_id"))
	private Set<Delivery> delivery;
}