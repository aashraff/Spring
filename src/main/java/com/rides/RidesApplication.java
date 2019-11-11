package com.rides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RidesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RidesApplication.class, args);
	}

}
