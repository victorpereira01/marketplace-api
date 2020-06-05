package com.meusprojetos.springbootjpasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusprojetos.springbootjpasystem.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
