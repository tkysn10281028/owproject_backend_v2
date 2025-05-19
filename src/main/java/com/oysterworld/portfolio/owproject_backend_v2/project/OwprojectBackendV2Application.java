package com.oysterworld.portfolio.owproject_backend_v2.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.oysterworld.portfolio.owproject_backend_v2")
public class OwprojectBackendV2Application {

	public static void main(String[] args) {
		SpringApplication.run(OwprojectBackendV2Application.class, args);
	}

}
