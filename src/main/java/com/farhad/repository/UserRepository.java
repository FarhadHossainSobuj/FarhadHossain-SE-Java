package com.farhad.repository;

import org.springframework.data.repository.CrudRepository;

import com.farhad.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
