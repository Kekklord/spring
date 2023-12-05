package com.dem.kek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class KekApplication {
	public static void main(String[] args) {
		SpringApplication.run(KekApplication.class, args);
	}
}
