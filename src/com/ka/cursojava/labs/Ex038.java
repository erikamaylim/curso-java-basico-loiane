/* Faça um programa que peça uma nota entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
a pedir até que o usuário informe um valor válido.
  */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valida = false;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            double nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                valida = true;
                System.out.printf("Você digitou %.1f %n", nota);
            } else {
                System.out.println("Nota inválida!");
            }
        } while (!valida);


    }
}
