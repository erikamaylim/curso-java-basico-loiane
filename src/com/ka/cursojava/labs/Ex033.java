/* Faça um programa que leia 2 números e, em seguida, pergunte ao usuário qual operação ele deseja realizar. O
resultado da operação deve ser acompanhado de uma frase que dga se o númerp é:
 - par ou ímpar;
 - positivo ou negativo.
 */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite qual operação deseja realizar [A (Adição) | S (Subtração) | M (Multiplicação) | D " +
                "(Divisão)]: ");
        String operacao = sc.next().toLowerCase();

        double resultado = 0;

        switch (operacao) {
            case "a" -> resultado = n1 + n2;
            case "s" -> resultado = n1 - n2;
            case "m" -> resultado = n1 * n2;
            case "d" -> resultado = n1 / n2;
            default -> {
                System.out.println("Opção inválida!");
                System.exit(0);
            }

        }

        if (resultado % 2 == 0) {
            System.out.printf("%.1f é par ", resultado);
        } else {
            System.out.printf("%.1f é ímpar ", resultado );
        }

        if (resultado > 0) {
            System.out.println("e positivo.");
        } else {
            System.out.println("e negativo.");
        }

    }
}
