package com.jf.prjWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jf.prjWebServicesSpringBoot.entities.Order;

public interface OrderReporitory extends JpaRepository<Order, Long> {
	
}
