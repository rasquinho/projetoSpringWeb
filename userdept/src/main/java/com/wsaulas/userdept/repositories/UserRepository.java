package com.wsaulas.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsaulas.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
