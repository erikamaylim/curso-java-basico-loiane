/* Faça um programa que mostre os n termos da série a seguir:
    s = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
Imprima no final a soma da série
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex070Outro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        System.out.print("S = ");
        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            if(i == n) {
                System.out.printf("%d/%d = ", i, j);
            } else {
                System.out.printf("%d/%d + ", i, j);
            }
            soma += ((double) i/j);
        }

        System.out.printf("%,.2f", soma);
    }
}
