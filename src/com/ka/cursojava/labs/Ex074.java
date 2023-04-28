/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento
do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[i]
*/
package com.ka.cursojava.labs;

public class Ex074 {
    public static void main(String[] args) {
        int[] vetorA = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Elementos dos vetor A: ");
        for (int item : vetorA
             ) {
            if (item == vetorA[vetorA.length - 1]) {
                System.out.printf("%3d %n", item);
            } else {
                System.out.printf("%3d, ", item);
            }
        }

        System.out.print("Elementos dos vetor B: ");
        for (int item : vetorB
        ) {
            if (item == vetorB[vetorB.length - 1]) {
                System.out.printf("%3d %n", item);
            } else {
                System.out.printf("%3d, ", item);
            }
        }
    }
}
