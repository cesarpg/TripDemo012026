package com.sv.appTripsSv.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sv.appTripsSv.models.Trip;

@Service
public class TripServiceImp implements ITripsService {
	
	List<Trip> lista = null;
	
	public TripServiceImp() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		lista = new LinkedList<>();

		try {
			Trip trip1 = new Trip();
			trip1.setId(1);
			trip1.setNombre("Rapel en Volcatenango");
			trip1.setDescripcion("Emocionante circuito de rapel con vistas impresionantes....");
			trip1.setFecha(sdf.parse("10-05-2024"));
			trip1.setCosto(10.0);
			trip1.setDestacado(1);
			trip1.setImagen("trip1.png");
			
			Trip trip2 = new Trip();
			trip2.setId(2);
			trip2.setNombre("Deslizadero en el picnic");
			trip2.setDescripcion("Deslizate en un divertido tovogan....");
			trip2.setFecha(sdf.parse("11-08-2024"));
			trip2.setFecha(new Date());
			trip2.setCosto(10.0);
			trip2.setDestacado(0);
			trip2.setImagen("trip2.png");
			
			Trip trip3 = new Trip();
			trip3.setId(3);
			trip3.setNombre("Comida y flores");
			trip3.setDescripcion("Disfruta de flores y rica comida....");
			trip3.setFecha(sdf.parse("15-12-2023"));
			trip3.setFecha(new Date());
			trip3.setCosto(10.0);
			trip3.setDestacado(1);
			trip3.setImagen("trip3.png");
			
			Trip trip4 = new Trip();
			trip4.setId(4);
			trip4.setNombre("Caminatas");
			trip4.setDescripcion("Retate con camatas por las montañas de Chalatenango....");
			trip4.setFecha(sdf.parse("22-07-2024"));
			trip4.setFecha(new Date());
			trip4.setCosto(10.0);
			trip4.setDestacado(0);
			trip4.setImagen("no-image.png");
			
			lista.add(trip1);
			lista.add(trip2);
			lista.add(trip3);
			lista.add(trip4);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public List<Trip> buscarTodos() {
		return lista;
	}

	@Override
	public Trip buscarPorId(int idTrip) {
		for (Trip trip : lista)
			if (trip.getId()==idTrip)
				return trip;
		return null;
	}

}
