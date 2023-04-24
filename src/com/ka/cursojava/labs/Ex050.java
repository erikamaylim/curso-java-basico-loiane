/* Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo.
Não utilide a função de potência da linguagem. */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;

        System.out.println("*** Calculadora de Potência ***");
        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        for (int i = 1 ; i <= expoente; i++) {
            result *= base;

        }

        System.out.printf("%d elevado a %d = %d", base, expoente, result);
    }
}
