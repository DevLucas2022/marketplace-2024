package com.dev.backend.repository;

import com.dev.backend.entity.Marca;
import com.dev.backend.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<Permissao,Long> {

}
