package com.jpa.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jpa.test.user.User;
import com.jpa.test.user.UserService;

@SpringBootApplication
public class VideoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoApiApplication.class, args);

	
		
		
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
			) {
		return args->{
			service.register(User.builder().username("Madhu")
			.email("madhukate@789")
			.password("aaa")
			.build());
			
			service.register(User.builder().username("John")
					.email("john@1234")
					.password("bbb")
					.build());
			
			service.register(User.builder().username("Rawn")
					.email("rawn@789")
					.password("ccc")
					.build());
		};
	}
	

}
