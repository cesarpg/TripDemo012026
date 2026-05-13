package com.sv.appTripsSv.services.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sv.appTripsSv.models.Categoria;
import com.sv.appTripsSv.repository.ICategoriaRepository;
import com.sv.appTripsSv.services.ICategoriaService;

@Primary
@Service
public class CategoriaServiceJPA implements ICategoriaService {


	
	@Override
	public List<Categoria> buscarTodos() {

		return null;
	}

	@Override
	public Categoria bucarPorId(int id) {
		return null;
		
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
