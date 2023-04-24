/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex: 5! = 5.4.3.2.1 = 120 A
saída deve ser conforme exemplo abaixo:
    Fatorial de: 5
    5! = 5.4.3.2.1 = 120

*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mult = 1;
        System.out.print("Fatorial de: ");
        int fatorial = sc.nextInt();

        System.out.printf("%d! = ", fatorial);
        for (int i = fatorial; i >= 1; i--) {
            if (i == 1) {
                System.out.printf("%d = ", i);
            } else {
                System.out.printf("%d . ", i);
            }
            mult *= i;
        }
        System.out.printf("%d %n", mult);

    }
}
