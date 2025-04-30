package com.tatiana.allery.backend.resto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatiana.allery.backend.resto.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
