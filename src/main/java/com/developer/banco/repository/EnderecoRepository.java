package com.developer.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.banco.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
