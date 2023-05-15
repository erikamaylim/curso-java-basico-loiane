/* Gere e imprima uma matriz M 4x4 com valores aleatórios enre 0 e 9. Após isto, determine o maior número da matriz e
a sua posição (linha e coluna)
*/

package com.ka.cursojava.labs;

import java.util.Random;

public class Ex108 {
    public static void main(String[] args) {
        int[][] matrizM = new int[4][4];

        Random random = new Random();

        int maior = matrizM[0][0], iMaior = 0, jMaior = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(10);
                if (matrizM[i][j] > maior) {
                    maior = matrizM[i][j];
                    iMaior = i;
                    jMaior = j;
                }
            }
        }

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.printf("%2d ", matrizM[i][j]);
            }
            System.out.println();
        }

        System.out.printf("Maior número é %d na posição matrizM[%d][%d]", maior, iMaior, jMaior);
    }
}
