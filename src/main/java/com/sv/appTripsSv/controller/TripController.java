package com.sv.appTripsSv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sv.appTripsSv.models.Trip;
import com.sv.appTripsSv.services.ITripsService;

@Controller
@RequestMapping("/trips")
public class TripController {

	@Autowired
	private ITripsService tripService;
	
	@GetMapping("/create")
	public String crear() {
		
		return "Trips/formTrip";
	}
	
	@PostMapping("/save")
	public String guardar(
			@RequestParam("nombre") String nombre
			,@RequestParam("descripcion") String descripcion
			,@RequestParam("status") String status
			,@RequestParam("fecha") String fecha
			,@RequestParam("destacado") int destacado
			,@RequestParam("costo") double costo
			,@RequestParam("detalles") String detalles) {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("descripcion: " + descripcion);
		System.out.println("status: " + status);
		System.out.println("fecha: " + fecha);
		System.out.println("destacado: " + destacado);
		System.out.println("costo: " + costo);
		System.out.println("detalles: " + detalles);
		
		return "Trips/listTrip";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idTrip, Model model) {
		
		Trip trip = tripService.buscarPorId(idTrip);
		System.out.println("IdTrip: " + trip.getId() );
		model.addAttribute("trip", trip);
		
		return "Trips/detalle";
	}

	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idTrip, Model model) {
		
		System.out.println("IdTrip: " + idTrip );
		model.addAttribute("id", idTrip);
		
		return "Trips/mensaje";
	}
}
