package com.company;

public abstract class Conta {
    private int numConta;
    private String agencia;
    private String cidade;
    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Num: " + numConta + "\n");
        sb.append("Ag: " + agencia + "\n");
        sb.append("Cidade: " + cidade + "\n");
        sb.append("Saldo: " + saldo + "\n");
        return sb.toString();
    }

    abstract boolean sacar(double valor);

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
