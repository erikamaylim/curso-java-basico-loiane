//Faça um programa que peça dois números inteiros e um real. Calcule e mostre:
// a. O produto do dobro do primeiro com metade do segundo;
// b. A soma do triplo do primeiro com o terceiro;
// c. O terceiro elevado ao cubo.

package com.ka.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro1 = scan.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int inteiro2 = scan.nextInt();
        System.out.print("Agora, digite um número real: ");
        double real = scan.nextDouble();
        int solucao1 = (inteiro1 * 2) * (inteiro2 / 2);
        double solucao2 = (inteiro1 * 3) + real;
        double solucao3 = Math.pow(real, 3);
        System.out.printf("O produto do dobro do primeiro com metade do segundo = %d %n", solucao1);
        System.out.printf("A soma do triplo do primeiro com o terceiro = %.1f %n", solucao2);
        System.out.printf("O terceiro elevado ao cubo = %.1f %n", solucao3);

    }
}
