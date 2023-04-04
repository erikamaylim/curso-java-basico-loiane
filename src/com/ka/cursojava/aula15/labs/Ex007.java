// Faça um programa que leia três números e mostre o maior e o menor deles.

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        int maior = n1;
        int menor = n1;

        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();
        if (n2 > maior) {
            maior = n2;
        }
        if (n2 < menor) {
            menor = n2;
        }

        System.out.print("Digite o terceiro número: ");
        int n3 = scan.nextInt();
        if (n3 > maior) {
            maior = n3;
        }
        if (n3 < menor) {
            menor = n3;
        }

        System.out.printf("O maior número é %d.%n", maior);
        System.out.printf("O menor número é %d.%n", menor);




    }
}
