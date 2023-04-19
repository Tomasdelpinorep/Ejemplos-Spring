package com.salesianostriana.dam.manytoone.model;

import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {
	
	private final AlumnoRepositorio alumnoRepositorio;
	private final CursoRepositorio cursoRepositorio;
	
	@PostConstruct
	public void ejecutar() {
		
		//Creamos los alumnos
		Alumno a1 = new Alumno();
		a1.setNombre("Tomás");
		a1.setApellidos("Del Pino");
		a1.setEmail("tomasdelpino28@gmail.com");
		
		Alumno a2 = new Alumno();
		a2.setNombre("Juan");
		a2.setApellidos("Bosco");
		a2.setEmail("donjuanbosco@gmail.com");
		//creamos el curso
		Curso c = new Curso();
		c.setNombre("1º DAM");
		c.setTutor("Miguel");
		
		//guardamos el curso 
		cursoRepositorio.save(c);
		
		/* así no porque la clase Curso se queda sin saber qué alumnos están en cada curso
		a1.setCurso(c);
		a2.setCurso(c);
		*/
		
		/*
		 * Se hace así porque este método (en la clase alumno) no sólo setea el curso para el alumno sino que también
		 * añade al alumno a la lista "alumnos" de un curso
		 */
		a1.addToCurso(c);
		a2.addToCurso(c);
		
		alumnoRepositorio.save(a1);
		alumnoRepositorio.save(a2);
		
		List<Curso> cursos = cursoRepositorio.findAll();
		
		for(Curso curso : cursos) {
			System.out.println(curso);
			for(Alumno a : curso.getAlumnos()) {
				System.out.println(a);
			}
		}
	}
}
