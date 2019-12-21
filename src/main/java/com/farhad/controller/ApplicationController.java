package com.farhad.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.farhad.model.Product;
import com.farhad.model.User;
import com.farhad.services.ProductService;
import com.farhad.services.UserService;

@Controller
public class ApplicationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest req) {
		req.setAttribute("mode", "MODE_HOME");
		return "login";
		
	}
	
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
		
	}
	
	@RequestMapping("/save-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		userService.saveMyUser(user);
		return "login";
		
	}
	@RequestMapping("/save-product")
	public String saveProduct(@ModelAttribute Product product, BindingResult bindingResult, HttpServletRequest request) {
		productService.saveMyProduct(product);
		return "welcome";
		
	}
	@RequestMapping("/add-product")
	public String addProduct() {
		return "addProduct";
		
	}
	@RequestMapping("/products")
	public String saveProduct(HttpServletRequest req) {
		req.setAttribute("products", productService.showAllProduct());
		return "products";		
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";		
	}
	
	@RequestMapping("/delete-product")
	public String deleteProduct(@RequestParam int pid, HttpServletRequest req) {
		productService.deleteMyProduct(pid);
		return "product";
	}
	@RequestMapping("/updateproduct")
	public String update(@RequestParam int pid, HttpServletRequest req) {
		req.setAttribute("products", productService.updateMyProduct(pid));
		return "editProduct";
	}
	@RequestMapping("/edit-product")
	public String updateProduct(@RequestParam int pid, HttpServletRequest req) {
		
		productService.updateMyProduct(pid);
		return "product";
	}
	
	
}
