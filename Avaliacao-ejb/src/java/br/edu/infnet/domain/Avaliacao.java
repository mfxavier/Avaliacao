package br.edu.infnet.domain;

import java.util.Date;

/**
 *
 * @author Hudson Schumaker
 */
public class Avaliacao {

    private int codigo;
    private Date dataHoraFim;
    private Date dataHoraInicio;
    private String objetivoAvaliacao;
    private String textoAvalicao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public String getObjetivoAvaliacao() {
        return objetivoAvaliacao;
    }

    public void setObjetivoAvaliacao(String objetivoAvaliacao) {
        this.objetivoAvaliacao = objetivoAvaliacao;
    }

    public String getTextoAvalicao() {
        return textoAvalicao;
    }

    public void setTextoAvalicao(String textoAvalicao) {
        this.textoAvalicao = textoAvalicao;
    }
}