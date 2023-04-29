/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a
multiplicação dos elementos em A e B, ou seja: C[i] = A[i] * B[i]
*/

package com.ka.cursojava.labs;

public class Ex079 {
    public static void main(String[] args) {
        int[] vetorA = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] vetorB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            if (i == vetorA.length - 1) {
                System.out.printf("%3d %n", vetorA[i]);
            } else {
                System.out.printf("%3d, ", vetorA[i]);
            }
        }

        System.out.print("Elementos do vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            if (i == vetorB.length - 1) {
                System.out.printf("%3d %n", vetorB[i]);
            } else {
                System.out.printf("%3d, ", vetorB[i]);
            }
        }

        System.out.print("Elementos do vetor C: ");
        for (int i = 0; i < vetorC.length; i++){
            if (i == vetorC.length - 1) {
                System.out.printf("%3d %n", vetorC[i]);
            } else {
                System.out.printf("%3d, ", vetorC[i]);
            }
        }
    }
}
