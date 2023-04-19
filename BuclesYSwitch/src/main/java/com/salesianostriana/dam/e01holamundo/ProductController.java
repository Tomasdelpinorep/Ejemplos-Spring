package com.salesianostriana.dam.e01holamundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/productos")
	public String controladorCondicionales(Model model) {
		model.addAttribute("productList",service.getLista());
		return "PlantillaBucleYFormateo";
	}
}
