package com.company;

import java.util.Scanner;

public class PrincipalFuncionarios {

    public static final int T = 10;
    public int indice = 0;
    public  Funcionario func[] = new Funcionario[T];

    public void execListarTodos(){
        for (Funcionario x : func) {
            if(x!=null){
                x.imprimir();
            }
        }
    }

    public void execCadastro(){
        Scanner sc = new Scanner(System.in);
        if(indice < T){
            Funcionario f = new Funcionario();
            System.out.println("Digite o nome: ");
            f.nome = sc.nextLine();
            System.out.println("Digite o departamento: ");
            f.departamento = sc.nextLine();
            System.out.println("Digite o salário: ");
            f.salario = Double.parseDouble(sc.nextLine());
            System.out.println("Digite o RG: ");
            f.rg = sc.nextLine();
            f.estaNaEmpresa = true;
            System.out.println("Cadastro efetuado com sucesso!");
            func[indice++] = f;
        }
    }

    public void execBonificacao(){
        Scanner sc = new Scanner(System.in);
        String rgProc;
        System.out.println("Digite o RG do funcionario a ser bonificado: ");
        rgProc = sc.nextLine();
        //varrer o vetor a procura
        for(Funcionario x : func){
            if(x!=null){
                if(x.rg.equals(rgProc)){
                    System.out.println("Digite o valor da bonificação: ");
                    double valor = Double.parseDouble(sc.nextLine());
                    x.bonificar(valor);
                    System.out.println("Bonificação efetuada!");
                    return;
                }
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    public void execConsulta() {
        Scanner sc = new Scanner(System.in);
        String rgProc;
        System.out.println("Digite o RG do funcionario a ser encontrado: ");
        rgProc = sc.nextLine();
        //varrer o vetor a procura
        for (Funcionario x : func) {
            if (x != null) {
                if(x.rg.equals(rgProc)){
                    x.imprimir();
                    return;
                }
            }
        }
        System.out.println("Funcionario não encontrado!");
    }

    public static void main(String[] args) {
	// write your code here
        PrincipalFuncionarios pf = new PrincipalFuncionarios();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1 -- Cadastrar");
            System.out.println("2 -- Consultar");
            System.out.println("3 -- Bonificar");
            System.out.println("4 -- Listar todos");
            System.out.println("9 -- Sair");
            System.out.printf("Digite a opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    pf.execCadastro();
                    break;
                case 2:
                    pf.execConsulta();
                    break;
                case 3:
                    pf.execBonificacao();
                    break;
                case 4:
                    pf.execListarTodos();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opc!=9);
    }
}
