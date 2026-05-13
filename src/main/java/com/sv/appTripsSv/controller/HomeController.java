package com.sv.appTripsSv.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sv.appTripsSv.models.Trip;
import com.sv.appTripsSv.services.ITripsService;

@Controller
public class HomeController {
	
	@Autowired
	private ITripsService tripServices;
	

	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		
		Trip trip = new Trip();
		trip.setNombre("Rapel en Volcatenango");
		trip.setDescripcion("Emocionante circuito de rapel con vistas impresionantes....");
		trip.setFecha(new Date());
		trip.setCosto(10.0);
		
		model.addAttribute("trip", trip);
		
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		
		List<String> lista = new LinkedList<>();
		lista.add("En la montaña");
		lista.add("En la Ciudad");
		lista.add("En los pueblos");
		lista.add("En las playas");
		
		model.addAttribute("listadoTrips", lista);
		
		return "listado";
	}

	@GetMapping("/")
	public String mostrarHome(Model model) {
		List<Trip> lista = tripServices.buscarTodos();
		model.addAttribute("trips", lista);
		return "home";
	}
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		
		
		List<Trip> trips = tripServices.buscarTodos();
		
		 model.addAttribute("trips", trips);
		return "tabla";
	}
	
}
