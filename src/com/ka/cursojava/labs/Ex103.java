/* Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma
mensagem indicando se o respectivo elemento é um número primo ou não.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];

        int cont = 0;

        for(int i = 0; i < vetorA.length; i++) {
            System.out.printf("%dº valor do vetor A: ", i + 1);
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            for (int j =1; j <= vetorA[i]; j++){
                if (vetorA[i] % j == 0) {
                    cont++;
                    if (cont > 2) {
                        break;
                    }
                }
            }
            if (cont == 2) {
                System.out.printf("%2d - é primo %n", vetorA[i]);
            } else {
                System.out.printf("%2d - não é primo %n", vetorA[i]);
            }
            cont = 0;
        }


    }
}
