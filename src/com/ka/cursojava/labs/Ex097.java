/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tamanho, obedecendo as seguintes
regras:
    B[i] = a quando A[i] < 7
    B[i] = b quando A[i] = 7
    B[i] = c quando A[i] > 7  e A[i] < 10
    B[i] = d quando A[i] = 10
    B[i] = e quando A[i] > 10
*/

package com.ka.cursojava.labs;

public class Ex097 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        char[] vetorB = new char[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 20);
            if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else {
                vetorB[i] = 'a';
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%3d ", vetorA[i]);
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("%3s ", vetorB[i]);
        }


    }
}
