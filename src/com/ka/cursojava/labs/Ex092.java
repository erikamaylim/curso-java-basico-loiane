/* Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1. Sugestão:
    A[i] = (int) Math.round(Math.random() * 1)
Pede-se para implementar um programa que determine o percentual de números 0 e de 1 existentes no vetor A.
*/
package com.ka.cursojava.labs;

public class Ex092 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int qtdZero = 0, qtdUm = 0;
        double pctZero = 0, pctUm = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random());
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 0) {
                qtdZero++;
            } else {
                qtdUm++;
            }
            if (i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);

            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

        pctZero = (double) (qtdZero * 100) / vetorA.length;
        pctUm = (double) (qtdUm * 100) / vetorA.length;
        System.out.printf("Percentual de 0's: %.1f%% %n", pctZero);
        System.out.printf("Percentual de 1's: %.1f%% %n", pctUm);
    }
}


