package com.sv.appTripsSv.services;

import java.util.List;

import com.sv.appTripsSv.models.Categoria;


public interface ICategoriaService {

	public List<Categoria> buscarTodos();
	public Categoria bucarPorId(int id);
	public void guardar(Categoria categoria);
	public void eliminar(Integer id);
	
}
