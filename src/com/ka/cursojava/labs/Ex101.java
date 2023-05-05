/* Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando um vetor extra B. Sugestão:
no início do vetor B, armazene os elementos pares de A e, nas posições restantes, armazene os elementos de A que são
ímpares.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int ultimo = 0;

//        for(int i = 0, j = 0; i < vetorA.length; i++) {
//            vetorA[i] = (int) Math.round(Math.random() * 9);
//            if (vetorA[i] % 2 == 0) {
//                vetorB[j] = vetorA[i];
//                ultimo = j;
//                j++;
//            }
//        }

        for(int i = 0, j = 0; i < vetorA.length; i++) {
            System.out.printf("%dº elemento do vetor A: ", i + 1);
            vetorA[i] = sc.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[j] = vetorA[i];
                ultimo = j;
                j++;
            }
        }


        for(int i = 0, j = ultimo + 1; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[j] = vetorA[i];
                j++;
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
    }
}
