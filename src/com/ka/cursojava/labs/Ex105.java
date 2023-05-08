/* Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação
de todos os divisores do respectivo elemento.
*/

package com.ka.cursojava.labs;

public class Ex105 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 100);
            System.out.printf("%2d. ", vetorA[i]);
            System.out.printf("Divisores de %2d até o mesmo: ", vetorA[i]);
            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                System.out.printf("%2d ", j);
                }
            }
            System.out.println();

        }

    }
}
