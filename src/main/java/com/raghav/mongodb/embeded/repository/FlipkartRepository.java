package com.raghav.mongodb.embeded.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.raghav.mongodb.embeded.model.User;

public interface FlipkartRepository extends MongoRepository<User, Integer> {

	///@Query("{'User.name':?0}")
	List<User> findByName(String name);

	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);
	
	

}
