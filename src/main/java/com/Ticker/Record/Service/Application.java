package com.Ticker.Record.Service;

import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration()
@EntityScan({"com.Ticker.Record.Service.entities"})
@EnableJpaRepositories("com.Ticker.Record.Service.repositories")
public class Application {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		SpringApplication app = new SpringApplication(Application.class);
		
		app.run(args);
	}
}
