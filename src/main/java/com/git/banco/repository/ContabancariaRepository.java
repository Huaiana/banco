   package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.ContaBancaria;

public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Long> {
    

   
}
