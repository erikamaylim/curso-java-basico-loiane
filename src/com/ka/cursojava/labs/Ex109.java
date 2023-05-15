/* Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0 e 9. Após isto, indique o maior e o menor valor
da linha 5 e o maior e o menor valor da coluna 7
*/

package com.ka.cursojava.labs;

import java.util.Random;

public class Ex109 {
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];

        Random random = new Random();

        int maiorLinha, menorLinha, maiorCol, menorCol, linha = 5, coluna = 7;


        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(10);
            }
        }

        maiorLinha = matrizM[linha][0];
        menorLinha = matrizM[linha][0];
        maiorCol = matrizM[0][coluna];
        menorCol = matrizM[0][coluna];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.printf("%2d ", matrizM[i][j]);
                if (matrizM[linha][j] > maiorLinha) {
                    maiorLinha = matrizM[linha][j];
                } else if (matrizM[linha][j] < menorLinha) {
                    menorLinha = matrizM[linha][j];
                }

                if (matrizM[i][coluna] > maiorCol) {
                    maiorCol = matrizM[i][coluna];
                }else if (matrizM[i][coluna] < menorCol) {
                    menorCol = matrizM[i][coluna];
                }
            }
            System.out.println();
        }

        System.out.printf("Menor valor da linha %d: %d %n", linha, menorLinha);
        System.out.printf("Maior valor da linha %d: %d %n", linha, maiorLinha);
        System.out.printf("Menor valor da coluna %d: %d %n", coluna, menorCol);
        System.out.printf("Maior valor da coluna %d: %d %n", coluna, maiorCol);

    }


}
