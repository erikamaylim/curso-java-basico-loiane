// Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número].

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi " + numero);

    }
}
