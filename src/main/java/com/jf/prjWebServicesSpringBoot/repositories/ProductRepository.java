package com.jf.prjWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jf.prjWebServicesSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
