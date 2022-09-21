package com.educandowe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowe.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
