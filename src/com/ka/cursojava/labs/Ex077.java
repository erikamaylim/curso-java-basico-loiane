/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma
 dos elementos em A e B, ou seja: C[i] = A[i] + B[i]
*/

package com.ka.cursojava.labs;

public class Ex077 {
    public static void main(String[] args) {

        int[] vetorA = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] vetorB = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("Elementos do vetor A: ");
        for (int item : vetorA
             ) {
            if (item == vetorA[vetorA.length - 1]) {
                System.out.printf("%2d %n", item);
            } else {
                System.out.printf("%2d, ", item);
            }
        }

        System.out.print("Elementos do vetor B: ");
        for (int item : vetorB
        ) {
            if (item == vetorB[vetorB.length - 1]) {
                System.out.printf("%2d %n", item);
            } else {
                System.out.printf("%2d, ", item);
            }
        }

        System.out.print("Elementos do vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            if (i == vetorC.length - 1) {
                System.out.printf("%2d %n", vetorC[i]);
            } else {
                System.out.printf("%2d, ", vetorC[i]);
            }
        }
    }
}
