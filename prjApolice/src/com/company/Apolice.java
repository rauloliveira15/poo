package com.company;

public class Apolice {

    //Atributos
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    //Construtor
    public Apolice(String nomeSegurado, int idade, double valorPremio){
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    //Getters and Setters
    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }
    public String getNomeSegurado(){
        return this.nomeSegurado;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
    public double getValorPremio(){
        return this.valorPremio;
    }

    //Métodos
    public void imprimir(){
        System.out.println("Nome Segurado: " + this.nomeSegurado);
        System.out.println("Idade: " + this.idade);
        System.out.println("Valor do Premio: " + this.valorPremio);
    }
}
