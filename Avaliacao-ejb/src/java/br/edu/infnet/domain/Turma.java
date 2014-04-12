package br.edu.infnet.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class Turma {

    private String idenfificao;
    private String periodo;
    private String diaAula;
    private String sala;

    public String getIdenfificao() {
        return idenfificao;
    }

    public void setIdenfificao(String idenfificao) {
        this.idenfificao = idenfificao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDiaAula() {
        return diaAula;
    }

    public void setDiaAula(String diaAula) {
        this.diaAula = diaAula;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}