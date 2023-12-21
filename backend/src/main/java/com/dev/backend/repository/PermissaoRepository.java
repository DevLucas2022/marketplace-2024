package com.dev.backend.repository;

import com.dev.backend.entity.Marca;
import com.dev.backend.entity.Permissao;
import com.dev.backend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao,Long> {

    List<Permissao> findByNome(String nome);
}
