package com.courseweb.springlearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.springlearning.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
