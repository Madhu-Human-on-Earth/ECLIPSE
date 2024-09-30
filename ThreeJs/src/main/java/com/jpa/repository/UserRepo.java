package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
