/* Criar dois vetores A e B, cada um com 10 números inteiros. Construir um vetor C de mesmo tamanho e tipo,
obedecendo as seguintes regras de formação
    C[i] = 1 quando A[i] > B[i]
    C[i] = 0 quando A[i] = B[i]
    C[i] = -1 quando A[i] < B[i]
*/

package com.ka.cursojava.labs;

public class Ex096 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++ ) {
            vetorA[i] = (int)Math.round(Math.random() * 9);
            vetorB[i] = (int)Math.round(Math.random() * 9);
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%3d ", vetorA[i]);
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%3d ", vetorB[i]);
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("%3d ", vetorC[i]);
        }
    }
}
