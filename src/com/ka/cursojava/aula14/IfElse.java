package com.ka.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Digite a idade: ");
//        int idade = scan.nextInt();
//
//        if (idade >= 18) {
//            System.out.println("Maior de idade");
//        } else {
//            System.out.println("Não é maior de idade");
//        }

        System.out.print("Digite o valor do produto: ");
        double valor = scan.nextDouble();
        if (valor <= 10) {
            System.out.println("Barato. Pode comprar.");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pedir desconto.");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pesquisar mais.");
        } else {
            System.out.println("Muito caro.");
        }

    }
}
