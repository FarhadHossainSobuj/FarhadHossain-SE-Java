package com.farhad.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.farhad.model.Product;
import com.farhad.model.User;
import com.farhad.repository.ProductRepository;
import com.farhad.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	public final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveMyUser(User user) {
		userRepository.save(user);
	}
	
}
