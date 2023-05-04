/* Gerar aleatoriamente um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os
elementos do vetor A são pares. Se pelo menos um elemento do vetor não for par, o processo de repetição para
percorrer os elementos do vetor deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir
este própósito.
*/

package com.ka.cursojava.labs;

import static com.ka.cursojava.labs.Ex082Outro.gerarVetor;

public class Ex093 {
    public static void main(String[] args) {
        int[] vetorA = gerarVetor(10);

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                System.out.printf("%2d -> PAR %n", vetorA[i]);
            } else {
                System.out.printf("%2d -> ÍMPAR %n", vetorA[i]);
                break;
            }
        }
        System.out.println("Programa encerrado!");


    }
}
