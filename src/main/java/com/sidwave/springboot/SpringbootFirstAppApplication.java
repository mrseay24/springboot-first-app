package com.sidwave.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstAppApplication {

	//after running the program type 'localhost:8080/boopBeep' in your web browser
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
