/* Faça um programa que mostre os n termos da série a seguir:
    s = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
Imprima no final a soma da série
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, j = 1;
        double soma = 0;

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        System.out.print("S = ");
        while (i <= n ) {
            if (i == n) {
                System.out.printf("%d/%d = ", i, j);
            } else {
            System.out.printf("%d/%d + ", i, j);
            }
            soma += ((double) i /j);
            i++;
            j += 2;
        }
        System.out.printf("%,.2f", soma);
    }
}
