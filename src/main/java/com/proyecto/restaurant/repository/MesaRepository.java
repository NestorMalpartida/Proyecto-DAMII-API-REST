package com.proyecto.restaurant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.restaurant.entity.Mesa;

public interface MesaRepository extends JpaRepository<Mesa, Integer> {

	@Query("Select m form Mesa m inner join Sede s on s.codigo = m.sede.codigo where s.codigo = ?1")
	public List<Mesa> findMesaBySede(Integer codigo);
}
