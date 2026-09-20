package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Configuracao;

public interface ConfiguracaoRepository extends JpaRepository<Configuracao, Long> {

    boolean existsById(Long id);

    
}
