// Faça um programa que pergunte em que turno você estuda. Peça para digitar M - matutino, V- vespertino ou N -
// noturno. Imprima a mensagem "Bom dia", "Boa tarde", "Boa noite" ou "Valor inválido, conforme o caso

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Você é estudante de turno matutino [M], vespertino [V] ou noturno [N]? Digite a opção " +
                "desejada: " +
                " ");
        String turno = scan.next().toUpperCase();

        switch (turno) {
            case "M" -> System.out.println("Bom dia!");
            case "V" -> System.out.println("Boa tarde!");
            case "N" -> System.out.println("Boa noite!");
            default -> System.out.println("Valor inválido!");
        }


    }
}
