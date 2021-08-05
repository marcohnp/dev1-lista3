package com.marcohnp.dev1lista3.model.request;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class ContatoRequest {

    private Integer id;
    @NotEmpty(message = "Nome não pode ser nulo ou vazio.")
    private String nomeCompleto;
    @NotEmpty(message = "Telefone não pode ser nulo ou vazio.")
    private String telefone;

    public ContatoRequest() {
    }

    public ContatoRequest(Integer id, String nomeCompleto, String telefone) {
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
        if (!(o instanceof ContatoRequest)) return false;
        ContatoRequest that = (ContatoRequest) o;
        return Objects.equals(id, that.id) && Objects.equals(nomeCompleto, that.nomeCompleto) && Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCompleto, telefone);
    }
}
