/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética
simples dos elementos ímpares armazenados neste vetor.
*/

package com.ka.cursojava.labs;

import static com.ka.cursojava.labs.Ex082Outro.gerarVetor;

public class Ex085 {
    public static void main(String[] args) {
        int[] vetorA = gerarVetor(10);

        int somaImpares = 0;
        int contImpares = 0;
        double media = 0;

        System.out.print("Elementos do vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                somaImpares += vetorA[i];
                contImpares++;
            }

            if (i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }
        media = (double) somaImpares / contImpares;
        System.out.printf("Soma dos números ímpares do vetor A: %d %n", somaImpares);
        System.out.printf("Quantidade de números ímpares do vetor A: %d %n", contImpares);
        System.out.printf("Média entre números ímpares do vetor A: %.1f %n", media);

    }
}
