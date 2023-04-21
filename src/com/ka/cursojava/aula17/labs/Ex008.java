/* Faça um programa que leia 5 números e informe a soma e a média dos números. */

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = sc.nextInt();
            soma += num;
        }
        System.out.printf("Soma dos números digitados é %d %n", soma);
        double media = (double)soma / 5;
        System.out.printf("Média dos números digitados: %.1f %n", media);
    }
}
