package com.zupfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ProdutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutorApplication.class, args);
	}

}
