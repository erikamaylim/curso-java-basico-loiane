/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a
divisão dos elementos em A e B, ou seja: C[i] = A[i] / (double) B[i]
*/

package com.ka.cursojava.labs;

public class Ex080 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 70, 72, 8, 95, 73, 92, 30, 13, 83};
        int[] vetorB = { 3, 9, 7, 4, 5, 5, 7, 9, 9, 4 };
        double[] vetorC = new double[vetorA.length];

        for(int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] / (double) vetorB[i];
        }

        System.out.print("Elementos do Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (i == vetorA.length - 1) {
                System.out.printf("%5d %n", vetorA[i]);
            } else {
                System.out.printf("%5d, ", vetorA[i]);
            }
        }

        System.out.print("Elementos do Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            if (i == vetorB.length - 1) {
                System.out.printf("%5d %n", vetorB[i]);
            } else {
                System.out.printf("%5d, ", vetorB[i]);
            }
        }

        System.out.print("Elementos do Vetor A: ");
        for (int i = 0; i < vetorC.length; i++) {
            if (i == vetorC.length - 1) {
                System.out.printf("%5.1f %n", vetorC[i]);
            } else {
                System.out.printf("%5.1f, ", vetorC[i]);
            }
        }



    }
}
