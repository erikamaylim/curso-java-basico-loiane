//Faça um programa que peça dois números e imprima a soma.

package com.ka.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Para realizar a soma, digite um número: ");
        int x1 = scan.nextInt();
        System.out.print("Digite mais um número: ");
        int x2 = scan.nextInt();
        System.out.println("A soma dos números digitados é " + (x1 + x2));

    }
}
