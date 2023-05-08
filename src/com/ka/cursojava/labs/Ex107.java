/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do
vetor B seja o fatorial do elemento correspondente em A.
*/

package com.ka.cursojava.labs;

public class Ex107 {
    public static void main(String[] args) {
        long[] vetorA = new long[15];
        long[] vetorB = new long[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (i == 0) {
                System.out.printf("{%d, ", vetorA[i]);
            } else if (i == vetorA.length - 1) {
                System.out.printf("%d} %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            if (i == 0) {
                System.out.printf("{%d, ", vetorB[i]);
            } else if (i == vetorB.length - 1) {
                System.out.printf("%d} %n", vetorB[i]);
            } else {
                System.out.printf("%d, ", vetorB[i]);
            }
        }
    }
}
