package com.proyecto.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.restaurant.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
