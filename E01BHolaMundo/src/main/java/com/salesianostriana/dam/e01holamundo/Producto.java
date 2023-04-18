package com.salesianostriana.dam.e01holamundo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

public class Producto{

	private String nombre, descripcion;
	private float precio;
	private int numeroVotos;
	private float porcentajeSatisfaccion;
	
	public Producto(String nombre, String descripcion, float precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
}