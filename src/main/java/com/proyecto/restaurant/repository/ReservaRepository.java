package com.proyecto.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.restaurant.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
