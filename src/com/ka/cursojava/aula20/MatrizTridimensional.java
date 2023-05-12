/* Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a soma dos seus índices (Ex:
M[1][2][1] = 1 + 2 + 1 = 4)
Obtenha a soma de todos os elementos da matriz e obtenha a soma dos valores pares e a soma dos valores ímpares.
Exiba na tela os resultados das somas.
*/

package com.ka.cursojava.aula20;

public class MatrizTridimensional {
    public static void main(String[] args) {
        int[][][] matrizTridimensional = new int[3][3][3];

        int soma = 0, somaPares = 0, somaImpares = 0;

        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    matrizTridimensional[i][j][k] = i + j + k;
                    soma += matrizTridimensional[i][j][k];
                    if (matrizTridimensional[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimensional[i][j][k];
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }

                }
            }
        }

        System.out.printf("Soma total: %d %n", soma);
        System.out.printf("Soma dos pares: %d %n", somaPares);
        System.out.printf("Soma dos ímpares: %d %n", somaImpares);

    }
}
