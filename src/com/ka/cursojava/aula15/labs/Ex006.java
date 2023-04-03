// Faça um programa que leia três números e mostre o maior deles.

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        int maior = n1;

        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();
        if (n2 > maior) {
            maior = n2;
        }

        System.out.print("Digite o terceiro número: ");
        int n3 = scan.nextInt();
        if (n3 > maior) {
            maior = n3;
        }

        System.out.printf("O maior número é %d %n ", maior);



    }
}
