/* Capture do teclado valores para preenchimento de uma matriz M 3x3. Imprima a matriz e encontre a quantidade de
números pares e de ímpares.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizM = new int[3][3];

        int qtdPares = 0, qtdImpares = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.printf("Digite um valor para a posição M[%d][%d]: ", i, j);
                matrizM[i][j] = sc.nextInt();
                if (matrizM[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.printf("%2d ", matrizM[i][j]);
            }
            System.out.println();
        }

        System.out.printf("Quantidade de pares: %d %n", qtdPares);
        System.out.printf("Quantidade de ímpares: %d %n", qtdImpares);
    }
}
