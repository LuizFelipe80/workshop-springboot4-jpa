package com.felipedev.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.aula.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
