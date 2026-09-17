package com.projeto.banco.model;

public class Emprestimo {
    private Long id;
    private Double valor;
    private Integer prazo;
    private Double taxaJuros;
    private String tipoEmprestimo;

    public Emprestimo() {}

    public Emprestimo(Long id, Double valor, Integer prazo, Double taxaJuros, String tipoEmprestimo) {
        this.id = id;
        this.valor = valor;
        this.prazo = prazo;
        this.taxaJuros = taxaJuros;
        this.tipoEmprestimo = tipoEmprestimo;
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

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }
}
