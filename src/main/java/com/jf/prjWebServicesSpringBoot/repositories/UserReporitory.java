package com.jf.prjWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jf.prjWebServicesSpringBoot.entities.User;

public interface UserReporitory extends JpaRepository<User, Long> {
	
}
