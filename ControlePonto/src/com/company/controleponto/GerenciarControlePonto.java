package com.company.controleponto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Gerente gerente = new Gerente();
        gerente.setLogin("gerente");
        gerente.setSenha("123");
        gerente.setIdFunc(1);
        gerente.setNome("Gerente João");
        gerente.setEmail("joao@gmail.com");
        gerente.setDocumento("123-456");

        Secretaria secretaria = new Secretaria();
        secretaria.setRamal("5555");
        secretaria.setTelefone("3362");
        secretaria.setIdFunc(2);
        secretaria.setNome("Secretaria Maria");
        secretaria.setEmail("maria@gmail.com");
        secretaria.setDocumento("456-895");

        Operador operador = new Operador();
        operador.setValorHora(2.9);
        operador.setIdFunc(3);
        operador.setNome("Operador Zé");
        operador.setEmail("operador@gmail.com");
        operador.setDocumento("145-875");

        RegistroPonto r1 = new RegistroPonto();
        r1.setIdRegPonto(1);
        r1.setFunc(gerente);
        r1.setDataRegistro(LocalDate.now());
        r1.setHoraEntrada(LocalDateTime.now());
        r1.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto r2 = new RegistroPonto();
        r2.setIdRegPonto(2);
        r2.setFunc(secretaria);
        r2.setDataRegistro(LocalDate.now());
        r2.setHoraEntrada(LocalDateTime.now());
        r2.apresentarRegistroPonto();
        Thread.sleep(1000);

        RegistroPonto r3 = new RegistroPonto();
        r3.setIdRegPonto(3);
        r3.setFunc(operador);
        r3.setDataRegistro(LocalDate.now());
        r3.setHoraEntrada(LocalDateTime.now());
        r3.apresentarRegistroPonto();
        Thread.sleep(1000);

        r1.setHoraSaida(LocalDateTime.now());
        r1.apresentarRegistroPonto();
        Thread.sleep(1000);

        r2.setHoraSaida(LocalDateTime.now());
        r2.apresentarRegistroPonto();
        Thread.sleep(1000);

        r2.setHoraSaida(LocalDateTime.now());
        r2.apresentarRegistroPonto();
        Thread.sleep(1000);
    }
}
