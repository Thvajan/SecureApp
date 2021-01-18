package com.example.SecureApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SecureApp.bean.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
