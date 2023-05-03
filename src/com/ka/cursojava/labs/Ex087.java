/* Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule  e escreva:
    A soma de elementos armazenados neste vetor que são inferiores a 15
    A quantidade de elementos armazenados no vetor que são iguais a 15
    A média dos elementos armazenados no vetor que são superiores a 15.
*/

package com.ka.cursojava.labs;

import static com.ka.cursojava.labs.Ex082Outro.gerarVetor;

public class Ex087 {
    public static void main(String[] args) {
        int[] vetorA = gerarVetor(10);

        int somaMenor15 = 0, qtdIgual15 = 0, somaMaior15 = 0, qtdMaior15 = 0;
        double mediaMaior15 = 0;

        System.out.print("Elementos do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else if (vetorA[i] == 15) {
                qtdIgual15++;
            } else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
            if (i == vetorA.length - 1) {
                System.out.printf("%d %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

        mediaMaior15 = (double) somaMaior15 / qtdMaior15;

        System.out.printf("Soma dos elementos inferiores a 15: %d %n", somaMenor15);
        System.out.printf("Quantidade de elementos iguais a 15: %d %n", qtdIgual15);
        System.out.printf("Média dos elementos superiores a 15: %.1f %n", mediaMaior15);

    }
}
