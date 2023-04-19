package com.salesianostriana.dam.manytoone.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Curso {

	@Id @GeneratedValue
	private long id;
	
	private String nombre,tutor;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@Builder.Default 
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
	private List<Alumno> alumnos = new ArrayList<>();
}
