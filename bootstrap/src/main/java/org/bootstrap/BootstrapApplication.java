package org.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.bootstrap", "org.controller"})
public class BootstrapApplication{

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApplication.class, args);
	}
	
}
