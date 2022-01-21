package com.raghav.mongodb.embeded.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghav.mongodb.embeded.model.User;
import com.raghav.mongodb.embeded.service.OrderService;


@RestController
@RequestMapping("/order-service")
public class OrderController {

	@Autowired
	OrderService service;
	
	@PostMapping("/placeOrderNow")
	public String placeOrder(@RequestBody User user ) {
		return service.saveOrder(user);
	}
	
	@GetMapping("getAllUser")
	public List<User> getAllUsers(){
		
		return service.getAllUser();
		
	}
	
	@GetMapping("getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name){
		return service.getUserByName(name);
	}
	
	@GetMapping("getUserByCity/{city}")
	public List<User> getUserByCity(@PathVariable String city){
		return service.getUserByCity(city);
	}
	
	
}
