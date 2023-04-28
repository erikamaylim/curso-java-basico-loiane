/* Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos"
elementos do vetor A, ou seja B[i] = A[i]
*/

package com.ka.cursojava.labs;

public class Ex072 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i];
        }

        System.out.println("Elementos do vetor A: ");
        for (int item : vetorA
             ) {
            if (item == vetorA[vetorA.length - 1]) {
                System.out.println(item);
            } else {
                System.out.printf("%d, ", item);
            }
        }
        System.out.println("Elementos do vetor B: ");

        for (int item : vetorB
        ) {
            if (item == vetorB[vetorB.length - 1]) {
                System.out.println(item);
            } else {
                System.out.printf("%d, ", item);
            }
        }


    }
}
