package com.igorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
