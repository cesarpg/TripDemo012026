package com.sv.appTripsSv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomCategoria;
	private String nomDescripcion;
	private boolean activo;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomCategoria() {
		return nomCategoria;
	}
	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}
	public String getNomDescripcion() {
		return nomDescripcion;
	}
	public void setNomDescripcion(String nomDescripcion) {
		this.nomDescripcion = nomDescripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nomCategoria=" + nomCategoria + ", nomDescripcion=" + nomDescripcion
				+ ", activo=" + activo + "]";
	}

	
}
