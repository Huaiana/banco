package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

    // Método para buscar um cartão pelo número
    Cartao findByNumero(String numero);

    // Método para verificar se um cartão existe pelo CPF do cliente
    boolean existsByCliente(Long CPFString);

    // Método para buscar um cartão pelo CPF do cliente
    Cartao findByCliente(Long CPFString);

    // Método para cancelar um cartão pelo CPF do cliente
    void deleteByCliente(Long CPFString);
}
