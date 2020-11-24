package com.tajhotels.exceptionhandling;

public class RestaurantNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RestaurantNotFoundException() {
		super();
	}

	public RestaurantNotFoundException(String message) {
		super(message);
	}
}
