/* Criar um vetor A com 11 elementos, indexados de 0 a 10. Sendo que cada elemento do vetor A é formado pela potência
 de base 2 elevado ao expoente igual à posição do respectivo elemento.
*/

package com.ka.cursojava.labs;

public class Ex106 {
    public static void main(String[] args) {
        int[] vetorA = new int[11];
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.pow(2, i);
            if (i == 0) {
                System.out.printf("{%d, ", vetorA[i]);
            } else if (i == vetorA.length - 1) {
                System.out.printf("%d} %n", vetorA[i]);
            } else {
                System.out.printf("%d, ", vetorA[i]);
            }
        }

    }
}
