/* Ler um vetor A com 10 elementos e construir um vetor B de mesmo tamanho e com os mesmos elementos de A, sendo que
estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo de A passa a
ser o penúltimo de B, e assim por diante.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex098 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

//        for (int i = 0; i < vetorA.length; i++) {
//            vetorA[i] = (int) Math.round(Math.random() * 9);
//            vetorB[vetorB.length - 1 - i] = vetorA[i];
//        }

        for(int i = 0; i < vetorA.length; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            vetorA[i] = sc.nextInt();
            vetorB[vetorB.length - 1 - i] = vetorA[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }

        System.out.print("\nVetor B: ");
        for(int i = 0; i < vetorB.length; i++) {
            System.out.printf("%d ", vetorB[i]);
        }

    }

}
