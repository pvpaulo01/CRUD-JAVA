package com.developer.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.banco.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}