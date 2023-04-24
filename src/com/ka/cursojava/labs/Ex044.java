/* Faça um programa que leia 5 números e informe o maior número. */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = sc.nextInt();
            if (i == 1) {
                maior = i;
            }
            if (num > maior) {
                maior = num;
            }
        }
        System.out.printf("Maior número digitado: %d", maior);

    }
}
