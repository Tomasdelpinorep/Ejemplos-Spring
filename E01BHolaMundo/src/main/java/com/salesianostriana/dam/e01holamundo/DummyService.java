package com.salesianostriana.dam.e01holamundo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //Un service trae cosas de una base de datos
public class DummyService {

	public Producto getProducto() {
		return new Producto("Camiseta","Wena",15.0f,87,91.1f);
	}
	
	public Producto getProductoSinAlgunosValores() {
		return new Producto("Otro producto",null,1.0f);
	}
	
	public List<Producto> getLista(){
		return Arrays.asList(
				new Producto("Producto 1","Desc 1",1.0f));
	}
}
