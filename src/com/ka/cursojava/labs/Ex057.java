/* Faça um programa que peça para n pessoas a sua idade. Ao final, o programa deverá verificar se a média de idade da
 turma varia entre 0 e 25, 26 e 60 e maior que 60 e, então, dizer se a turma é jovem, adulta ou idosa, conforme a
 média calculada.

 */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0, somaIdade = 0;
        double media = 0;

        System.out.println("Calcule a média da idade entre pessoas de um grupo e descubra se este grupo é jovem, " +
                "adulto ou idoso.");
        System.out.print("Quantas pessoas há no grupo? ");
        int qtdPessoas = sc.nextInt();

        for (int i = 1; i <= qtdPessoas; i++) {
            System.out.printf("Idade da pessoa %d: ", i);
            idade = sc.nextInt();
            somaIdade += idade;
        }

        media = (double) somaIdade / qtdPessoas;
        System.out.printf("Média: %.1f %n", media);
        if (media >= 0 && media <= 25) {
            System.out.println("Grupo jovem");
        } else if (media >=26 && media <= 60) {
            System.out.println("Grupo adulto");
        } else if (media > 60) {
            System.out.println("Grupo idoso");
        }




    }
}
