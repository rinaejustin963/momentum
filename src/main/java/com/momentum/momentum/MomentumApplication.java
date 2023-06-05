package com.momentum.momentum;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "Investor-API", version = "1.0", description = "Springboot Rest API"))
public class MomentumApplication {

	public static void main(String[] args) {
		SpringApplication.run(MomentumApplication.class, args);
	}

}
