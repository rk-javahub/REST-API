package com.tajhotels.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Size(min = 3)
	private String restaurantName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "restaurant_id")
	@JsonIgnore
	private Set<Menu> menuList = new HashSet<Menu>();

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "restaurant_delivery", joinColumns = @JoinColumn(name = "restaurant_id"), inverseJoinColumns = @JoinColumn(name = "delivery_id"))
	@JsonIgnore
	private Set<Delivery> delivery = new HashSet<Delivery>();
}