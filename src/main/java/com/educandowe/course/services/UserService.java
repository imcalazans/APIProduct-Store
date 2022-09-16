package com.educandowe.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandowe.course.entities.User;
import com.educandowe.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository Repository;
	
	public List<User> findAll(){
		return Repository.findAll();
	}
	
	public User findById(Long Id) {
		Optional<User> obj = Repository.findById(Id);
		return obj.get();
	}

}
