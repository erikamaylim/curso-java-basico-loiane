/* Criar um vetor A com 10 elementos. Desenvolver um programa que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
*/

package com.ka.cursojava.labs;

import static com.ka.cursojava.labs.Ex082Outro.gerarVetor;

public class Ex086 {
    public static void main(String[] args) {
        int[] vetorA = gerarVetor(10);

        int pares = 0, impares = 0;
        double pctPares = 0, pctImpares = 0;


        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

        pctPares = ((double) pares * 100) / vetorA.length;
        pctImpares = ((double) impares * 100) / vetorA.length;

        System.out.printf("Percentual de pares: %.1f%% %n", pctPares);
        System.out.printf("Percentual de ímpares: %.1f%% %n", pctImpares);

    }
}
