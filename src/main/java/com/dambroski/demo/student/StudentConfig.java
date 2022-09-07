package com.dambroski.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student leticia = new Student("leticia","leticia@gmail.com",LocalDate.of(2002, 5, 23));
			Student thiago = new Student("thiago","dambroskic@hotmail.com",LocalDate.of(2002, 2, 16));
			repository.saveAll(List.of(leticia,thiago));
		};
		
	}

}
