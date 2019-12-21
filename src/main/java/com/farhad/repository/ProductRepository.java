package com.farhad.repository;

import org.springframework.data.repository.CrudRepository;

import com.farhad.model.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{

}
