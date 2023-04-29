/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento
do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: b[i] = A[i] * i
*/

package com.ka.cursojava.labs;

public class Ex076 {
    public static void main(String[] args) {
        int[] vetorA = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * i;
        }

        System.out.print("Elementos do Vetor A: ");
        for (int item : vetorA
             ) {
            if (item == vetorA[vetorA.length - 1]) {
                System.out.printf("%3d %n", item);
            } else {
                System.out.printf("%3d, ", item);
            }
        }

        System.out.print("Elementos do Vetor B: ");
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
