package com.company.controleponto;

public class Gerente extends Funcionario {

    //Atributos
    private String login;
    private String senha;

    //Getters and Setters
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
}
