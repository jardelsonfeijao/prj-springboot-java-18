package com.jf.prjWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jf.prjWebServicesSpringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
