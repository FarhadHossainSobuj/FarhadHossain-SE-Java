package com.farhad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.farhad.model.Product;
import com.farhad.model.User;
import com.farhad.services.ProductService;
import com.farhad.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String hello() {
		return "This is Home Page";
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String password) {
		User user = new User(username, firstname, lastname, age, password);
		userService.saveMyUser(user);
		
		return "User Saved";
	}
	
	@GetMapping("/saveproduct")
	public String saveProduct(@RequestParam String name, @RequestParam int price, @RequestParam int profit_percentage, @RequestParam String product_type) {
		Product product = new Product(name, price, profit_percentage, product_type);
		productService.saveMyProduct(product);		
		return "Product Saved";
	}
	
}
