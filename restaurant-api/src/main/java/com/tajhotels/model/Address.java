package com.tajhotels.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Address {
	@Id
	@GeneratedValue(generator = "address_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "address_id", sequenceName = "address_id")
	private Integer addressId;
	private String streetName;
	private String city;
	private long zipcode;
	private String state;
}
