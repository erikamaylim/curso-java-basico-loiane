// Faça um programa que verifique se uma letra digitada é vogal ou consoante

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = scan.next().toLowerCase();

        if (letra.length() == 1) {
            if (letra.matches("[a-z]*")) {
                switch (letra) {
                    case "a", "e", "i", "o", "u" -> System.out.println("A letra digitada é uma vogal");
                    default -> System.out.println("A letra digitada é uma consoante");
                }


            } else {
                System.out.println("Erro! Você não digitou uma letra.");
            }
        } else {
            System.out.println("Erro! É para inserir apenas uma letra.");
        }
    }
}

//            if (letra.matches("[a-z]*")) {
//            switch (letra) {
//            case "a", "e", "i", "o", "u" -> System.out.println("A letra digitada é uma vogal");
//default -> System.out.println("A letra digitada é uma consoante");
//        }