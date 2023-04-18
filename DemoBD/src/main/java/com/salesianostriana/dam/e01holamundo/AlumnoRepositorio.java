package com.salesianostriana.dam.e01holamundo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>{

}
