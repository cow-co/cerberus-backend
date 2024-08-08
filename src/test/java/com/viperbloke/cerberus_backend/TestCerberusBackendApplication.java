package com.viperbloke.cerberus_backend;

import org.springframework.boot.SpringApplication;

public class TestCerberusBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(CerberusBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
