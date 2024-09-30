package com.jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.model.User;
import com.jpa.repository.UserRepo;

@SpringBootApplication
public class ThreeJsApplication implements CommandLineRunner {

	@Autowired
	private UserRepo repo;
	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(ThreeJsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new User(12,"madhukatepalli464@gmail.com"));
		
	}

}
