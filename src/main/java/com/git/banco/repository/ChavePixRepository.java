package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.ChavePix;

public interface ChavePixRepository extends JpaRepository<ChavePix, Long> { 


    //Método para buscar uma chave pix pelo CPF do cliente
    ChavePix findByCliente(Long CPFString); 

    //Método para confirmar se uma chave pix existe pelo CPF, email, telefone ou aleatória
    boolean existsByCliente(Long CPFString);    

    //método para encontar uma chave pix de acordo com a chave CPF, email, telefone ou aleatória
    ChavePix findByChave(String chave);

    //método para verificar se uma chave pix existe de acordo com a chave CPF, email, telefone ou aleatória
    boolean existsByChave(String chave);


    //método para deletar uma chave pix do cadastro de acordo com a chave CPF, email, telefone ou aleatória
    void deleteByChave(String chave);

    
}


