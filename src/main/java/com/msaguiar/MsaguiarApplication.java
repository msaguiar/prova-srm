package com.msaguiar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MsaguiarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaguiarApplication.class, args);
	}
}
