package com.sv.appTripsSv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sv.appTripsSv.models.Trip;

public interface ITripRepository extends JpaRepository<Trip, Integer> {

}
