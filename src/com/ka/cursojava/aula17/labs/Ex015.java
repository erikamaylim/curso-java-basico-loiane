/* A série de Fibonacci é formada pela sequência 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,... Faça um programa capaz de gerar
*  a série até o n-ésimo termo. */

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int termo1 = 0, termo2 = 1, termo3;

        System.out.println("***   SEQUÊNCIA DE FIBONACCI   ***");
        System.out.print("Digite quantos termos deseja mostrar: ");
        int ultimo = sc.nextInt();

        System.out.printf("%d, %d, ", termo1, termo2);

        for (int i = 3; i <= ultimo; i++) {
            termo3 = termo1 + termo2;
            if (i == ultimo) {
                System.out.printf("%d", termo3);
            } else {
                System.out.printf("%d, ", termo3);
                termo1 = termo2;
                termo2 = termo3;
            }
        }
    }
}
