package com.educandowe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowe.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
