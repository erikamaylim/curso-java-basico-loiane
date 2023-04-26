/* Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n, faça um programa que calcule o valor de h com n termos.
*/
package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 1;

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("H = 1");
            System.exit(0);
        } else {
            System.out.print("H = 1 + ");
        }

        for (int i = 2; i <= n; i++) {
            if (i == n) {
                System.out.printf("1/%d = ", i);
            } else {
                System.out.printf("1/%d + ", i);
            }
            soma += ((double) 1/i);
        }

        System.out.printf("%,.2f", soma);

    }
}
