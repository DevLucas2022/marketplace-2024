package com.dev.backend.repository;

import com.dev.backend.entity.Pessoa;
import com.dev.backend.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
