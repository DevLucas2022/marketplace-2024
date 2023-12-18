package com.dev.backend.repository;

import com.dev.backend.entity.Categoria;
import com.dev.backend.entity.ProdutoImagens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens,Long> {
}
