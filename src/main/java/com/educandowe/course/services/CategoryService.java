package com.educandowe.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandowe.course.entities.Category;
import com.educandowe.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository Repository;
	
	public List<Category> findAll(){
		return Repository.findAll();
	}
	
	public Category findById(Long Id) {
		Optional<Category> obj = Repository.findById(Id);
		return obj.get();
	}

}
