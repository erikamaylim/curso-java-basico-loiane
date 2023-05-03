/* Ler um vetor A com 10 elementos inteiros correspondentes às idades de um grupo de pessoas. Escreva um programa que
 determine e escreva a menor e a maior idades e suas respectivas posições;
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[10];

        int menorIdade = 0, maiorIdade = 0, posicaoMenorIdade = 0, posicaoMaiorIdade = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Idade da %dª pessoa: ", i + 1);
            idades[i] = sc.nextInt();

            if (i == 0) {
                menorIdade = idades[0];
                maiorIdade = idades[0];
            }

            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                posicaoMenorIdade = i;
            }

            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaiorIdade = i;
            }

        }

        System.out.print("Elementos do vetor idades: ");
        for (int i = 0; i < idades.length; i++) {

            if (i == idades.length - 1) {
                System.out.printf("%d %n", idades[i]);
            } else {
                System.out.printf("%d, ", idades[i]);
            }
        }

        System.out.printf("Menor idade registrada foi %d anos na posição %d %n", menorIdade, posicaoMenorIdade);
        System.out.printf("Maior idade registrada foi %d anos na posição %d %n", maiorIdade, posicaoMaiorIdade);

    }
}
