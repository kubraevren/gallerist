package com.kubraevren.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = {"com.kubraevren"})
@EntityScan(basePackages = {"com.kubraevren"})
@EnableJpaRepositories(basePackages = {"com.kubraevren"})
@SpringBootApplication
public class GaleriApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(GaleriApplicationStarter.class, args);
	}

}
