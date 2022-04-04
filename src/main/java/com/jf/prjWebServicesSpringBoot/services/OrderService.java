package com.jf.prjWebServicesSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jf.prjWebServicesSpringBoot.entities.Order;
import com.jf.prjWebServicesSpringBoot.repositories.OrderReporitory;

@Service
public class OrderService {
	
	@Autowired
	private OrderReporitory repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
