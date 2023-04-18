package com.salesianostriana.dam.e01holamundo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity

public class Alumno {

	@Id
	private long id;
	
	@Column(name = "nombre_alumno")
	private String nombre;
	
	private String apellidos,email;
	private LocalDate fechaNacimiento;
}
