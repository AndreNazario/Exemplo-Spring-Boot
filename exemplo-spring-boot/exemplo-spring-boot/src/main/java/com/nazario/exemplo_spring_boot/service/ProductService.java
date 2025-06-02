package com.nazario.exemplo_spring_boot.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nazario.exemplo_spring_boot.model.Product;
import com.nazario.exemplo_spring_boot.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	
	
	
	//Create 
	public void insertProduct(Product p) {
		repo.save(p);
	}
	
	//Read
	
	public List<Product> ListProduct(){
		return repo.findAll();
	}
	
	// Update
	public void updateProduct(Product p) {
		repo.save(p);
	}
	
	// Delete
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}
	
	
}
