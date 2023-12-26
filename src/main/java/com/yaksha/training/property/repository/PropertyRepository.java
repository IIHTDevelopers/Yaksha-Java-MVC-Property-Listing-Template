package com.yaksha.training.property.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yaksha.training.property.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

	// write your logic here
	
	// feel free to update this
	Object findByPropertyNameAndMaxPrice(String name, Double price, Pageable pageable);
}
