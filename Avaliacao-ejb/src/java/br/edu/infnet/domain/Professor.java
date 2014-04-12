package br.edu.infnet.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Hudson Schumaker
 */
@Entity
@DiscriminatorValue(value = "PRF")
public class Professor extends Funcionario {

    private int areaAtuacao;
    private String titulacao;

    public int getAreaAtuacao() {

        return areaAtuacao;
    }

    public void setAreaAtuacao(int areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}