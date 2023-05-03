/* Ler um vetor A com 10 elementos inteiros correspondentes às idades de um grupo de pessoas.
Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];

        int qtdMaior35 = 0;


        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Idade da %dª pessoa: ", i + 1);
            vetorA[i] = sc.nextInt();

            if (vetorA[i] > 35) {
                qtdMaior35++;
            }

        }
        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {

            if (i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

        System.out.printf("Quantidade de pessoas com mais de 35 anos: %d %n", qtdMaior35);

    }
}
