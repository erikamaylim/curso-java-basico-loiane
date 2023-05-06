/* Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do
vetor A.
*/

package com.ka.cursojava.labs;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];

        for(int i = 0; i < vetorA.length; i++) {
            System.out.printf("%dº valor do vetor A: ", i + 1);
            vetorA[i] = sc.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++) {
            System.out.printf("%n Tabuada do %d: %n", vetorA[i]);
            for (int j = 1; j <= 10; j++){
                System.out.printf("%2d x %2d = %3d %n", vetorA[i], j, vetorA[i] * j);
            }

        }

    }
}
