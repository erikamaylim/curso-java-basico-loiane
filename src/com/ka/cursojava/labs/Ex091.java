/* Implementar um programa que obtenha a cotação do dólar em relação ao real e, a seguir, armazene em vetor A com 20
elementos as seguintes conversões:
    A[i] = cotação do dólar * i, para todo i variando de 1 até 20.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[20];

        System.out.print("Cotação do dólar: ");
        double cotDolar = sc.nextDouble();

        for (int i = 1; i <= vetorA.length; i++) {
            vetorA[i - 1] = cotDolar * i;
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("%2d -> R$ %,6.2f %n", i + 1, vetorA[i]);

        }

    }
}
