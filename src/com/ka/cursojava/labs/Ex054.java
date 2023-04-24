/* Faça um programa que calcule o fatorial de um número inteiro fornecido élo usuário. RS: 5! = 5x4x3x2x1 = 120 */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mult = 1;
        System.out.println("***  FATORIAL  ***");
        System.out.print("Digite um número para calcular seu fatorial: ");
        int num = sc.nextInt();

        System.out.printf("%d! = ", num);
        for (int i = num; i > 0; i--  ) {
            if (i == 1) {
                System.out.printf("%d = ", i);
            } else {
                System.out.printf("%d x ", i);
            }
            mult *= i;
        }
        System.out.println(mult);
    }
}
