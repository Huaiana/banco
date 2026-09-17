package com.git.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String cvv;

    @Column(nullable = false)
    private String dataValidade;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false, unique = true)
    private String numeroConta;

    @Column(nullable = false)
    private String tipoConta;

    @Column(nullable = false)
    private String saldo;
}

