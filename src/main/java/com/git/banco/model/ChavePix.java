package com.git.banco.model;

public class ChavePix {
    private Long id;
    private String tipoChave;
    private String valorChave;

    public ChavePix() {}

    public ChavePix(Long id, String tipoChave, String valorChave) {
        this.id = id;
        this.tipoChave = tipoChave; // ( email, telefone, cpf, cnpj, aleatoria)
        this.valorChave = valorChave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoChave() {
        return tipoChave;
    }

    public void setTipoChave(String tipoChave) {
        this.tipoChave = tipoChave;
    }

    public String getValorChave() {
        return valorChave;
    }

    public void setValorChave(String valorChave) {
        this.valorChave = valorChave;
    }
}
