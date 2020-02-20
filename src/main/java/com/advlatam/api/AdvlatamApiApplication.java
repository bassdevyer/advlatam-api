package com.advlatam.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.advlatam"})
@EntityScan(basePackages = {"com.advlatam.model"})
@EnableJpaRepositories("com.advlatam.repositories")
public class AdvlatamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvlatamApiApplication.class, args);
	}

}
