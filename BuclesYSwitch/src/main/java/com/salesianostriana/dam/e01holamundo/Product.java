package com.salesianostriana.dam.e01holamundo;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
	
	private long id;
	private String name,descripcion;
	private double price;
	private boolean inStock = false;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime date;
}
