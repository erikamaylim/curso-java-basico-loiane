/* Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá
pedir os valores de a, b e c e fazer as consistências, informando ao usuário as seguintes situações:
 - Se o usuário informar valor A igual a zero, a equação não é do segundo grau e o programa deve ser encerrado sem
 pedir os outros valores
 - Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa
 - Se o delta calculado for igual a zero, a equação possui apenas uma raiz real. Informe-a ao usuário
 - Se o delta for positivo, a equação possui duas raízes reais. Informe-as ao usuário */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EQUAÇÃO DO SEGUNDO GRAU!");
        System.out.print("Digite o valor de a: ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Se o valor de a é zero, então não é uma equação do segundo grau");
            System.exit(0);
        }

        System.out.print("Digite o valor de b: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor de c: ");
        int c = sc.nextInt();

        double delta = (double) (Math.pow(b, 2) - 4 * a * c);

        double x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
        double x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));

        if (delta < 0) {
            System.out.println("Delta menor que zero. A equação não possui raízes reais.");
            System.exit(0);
        } else if (delta == 0) {
            System.out.printf("Delta igual a zero. A equação possui apenas uma raiz real: %.1f %n", x1);
        } else {
            System.out.printf("Delta maior que zero. A equação possui duas raízes reais: %.1f e %.1f %n", x1, x2);
        }

    }
}
