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
public class ContaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String banco;

    @Column(nullable = false)
    private String agencia;

    @Column(nullable = false, unique = true)
    private String numeroConta;

    @Column(nullable = false)
    private String tipoConta;

    @Column(nullable = false)
    private String saldo;
}
