package com.nazario.exemplo_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nazario.exemplo_spring_boot.model.Product;
import com.nazario.exemplo_spring_boot.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService service;
	
	
	
	
	// Create
	@PostMapping("/Product")
	public void insertProduct(@RequestBody Product p) {
		service.insertProduct(p);
		
	}
	
	
	
	// Read
	@GetMapping("/Product")
	public List<Product> ListProduct(){
		return service.ListProduct();
	}
	
	// Update 
	@PutMapping("/Product")
	public void updateProduct(@RequestBody Product p) {
		service.updateProduct(p);
	}
	
	// Delete
	@DeleteMapping("/Product/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
	}
	
}
