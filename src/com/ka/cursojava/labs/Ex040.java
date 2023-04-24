/* Faça um programa que leia e valide as seguintes informações:
- Nome: maior que 3 caracteres
 - Idade: entre 0 e 150
 - Salário: maior que zero
 - Sexo: f ou m
 - Estado Civil: s, c, v ou d
 */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade = 0;
        double salario = 0;
        boolean validacao = false;

        do {
            System.out.print("Nome: ");
            nome = sc.next();

            if (nome.length() <= 3) {
                System.out.println("Erro! Nome precisa ter mais de 3 caracteres.");
            } else {
                validacao = true;
            }

        } while (!validacao);

        do {
            validacao = false;
            System.out.print("Idade: ");
            idade = sc.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Erro! Valor inválido.");
            } else {
                validacao = true;
            }
        } while (!validacao);

        do {
            validacao = false;
            System.out.print("Salário: R$ ");
            salario = sc.nextDouble();

            if (salario <= 0) {
                System.out.println("Erro! Salário deve ser maior que R$ 0,00.");
            } else {
                validacao = true;
            }
        } while (!validacao);

        do {
            validacao = false;
            System.out.print("Sexo [M/F]: ");
            sexo = sc.next().toUpperCase();

            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Erro! Valor inválido!");
            } else {
                validacao = true;
                if (sexo.equals("M")){
                    sexo = "Masculino";
                } else{
                    sexo = "Feminino";
                }
            }
        } while (!validacao);

        do {
            validacao = false;
            System.out.print("Estado Civil [S] Solteiro(a) | [C] Casado(a) | [V] Viúvo(a) | [D] Divorciado(a): ");
            estadoCivil = sc.next(). toUpperCase();

            if (!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("V") && !estadoCivil.equals("D")) {
                System.out.println("Erro! Valor inválido!");
            } else {
                validacao = true;
                if (estadoCivil.equals("S")) {
                    estadoCivil = "Solteiro(a)";
                } else if (estadoCivil.equals("C")) {
                    estadoCivil = "Casado(a)";
                } else if (estadoCivil.equals("V")) {
                    estadoCivil = "Viúvo(s)";
                } else {
                    estadoCivil = "Divorciado(a)";
                }
            }
        } while (!validacao);

        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Idade: %d anos %n", idade);
        System.out.printf("Salário: R$ %.2f %n", salario);
        System.out.printf("Sexo: %s %n", sexo);
        System.out.printf("Estado Civil: %s %n", estadoCivil);




    }
}
