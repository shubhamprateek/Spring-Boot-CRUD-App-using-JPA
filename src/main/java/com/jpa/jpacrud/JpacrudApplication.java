package com.jpa.jpacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
//@EnableJpaRepositories("com.jpa.jpacrud.Entity")
public class JpacrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpacrudApplication.class, args);
	}

}
