package com.sim_coding.finder_pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FinderPetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinderPetsApplication.class, args);
	}

}
