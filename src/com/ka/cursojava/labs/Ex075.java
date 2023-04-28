/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento deverá
ser a raiz quadrada do respectivo elemento de A. Ou seja: B[i] = sqrt(A[i])
*/

package com.ka.cursojava.labs;

public class Ex075 {
    public static void main(String[] args) {
        int[] vetorA = {225, 196, 169, 144, 121, 100, 81, 64, 49, 36, 25, 16, 9, 4, 1};
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Elementos dos vetor A: ");
        for (int item : vetorA
        ) {
            if (item == vetorA[vetorA.length - 1]) {
                System.out.printf("%5d %n", item);
            } else {
                System.out.printf("%5d, ", item);
            }
        }

        System.out.print("Elementos dos vetor B: ");
        for (double item : vetorB
        ) {
            if (item == vetorB[vetorB.length - 1]) {
                System.out.printf("%5.1f %n", item);
            } else {
                System.out.printf("%5.1f, ", item);
            }
        }

    }
}
