/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos armazenados
 neste vetor que sejam múltiplos de 5.
*/

package com.ka.cursojava.labs;

import static com.ka.cursojava.labs.Ex082Outro.gerarVetor;

public class Ex084 {
    public static void main(String[] args) {
        int[] vetorA = gerarVetor(10);

        int somaMult5 = 0;

        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                somaMult5 += vetorA[i];
            }

            if (i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

        System.out.printf("Soma dos elementos do vetor A que são múltiplos de 5: %d %n", somaMult5);

    }
}
