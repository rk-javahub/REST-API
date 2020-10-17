package com.tajhotels.service;

import com.tajhotels.model.Delivery;


public interface DeliveryService {
	void addDelivery(Delivery delivery);

	void updateDelivery(Delivery delivery);

	Delivery getDeliveryById(Integer deliveryId);

	Delivery getDeliverybyPartner(String partnerName);

}
