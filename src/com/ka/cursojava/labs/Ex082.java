/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos
armazenados neste vetor que são pares.
*/

package com.ka.cursojava.labs;

public class Ex082 {
    public static void main(String[] args) {
        int[] vetorA = {35, 32, 29, 17, 11, 18, 7, 22, 19, 48};
        int contPares = 0;
        for (int item : vetorA) {
            if (item % 2 == 0) {
                contPares++;
            }
        }

        System.out.printf("Há %d números pares no vetor A", contPares);
    }

}
