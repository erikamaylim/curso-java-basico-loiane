/* Encontrar números primos é uma tarefa difícil. Faça um programa que gere uma lista dos números primos existentes
entre 1 e um número inteiro informado pelo usuário.
*/

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0, seq = 1;

        System.out.print("Digite um número inteiro para listar todos os números primos entre 1 e o número " +
                "informado: ");
        int limite = sc.nextInt();

        while (seq <= limite){
            for (int i = 1; i <= limite; i++ ) {
                if (seq % i == 0) {
                    cont++;
                }

                if (cont == 3) {
                    break;
                }
            }

            if (cont == 2) {
                System.out.printf("%d ", seq);
            }
            cont = 0;
            seq++;
        }


    }
}
