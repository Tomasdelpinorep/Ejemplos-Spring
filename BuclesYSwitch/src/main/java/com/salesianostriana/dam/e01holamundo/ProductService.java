package com.salesianostriana.dam.e01holamundo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Product> getLista(){
		return Arrays.asList(
				new Product(1,"Tortitas","tortitas americanas ya hechas",4.99,true,LocalDateTime.now()),
				new Product(2,"Aceite","1L aceite de oliva virgen",3.5,true,LocalDateTime.now())
				);
	}
}
