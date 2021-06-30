package com.bachkhoa.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bachkhoa"})
public class Springboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot01Application.class, args);
	}

}
