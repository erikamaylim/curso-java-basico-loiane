/* Faça um programa que peça um número inteiro e determine se ele é par ou ímpar. Dica: utilize o operador módulo (%)
 */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para saber se é par ou ímpar: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d é par.", num);
        } else {
            System.out.printf("%d é ímpar.", num);
        }
    }
}
