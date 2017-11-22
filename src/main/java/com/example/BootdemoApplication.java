package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BootdemoApplication.class, args);
		SpringApplication app = new SpringApplication(BootdemoApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
