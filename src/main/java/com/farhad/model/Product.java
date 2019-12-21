package com.farhad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private int pid;
	private String name;
	private int price;
	private int profit_percentage;
	private String product_type;
	public Product(String name, int price, int profit_percentage, String product_type) {
		super();
		this.name = name;
		this.price = price;
		this.profit_percentage = profit_percentage;
		this.product_type = product_type;
	}
	
	public Product() {
		super();
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int id) {
		this.pid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProfit_percentage() {
		return profit_percentage;
	}
	public void setProfit_percentage(int profit_percentage) {
		this.profit_percentage = profit_percentage;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	
}
