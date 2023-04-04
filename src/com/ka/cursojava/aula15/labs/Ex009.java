// Faça um programa que leia três números e mostre-os em ordem decrescente

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeiro, segundo , terceiro;

        System.out.print("Escreva um número: ");
        int n1 = scan.nextInt();
        primeiro = n1;

        System.out.print("Escreva outro número: ");
        int n2 = scan.nextInt();
        if (n2 >= n1) {
            primeiro = n2;
            segundo = n1;
        } else {
            segundo = n2;
        }

        System.out.print("Digite mais um número: ");
        int n3 = scan.nextInt();
        if (n3 >= primeiro) {
            terceiro = segundo;
            segundo = primeiro;
            primeiro = n3;
        } else if (n3 <= primeiro && n3 >= segundo) {
            terceiro = segundo;
            segundo = n3;
        } else {
            terceiro = n3;
        }

        System.out.printf("Em ordem descrescente: %d, %d, %d", primeiro, segundo, terceiro);


    }
}
