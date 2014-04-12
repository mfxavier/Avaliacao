package br.edu.infnet.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Hudson Schumaker
 */
@Entity
@DiscriminatorValue(value = "ALU")
public class Aluno extends Usuario {

    private int matricula;
    private int statusMatricula;
    private int situacaoAluno;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(int statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public int getSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(int situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }
}