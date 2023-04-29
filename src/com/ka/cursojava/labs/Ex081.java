/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento
do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2, ou seja: B[i] = A[i] % 2
*/

package com.ka.cursojava.labs;

public class Ex081 {
    public static void main(String[] args) {
        int[] vetorA = {34, 10, 16, 2, 31, 4, 15, 48, 35, 36};
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] % 2;
        }

        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (i == vetorA.length - 1) {
                System.out.printf("%2d %n", vetorA[i]);
            } else {
                System.out.printf("%2d, ", vetorA[i]);
            }
        }

        System.out.print("Elementos do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            if (i == vetorB.length - 1) {
                System.out.printf("%2d %n", vetorB[i]);
            } else {
                System.out.printf("%2d, ", vetorB[i]);
            }
        }
    }

}
