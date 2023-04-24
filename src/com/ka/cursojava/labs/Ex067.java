/* Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a
tabuada não deve necessariamente iniciar pelo 1 e terminar em 10. O valor inicial e final devem ser informados pelo
usuário, conforme exemplo abaixo:
    Montar a tabuada de: 5
    Começar por: 4
    Terminar em: 7
Você deve verificar se o número final é maior ou igual ao inicial
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabuada, comeco, fim;

        System.out.print("Montar a tabuada de: ");
        tabuada = sc.nextInt();

        System.out.print("Começando em: ");
        comeco = sc.nextInt();

        fim = comeco - 1;

        while (fim < comeco) {
            System.out.print("Terminando em (deve ser maior ou igual ao valor informado anteriormente): ");
            fim = sc.nextInt();
        }

        System.out.printf("Tabuada do %d, começando em %d e terminando em %d: %n", tabuada, comeco, fim);

        for (int i = comeco; i <= fim; i++) {
            System.out.printf("%d X %2d = %3d %n", tabuada, i, tabuada * i);
        }


    }
}
