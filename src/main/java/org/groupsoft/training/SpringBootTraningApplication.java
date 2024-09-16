package org.groupsoft.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.groupsoft.training")
public class SpringBootTraningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTraningApplication.class, args);
	}
}
