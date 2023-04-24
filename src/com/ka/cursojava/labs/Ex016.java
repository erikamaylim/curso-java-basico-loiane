// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro qualquer: ");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.printf("O número %d é positivo. %n", num);
        } else if (num < 0){
            System.out.printf("O número %d é negativo. %n0", num);
        } else {
            System.out.println("0 é um número neutro");
        }


    }
}
