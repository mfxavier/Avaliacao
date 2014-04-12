package br.edu.infnet.domain;

import java.sql.Time;

/**
 *
 * @author Hudson Schumaker
 */
public class Curso {

    private String nome;
    private Time tempCurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTempCurso() {
        return tempCurso;
    }

    public void setTempCurso(Time tempCurso) {
        this.tempCurso = tempCurso;
    }
}