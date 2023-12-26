package com.yaksha.training.property.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.property.entity.Property;

@Service
public class PropertyService {

	public Property saveProperty(Property theProperty) {
		// write your logic here
		return null;
	}

	public Property getProperty(Long propertyId) {
		// write your logic here
		return null;
	}

	public boolean deleteProperty(Property property) {
		// write your logic here
		return false;
	}

	public Page<Property> searchProperties(String name, Double maxPrice, Pageable pageable) {
		// write your logic here
		return null;
	}
}
