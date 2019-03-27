package com.company;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
    // Instanciar a propria classe para acessar o atributo ct
        ContaTeste ct = new ContaTeste();
        int opc=0;
        do{
            System.out.println("MENU");
            System.out.println("(1) Cadastrar");
            System.out.println("(2) Consultar");
            System.out.println("(3) Depositar");
            System.out.println("(4) Sacar");
            System.out.println("(9) Sair");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execConsultar();
                    break;
                case 3:
                    ct.execDepositar();
                    break;
                case 4:
                    ct.execSacar();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        System.out.println("Cadastro de cliente");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Digite a conta: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite a agencia: ");
        cc.agencia = sc.nextLine();
        System.out.println("Cadastro efetuado com sucesso!");
    }

    public void execConsultar(){
        cc.imprimir();
    }

    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        int retorno = cc.sacar(valor);
        if(retorno == 1){
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Limite indisponível!");
        }
    }

    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito realizado com sucesso!");
    }
}
