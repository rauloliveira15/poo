package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador computador = new Computador();
        computador.preco = 1_000;
        computador.cor = "Cinza";
        computador.marca = "HP";
        computador.numeroSerie = 111222333;
        computador.modelo = "Desktop";
        computador.imprimir();
        computador.calcularValor();
        computador.imprimir();

        Computador computador1 = new Computador();
        computador1.preco = 1_200;
        computador1.cor = "Branco";
        computador1.marca = "IBM";
        computador1.numeroSerie = 222444221;
        computador1.modelo = "Notebook";
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        int retorno = computador1.alterarValor(1_900);

        if(retorno == 1){
            System.out.println("Valor alterado");
        }else{
            if(retorno == 0){
                System.out.println("valor NAO alterado");
            }
        }

        computador1.imprimir();

    }
}
