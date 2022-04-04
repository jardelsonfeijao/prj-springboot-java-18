package com.jf.prjWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jf.prjWebServicesSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
