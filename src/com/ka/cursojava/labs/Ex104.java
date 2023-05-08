/* Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação
de todos os pares até o respectivo elemento.
*/

package com.ka.cursojava.labs;

public class Ex104 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 30);
            System.out.printf("%2d. ", vetorA[i]);
            System.out.printf("Números pares até %2d: ", vetorA[i]);
            for (int j = 2; j <= vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.printf("%d ", j);
                }
            }
            System.out.println();
        }


    }
}
