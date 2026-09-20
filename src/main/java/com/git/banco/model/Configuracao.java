package com.git.banco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "configuracao")
public class Configuracao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ---Configuração do cartão---
    private Boolean debitoAutomaticoFatura = false;
    private Boolean avisoViagem = false;// ativar modo internacional
    private Boolean compartilharLocalizacao = false;// compartilar para qual contato da sua agenda telefone, email, etc
    private Boolean creditoAutomaticoFatura = false;


    // ---Configuração da Conta---
    private Boolean layoutConta = false; // cor, fonte, tamanho da fonte
    private Boolean notificacoes = false;
    private Boolean deixarocultoosaldo = false;
    private Boolean adcionarcontaadicional = false;

}

