package com.igorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
