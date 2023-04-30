/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos
armazenados neste vetor.
*/

package com.ka.cursojava.labs;

import static com.ka.cursojava.labs.Ex082Outro.gerarVetor;

public class Ex083 {
    public static void main(String[] args) {

        int[] vetorA = gerarVetor(10);
        int soma = 0;

        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];

            if(i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

        System.out.printf("Soma dos elementos do vetor A: %d %n", soma);
    }
}
