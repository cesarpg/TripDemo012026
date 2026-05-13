package com.sv.appTripsSv.services;

import java.util.List;

import com.sv.appTripsSv.models.Trip;

public interface ITripsService {
	
	List<Trip> buscarTodos();
	
	Trip buscarPorId(int idTrp);
}
