package com.educandowe.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandowe.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public  ResponseEntity<User> findAll(){
		User u = new User(1L, "Mariana", "mariana@gmail.com", "(71)955634256", "123456");
		return ResponseEntity.ok().body(u);
	}
	

}
