package com.proyecto.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.restaurant.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
