package com.company.projetogui.Model;

public class Caixa {

    //atributos
    private double saldo;

    //get and set
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    public String depositar(double valor){
        if(valor > 0){
            saldo+=valor;
            return "Depósito efetuado com sucesso. Valor: " + valor + "\n";
        }
        return "Valor inválido para deposito \n";
    }

    public String sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
            return "Saque efetuado com sucesso. Valor: " + valor + "\n";
        }
        return "Valor indisponível para saque \n";
    }
}
