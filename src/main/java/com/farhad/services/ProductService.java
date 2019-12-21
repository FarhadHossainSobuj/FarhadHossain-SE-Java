package com.farhad.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.farhad.model.Product;
import com.farhad.model.User;
import com.farhad.repository.ProductRepository;
import com.farhad.repository.UserRepository;

@Service
@Transactional
public class ProductService {
	
	public final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	public void saveMyProduct(Product product) {
		productRepository.save(product);
	}
	public List<Product> showAllProduct(){
		List<Product> products = new ArrayList<Product>();
		for(Product product : productRepository.findAll()) {
			products.add(product);
		}
		return products;
	}
	
	public void deleteMyProduct(int pid) {
		productRepository.deleteById(pid);
	}
	
	public Optional<Product> updateMyProduct(int pid) {
		return productRepository.findById(pid);
	}
	
}
