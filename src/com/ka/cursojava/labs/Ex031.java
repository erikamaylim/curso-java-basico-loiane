/* Faça um programa que peça um número correspondente a um determinado ano e, em seguida, informe se este ano é
bissexto ou não. */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano e descubra se é ano bissexto: ");
        int ano = sc.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.printf("%d é um ano bissexto. %n ", ano);
        } else {
            System.out.printf("%d não é um ano bissexto. %n", ano);
        }
    }
}
