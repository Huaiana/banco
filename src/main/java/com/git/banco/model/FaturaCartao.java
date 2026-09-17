package com.git.banco.model;

public class FaturaCartao {
    private Long id;
    private Double valor;
    private String dataFaturamento;
    private String dataVencimento;

    public FaturaCartao() {}

    public FaturaCartao(Long id, Double valor, String dataFaturamento, String dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFaturamento = dataFaturamento;
        this.dataVencimento = dataVencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataFaturamento() {
        return dataFaturamento;
    }

    public void setDataFaturamento(String dataFaturamento) {
        this.dataFaturamento = dataFaturamento;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
