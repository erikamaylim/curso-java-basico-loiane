/* Números palíndromos são aqueles que, escritos da direita para a esquerda, têm o mesmo valor quando escritos da
esquerda para a direita. Ex: 545, 789987.
Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é palíndromo, ou seja, se o primeiro
elemento do vetor é igual ao último, o segundo é igual ao penúltimo, e assim por diante, até verificar todos os
elementos ou chegar à conclusão que o vetor não é um palíndromo.
*/

package com.ka.cursojava.labs;

public class Ex094 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
//        int[] vetorA = {0, 0, 0, 1, 0, 0, 1, 0, 0, 1};
        boolean palindromo = true;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%d ", vetorA[i]);
        }
        for (int i = 0; i < (vetorA.length / 2); i++) {
            if (vetorA[vetorA.length - 1 - i] == vetorA[i]) {
                palindromo = true;
            } else {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("\nÉ PALÍNDROMO");
        } else {
            System.out.println("\nNÃO É PALÍNDROMO");
        }
    }
}
