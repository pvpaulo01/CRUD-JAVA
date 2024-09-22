package com.developer.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.banco.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}