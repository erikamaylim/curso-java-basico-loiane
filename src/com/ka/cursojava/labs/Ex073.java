/* Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho com os elementos do vetor
A multiplicados por 2. Ou seja: B[i] = A[I] * 2
*/

package com.ka.cursojava.labs;

public class Ex073 {
    public static void main(String[] args) {
        int[] vetorA = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Elementos do vetor A: ");
        for (int item : vetorA
             ) {
            if (item == vetorA[vetorA.length - 1]) {
                System.out.printf("%2d", item);
            } else {
                System.out.printf("%2d, ", item);
            }
        }
        System.out.println(" ");
        System.out.print("Elementos do vetor B: ");
        for (int item : vetorB
        ) {
            if (item == vetorB[vetorB.length - 1]) {
                System.out.printf("%2d", item);
            } else {
                System.out.printf("%2d, ", item);
            }
        }



    }
}
