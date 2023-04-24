// Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra, escrever:
// F - feminino,
// M - Masculino,
// Outra - sexo inválido.

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o sexo [M/F]: ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }



    }
}
