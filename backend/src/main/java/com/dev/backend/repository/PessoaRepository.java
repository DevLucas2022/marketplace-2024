package com.dev.backend.repository;

import com.dev.backend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
