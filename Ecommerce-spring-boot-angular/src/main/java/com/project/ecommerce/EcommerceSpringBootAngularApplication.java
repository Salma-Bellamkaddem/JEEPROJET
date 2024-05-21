package com.project.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringBootAngularApplication  implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("test");
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommerceSpringBootAngularApplication.class, args);
	}

}
