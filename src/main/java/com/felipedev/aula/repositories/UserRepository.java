package com.felipedev.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
