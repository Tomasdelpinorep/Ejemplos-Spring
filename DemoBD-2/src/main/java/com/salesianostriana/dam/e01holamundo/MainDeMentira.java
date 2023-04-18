package com.salesianostriana.dam.e01holamundo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {

	@Autowired
	private Repositorio repo;
	
	@PostConstruct
	public void ejecutar() {
		Task t1 = Task.builder()
				.title("Task 1")
				.done(false)
				.limitDate(LocalDateTime.of(LocalDate.of(2023, 10, 10), LocalTime.of(23, 59)))
				.build();
		
		Task t2= Task.builder()
				.title("Task 2")
				.done(false)
				.limitDate(LocalDateTime.of(LocalDate.of(2023, 12, 05), LocalTime.of(23, 59)))
				.build();
		
		repo.save(t1);
		repo.save(t2);
		
		List<Task> result = repo.findAll();
		result.forEach(System.out::println);
	}
}
