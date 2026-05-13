package com.sv.appTripsSv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/categorias")
public class CategoriaTripController {

	@GetMapping("/index")
	public String mostrarIndex() {
		
		
		return "CategoriaTrip/listCategoria";
	}
	
	@GetMapping("/create")
	public String crear() {

		return "categoriaTrip/formCategoria";
	}
	
	@PostMapping("/save")
	public String guadar(@RequestParam("nombre") String nombre,
			@RequestParam("descripcion") String descripcion) {
		
		System.out.println("Categoria: " + nombre);
		System.out.println("Descripcion: " + descripcion);
		
		return "categoriaTrip/listCategoria";
	}
	
	
	
}
