// Faça um programa quepeça dois números e imprima o maior deles

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.printf("O primeiro número digitado, %d, é maior que o segundo, %d", n1, n2);
        } else if (n2 > n1){
            System.out.printf("O segundo número digitado, %d, é maior que o primeiro, %d", n2, n1);
        } else {
            System.out.println("Você digitou dois números iguais");
        }


    }
}
