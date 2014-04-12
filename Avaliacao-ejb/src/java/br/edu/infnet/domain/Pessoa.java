package br.edu.infnet.domain;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Hudson Schuamker
 */
@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipousuario", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa implements Serializable {

    @Id
    private int id;
    private String nome;
    private String nsacimento;
    private String genero;
    private String rg;
    private String cpf;
    private String endereco;
    private String cidade;
    private String estado;
    private String pais;
    private int cep;
    private int telefoneRes;
    private int telefoneCel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNsacimento() {
        return nsacimento;
    }

    public void setNsacimento(String nsacimento) {
        this.nsacimento = nsacimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefoneRes() {
        return telefoneRes;
    }

    public void setTelefoneRes(int telefoneRes) {
        this.telefoneRes = telefoneRes;
    }

    public int getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(int telefoneCel) {
        this.telefoneCel = telefoneCel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
