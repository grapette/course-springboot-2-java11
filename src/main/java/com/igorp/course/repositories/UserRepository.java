package com.igorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
