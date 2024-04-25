package com.tamcodes.springdatajpa;

import com.tamcodes.springdatajpa.models.Author;
import com.tamcodes.springdatajpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringDataJpaBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaBasicApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthorRepository repo
//	){
//		return args -> {
//			Author author = Author.builder()
//					.firstname("Tama")
//					.lastname("Cha")
//					.age(12)
//					.email("oiuyt@gmail.com")
//					.createdAt(LocalDateTime.now())
//					.build();
//
//			repo.save(author);
//		};
//	}

}
