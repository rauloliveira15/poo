package com.company;

public class Corrente extends Conta {
    private double limiteCheque;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Limite de Cheque: " + limiteCheque);
        return sb.toString();
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (getSaldo()+limiteCheque)){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }

    public double getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
}
