package br.edu.infnet.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Hudson Schumaker
 */
@Entity
@DiscriminatorValue(value = "ADM")
public class Funcionario extends Usuario {

    private String cargo;
    private double renumeracao;
    private int statusAtividade;
    private String escolaridade;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getRenumeracao() {
        return renumeracao;
    }

    public void setRenumeracao(double renumeracao) {
        this.renumeracao = renumeracao;
    }

    public int getStatusAtividade() {
        return statusAtividade;
    }

    public void setStatusAtividade(int statusAtividade) {
        this.statusAtividade = statusAtividade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}