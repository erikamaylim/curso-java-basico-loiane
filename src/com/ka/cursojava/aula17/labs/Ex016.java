/* A série de Bibonacci é formada pela sequência 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,... Faça um programa que gere a
série até que o valor seja maior que 500;
 */

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        int termo1 = 0, termo2 = 1, termo3 = 0;

        System.out.println("***   SEQUÊNCIA DE FIBONACCI   ***");

        System.out.printf("%d %d ", termo1, termo2);

        while (termo3 < 500) {
            termo3 = termo1 + termo2;
            System.out.printf("%d ", termo3);
            termo1 = termo2;
            termo2 = termo3;

        }
    }
}
