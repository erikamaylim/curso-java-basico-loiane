/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tamanho e tipo, obedecendo as seguintes
regras de formação:
    B[i] = 1 quando A[i] for par
    B[i] = 0 quando A[i] for ímpar
*/

package com.ka.cursojava.labs;

public class Ex095 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 9);
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }
        System.out.println(" ");
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%d ", vetorB[i]);
        }

    }
}
