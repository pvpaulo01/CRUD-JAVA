package com.developer.banco.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.banco.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoriaId(Long categoriaId);
}
