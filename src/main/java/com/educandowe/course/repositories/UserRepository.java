package com.educandowe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowe.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
