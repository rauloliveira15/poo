package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Poupanca p = new Poupanca();
        p.setAgencia("AG001");
        p.setCidade("Mogi Mirim");
        p.setNumConta(123456);
        p.setSaldo(1250);
        p.setDiaAniversario(15);
        System.out.println(p.toString());

        Corrente cc = new Corrente();
        cc.setLimiteCheque(3000);
        cc.setAgencia("AG002");
        cc.setCidade("Mogi Guaçu");
        cc.setNumConta(123);
        cc.setSaldo(3900);
        System.out.println(cc.toString());

        GerenciarPatrimonio gp = new GerenciarPatrimonio();
        gp.adicionarConta(p);
        gp.adicionarConta(cc);
        System.out.println("Total do Patrimonio: " + gp.getTotalPatrimonio());
    }
}
