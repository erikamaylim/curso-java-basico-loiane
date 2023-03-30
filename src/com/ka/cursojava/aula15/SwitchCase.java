package com.ka.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia da semana (1-7): ");
        int diaSemana = scan.nextInt();

//        switch (diaSemana) {
//            case 1 -> System.out.println("Domingo");
//            case 2 -> System.out.println("Segunda");
//            case 3 -> System.out.println("Terça");
//            case 4 -> System.out.println("Quarta");
//            case 5 -> System.out.println("Quinta");
//            case 6 -> System.out.println("Sexta");
//            case 7 -> System.out.println("Sábado");
//            default -> System.out.println("Número digitado não é válido");
//        }

        switch (diaSemana) {
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            case 1, 7 -> System.out.println("Final de semana");
            default -> System.out.println("Número digitado não é válido");
        }
    }
}

