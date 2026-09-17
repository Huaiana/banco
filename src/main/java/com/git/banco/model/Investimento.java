package com.git.banco.model;

public class Investimento {
    private Long id;
    private Double valor;
    private String tipoInvestimento;
    private String dataInvestimento;
    private String dataResgate;
    private String valorResgate;

    public Investimento() {}

    public Investimento(Long id, Double valor, String tipoInvestimento, String dataInvestimento, String dataResgate, String valorResgate) {
        this.id = id;
        this.valor = valor;
        this.tipoInvestimento = tipoInvestimento;
        this.dataInvestimento = dataInvestimento;
        this.dataResgate = dataResgate;
        this.valorResgate = valorResgate;
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

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(String dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    public String getDataResgate() {
        return dataResgate;
    }

    public void setDataResgate(String dataResgate) {
        this.dataResgate = dataResgate;
    }

    public String getValorResgate() {
        return valorResgate;
    }

    public void setValorResgate(String valorResgate) {
        this.valorResgate = valorResgate;
    }
}
