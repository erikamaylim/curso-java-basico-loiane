/* Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores.
Os primeiros 10 elementos de C deverão receber os elementos de A e os últimos elementos de C deverão receber os
elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length + vetorB.length];

//        for (int i = 0; i < vetorA.length; i++) {
//            vetorA[i] = (int) Math.round(Math.random() * 9);
//            vetorB[i] = (int) Math.round(Math.random() * 9);
//            vetorC[i] = vetorA[i];
//            vetorC[vetorB.length + i] = vetorB[i];
//        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%dº elemento do vetor A: ", i + 1);
            vetorA[i] = sc.nextInt();
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%dº elemento do vetor B: ", i + 1);
            vetorB[i] = sc.nextInt();
            vetorC[vetorB.length + i] = vetorB[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%d ", vetorB[i]);
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("%d ", vetorC[i]);
        }
    }
}
