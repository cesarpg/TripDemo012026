package com.sv.appTripsSv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sv.appTripsSv.models.Categoria;


public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {

}
