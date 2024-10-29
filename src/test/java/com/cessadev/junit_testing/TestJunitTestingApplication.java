package com.cessadev.junit_testing;

import org.springframework.boot.SpringApplication;

public class TestJunitTestingApplication {

	public static void main(String[] args) {
		SpringApplication.from(JunitTestingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
