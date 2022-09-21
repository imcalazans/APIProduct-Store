package com.educandowe.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandowe.course.entities.Product;
import com.educandowe.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository Repository;
	
	public List<Product> findAll(){
		return Repository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional<Product> obj = Repository.findById(Id);
		return obj.get();
	}

}
