package com.educandowe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowe.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
