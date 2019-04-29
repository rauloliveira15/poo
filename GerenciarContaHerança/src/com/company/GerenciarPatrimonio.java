package com.company;

public class GerenciarPatrimonio {
    private double totalPatrimonio;

    public void adicionarConta(Conta x){
        totalPatrimonio += x.getSaldo();
    }

    public double getTotalPatrimonio(){
        return totalPatrimonio;
    }
}
