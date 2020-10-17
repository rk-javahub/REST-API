/**
 * 
 */
package com.tajhotels.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tajhotels.model.Delivery;
import com.tajhotels.repository.DeliveryRepository;

/**
 * @author Rohit
 *
 */
@Service
public class DeliveryServiceImpl implements DeliveryService {
	@Autowired
	DeliveryRepository deliveryRepository;

	@Override
	public void addDelivery(Delivery delivery) {
		deliveryRepository.save(delivery);
	}

	@Override
	public void updateDelivery(Delivery delivery) {
		deliveryRepository.save(delivery);

	}

	@Override
	public Delivery getDeliveryById(Integer deliveryId) {
		return deliveryRepository.getOne(deliveryId);
	}

	@Override
	public Delivery getDeliverybyPartner(String partnerName) {
		return deliveryRepository.findByPartnerName(partnerName);
	}

}
