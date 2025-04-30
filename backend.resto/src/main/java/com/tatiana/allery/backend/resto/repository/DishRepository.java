package com.tatiana.allery.backend.resto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatiana.allery.backend.resto.entity.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

}
