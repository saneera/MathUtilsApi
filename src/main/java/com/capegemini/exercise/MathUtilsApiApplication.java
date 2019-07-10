package com.capegemini.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.capegemini.exercise")
@EnableSwagger2
public class MathUtilsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathUtilsApiApplication.class, args);
	}

}
