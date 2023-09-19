package com.felipedev.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
