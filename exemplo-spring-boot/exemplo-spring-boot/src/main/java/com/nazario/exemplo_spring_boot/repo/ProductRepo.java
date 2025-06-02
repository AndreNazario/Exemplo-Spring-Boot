package com.nazario.exemplo_spring_boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazario.exemplo_spring_boot.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
