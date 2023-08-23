package com.moviesproject.moviesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Configuration
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = MovieRepository.class)

public class MoviesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesapiApplication.class, args);
	}
}
