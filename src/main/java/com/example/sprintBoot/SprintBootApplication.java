package com.example.sprintBoot;


import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.sprintBoot.modelo.Blog;
import com.example.sprintBoot.repository.BlogRepository;


@EnableJpaRepositories(basePackages = "com.example.sprintBoot.repository")
@SpringBootApplication
public class SprintBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootApplication.class, args);
	}
	
	
	//Este metodo hace que cuando inicie la aplicación arranque la BD NECESITA LA ANOTACION Bean
	
	@Bean
	public CommandLineRunner setup(BlogRepository blogRepository) {
		return (args) -> {
			blogRepository.save(new Blog("Titulo 1 Java", "Contenido java"));
			blogRepository.save(new Blog("Titulo 2 Spring", "Contenido Spring"));
			blogRepository.save(new Blog("Titulo 3 Spring Boot", "Contenido Spring Boot"));
			blogRepository.save(new Blog("Titulo 4 Eclipse", "Contenido Eclipse"));
		};
	}
}

