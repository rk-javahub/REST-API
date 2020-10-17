package com.tajhotels.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Menu {
	@Id
	@GeneratedValue(generator = "menu_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "menu_id", sequenceName = "menu_id")
	private Integer menuId;
	private String menuName;
	private Double price;
	@ManyToOne()
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
}