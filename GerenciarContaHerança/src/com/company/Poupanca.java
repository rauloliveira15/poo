package com.company;

public class Poupanca extends Conta {
    private int diaAniversario;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Dia Aniversário: " + diaAniversario);
        return sb.toString();
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= getSaldo()){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
}
