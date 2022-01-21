package com.raghav.mongodb.embeded.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghav.mongodb.embeded.model.User;
import com.raghav.mongodb.embeded.repository.FlipkartRepository;

@Service
public class OrderService {
	
	@Autowired
	FlipkartRepository repository;

	public String saveOrder(User user) {
		
		repository.save(user);
		
		return "Order"+user.getId()+"added successfully...";
	}

	public List<User> getUserByName(String name) {
		
		return repository.findByName(name);
	}

	public List<User> getUserByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}

	public List<User> getAllUser() {
		
		return repository.findAll();
	}

}
