package br.edu.infnet.domain;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class Usuario extends Pessoa {

    private String login;
    private String senha;
    private String tipousuario;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return tipousuario;
    }

    public void setPerfil(String perfil) {
        this.tipousuario = perfil;
    }
}