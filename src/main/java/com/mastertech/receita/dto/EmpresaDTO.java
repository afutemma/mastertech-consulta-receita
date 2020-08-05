package com.mastertech.receita.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmpresaDTO {

    private String cnpj;
    private String nome;
    @JsonProperty("capital_social")
    private double capital;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
}
