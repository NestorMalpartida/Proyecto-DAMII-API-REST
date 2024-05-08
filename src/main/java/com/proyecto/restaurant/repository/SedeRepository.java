package com.proyecto.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.restaurant.entity.Sede;

public interface SedeRepository extends JpaRepository<Sede, Integer> {

	@Query("Select s from Sede s where s.usuario.codigo = ?1")
	public Sede findSedeByUsuario(Integer codigo);
}
