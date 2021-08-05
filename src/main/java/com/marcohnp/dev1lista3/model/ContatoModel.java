package com.marcohnp.dev1lista3.model;

import java.util.Objects;

public class ContatoModel {

    private Integer id;
    private String nomeCompleto;
    private String telefone;

    public ContatoModel() {
    }

    public ContatoModel(Integer id, String nomeCompleto, String telefone) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContatoModel)) return false;
        ContatoModel that = (ContatoModel) o;
        return Objects.equals(id, that.id) && Objects.equals(nomeCompleto, that.nomeCompleto) &&
                Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCompleto, telefone);
    }
}
