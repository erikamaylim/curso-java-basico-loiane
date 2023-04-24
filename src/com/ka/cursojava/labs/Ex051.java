/* Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de
ímpares */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0, num;

        for (int i = 1; i <= 10; i++){
            System.out.printf("Digite o %dº número: ", i);
            num = sc.nextInt();

            if (num % 2 == 0) {
                pares ++;
            } else {
                impares ++;
            }
        }

        System.out.printf("Quantidade de números pares: %d %n" +
                "Quantidade de números ímpares: %d %n", pares, impares);

    }
}
