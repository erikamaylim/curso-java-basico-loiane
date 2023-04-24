/* Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele
que é divisível somente por ele mesmo e por 1. */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validacao = true;
        String continuar = "S";

        do {

            System.out.print("Digite um número para saber se ele é primo: ");
            int num = sc.nextInt();
            int cont = 0;
            for (int i = num; i > 0; i--) {
                if (num % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.printf("%d é primo %n", num);
            } else {
                System.out.printf("%d não é primo %n", num);
            }

            do {
                System.out.print("Quer continuar? [S/N]: ");
                continuar = sc.next().toUpperCase();
            } while (!continuar.equals("S") && !continuar.equals("N"));
            if (continuar.equals("N")) {
                validacao = false;
            }

        } while (validacao);

    }
}
