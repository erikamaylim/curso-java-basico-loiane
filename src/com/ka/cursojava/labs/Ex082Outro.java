/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos
armazenados neste vetor que são pares.
*/

package com.ka.cursojava.labs;

import java.util.Random;

public class Ex082Outro {
    public static void main(String[] args) {
        int[] vetorA = gerarVetor(10);

        int contPares = 0;

        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                contPares++;
            }
            if (i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);
            } else {
                System.out.printf("%d, ",vetorA[i]);

            }
        }

        System.out.printf("Há %d números pares no vetor A", contPares);

    }

    public static int[] gerarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        Random gerador = new Random();
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(50);
        }
        return vetor;
    }
}
