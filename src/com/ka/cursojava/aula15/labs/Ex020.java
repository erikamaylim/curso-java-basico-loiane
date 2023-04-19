/* Crie um programa que faça 5 perguntas sobre um crime. As perguntas são:
- "Telefonou para a vítima?"
- "Esteve no local do crime?"
- "Mora perto da vítima?"
- "Devia para a vítima?"
- "Já trabalhou com a vítima?"
O programa deve emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente
 a 2 questões, ela deve ser classificada como "suspeita". Entre 3 e 4, como "cúmplice" e 5 como "assassino".Caso
 contrário, será "inocente"
*/

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sim = 0;
        int nao = 0;
        System.out.println("Responda as perguntas abaixo com [S] para sim e [N] para não: ");

        System.out.print("Você telefonou para a vítima? ");
        String resposta1 = sc.next(). toLowerCase();
        if (resposta1.equals("s")) {
            sim++;
        } else if (resposta1.equals("n")){
            nao++;
        } else {
            System.out.println("Resposta inválida!");
            System.exit(0);
        }

        System.out.print("Esteve no local do crime? ");
        String resposta2 = sc.next(). toLowerCase();
        if (resposta2.equals("s")) {
            sim++;
        } else if (resposta2.equals("n")){
            nao++;
        } else {
            System.out.println("Resposta inválida!");
            System.exit(0);
        }

        System.out.print("Mora perto da vítima? ");
        String resposta3 = sc.next(). toLowerCase();
        if (resposta3.equals("s")) {
            sim++;
        } else if (resposta3.equals("n")){
            nao++;
        } else {
            System.out.println("Resposta inválida!");
            System.exit(0);
        }

        System.out.print("Devia para a vítima? ");
        String resposta4 = sc.next(). toLowerCase();
        if (resposta4.equals("s")) {
            sim++;
        } else if (resposta4.equals("n")){
            nao++;
        } else {
            System.out.println("Resposta inválida!");
            System.exit(0);
        }

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = sc.next(). toLowerCase();
        if (resposta5.equals("s")) {
            sim++;
        } else if (resposta5.equals("n")){
            nao++;
        } else {
            System.out.println("Resposta inválida!");
            System.exit(0);
        }

        switch (sim) {
            case 2 -> System.out.println("Suspeito");
            case 3, 4 -> System.out.println("Cúmplice");
            case 5 -> System.out.println("Assassino");
            default -> System.out.println("Inocente");
        }
    }
}
