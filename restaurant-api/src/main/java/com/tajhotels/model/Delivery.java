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
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

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
public class Delivery {
	@Id
	@GeneratedValue(generator = "delivery_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "delivery_id", sequenceName = "delivery_id")
	private Integer deliveryId;
	private String partnerName;
	private Double charges;
	@ManyToMany(mappedBy = "delivery",fetch = FetchType.EAGER)
	@JsonIgnore
	Set<Restaurant> restaurantList = new HashSet<Restaurant>();

}
