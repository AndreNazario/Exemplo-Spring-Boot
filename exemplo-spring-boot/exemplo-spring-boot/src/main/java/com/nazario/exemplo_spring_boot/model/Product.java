package com.nazario.exemplo_spring_boot.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name_Product")
	private String nameProduct;
	@Column(name = "price")
	private double Price;
	
	
	public Product() {
		
	}
	
	
	public Product(int id, String nameProduct, double price) {
		super();
		this.id = id;
		this.nameProduct = nameProduct;
		Price = price;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	
	
	
}
