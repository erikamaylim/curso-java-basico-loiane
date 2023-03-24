package com.ka.cursojava.aula12;

import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Você digitou: " + nome);

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Você digitou: " + primeiroNome);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);

    }
}
