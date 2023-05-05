/* Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que, nos vetores B e C, serão armazenados os
valores pares e ímpares de A, respectivamente.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[20];

        int qtdPares = 0, qtdImpares = 0;

//        for (int i = 0; i < vetorA.length; i++) {
//            vetorA[i] = (int) Math.round(Math.random() * 9);
//            if (vetorA[i] % 2 == 0) {
//                qtdPares++;
//            } else {
//                qtdImpares++;
//            }
//        }

        for(int i = 0; i < vetorA.length; i++) {
            System.out.printf("%dº elemento do vetorA: ", i + 1);
            vetorA[i] = sc.nextInt();
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }

        int[] vetorB = new int[qtdPares];
        int[] vetorC = new int[qtdImpares];

        for (int i = 0, j = 0, k = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[j] = vetorA[i];
                j++;
            } else {
                vetorC[k] = vetorA[i];
                k++;
            }
        }

        System.out.print("Vetor A: ");
        for (int j : vetorA) {
            System.out.printf("%d ", j);
        }

        System.out.print("\nVetor B: ");
        for (int j : vetorB) {
            System.out.printf("%d ", j);
        }

        System.out.print("\nVetor C: ");
        for (int j : vetorC) {
            System.out.printf("%d ", j);
        }
    }
}
