package com.ka.cursojava.labs.ex136;

import java.util.Scanner;

public class Ex136 {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("João", 1000);
        PessoaFisica pf2 = new PessoaFisica("Maria", 2000);
        PessoaFisica pf3 = new PessoaFisica("Joana", 3700);
        PessoaJuridica pj1 = new PessoaJuridica("Padaria do Seu Joaquim", 5000);
        PessoaJuridica pj2 = new PessoaJuridica("Armazém das Flores", 3000);
        PessoaJuridica pj3 = new PessoaJuridica("Oficina Pneu Furado", 4000);

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pf1;
        contribuintes[1] = pj1;
        contribuintes[2] = pf2;
        contribuintes[3] = pj2;
        contribuintes[4] = pf3;
        contribuintes[5] = pj3;

        for (Contribuinte c : contribuintes) {
            System.out.println(c);
        }

    }

}
