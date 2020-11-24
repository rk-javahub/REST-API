package com.tajhotels.exceptionhandling;

public class RestaurantIdNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RestaurantIdNotFoundException() {
		super();
	}

	public RestaurantIdNotFoundException(String message) {
		super(message);
	}
}
