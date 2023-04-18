package com.salesianostriana.dam.e01holamundo;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class MainDeMentira {

	@Autowired
	private AlumnoRepositorio alumnoRepositorio;
	
	@PostConstruct
	public void ejecutar() {
		Alumno a1 = Alumno.builder()
				.id(1L)
				.nombre("Tomas")
				.apellidos("Del Pino Coffey")
				.email("tomasdelpino@gmail.com")
				.fechaNacimiento(LocalDate.of(2003, 10, 02))
				.build();
		alumnoRepositorio.save(a1);
		
		List<Alumno> result = alumnoRepositorio.findAll();
		result.forEach(System.out::println);
	}
}
