package com.felipedev.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
