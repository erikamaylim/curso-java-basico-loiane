/* Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a
quantidade de alunos para cada turma. As turmas não podem ter mais que 40 alunos.
*/

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdTurmas, numAlunos, somaAlunos = 0;
        boolean validacao;
        double media = 0;

        System.out.println("Descubra a média de alunos por turma.");
        System.out.print("Digite a quantidade de turmas: ");
        qtdTurmas = sc.nextInt();
        for  (int i = 1; i <= qtdTurmas; i++) {
            do  {
                System.out.printf("Quantidade de alunos da turma %d [Máximo de 40 alunos por turma]: ", i);
                numAlunos = sc.nextInt();
                if (numAlunos < 1 || numAlunos > 40) {
                    System.out.println("Número inválido! Tente novamente.");
                    validacao = false;
                } else {
                    validacao = true;
                }

            } while (!validacao);
            somaAlunos += numAlunos;

        }

        media = (double) somaAlunos / qtdTurmas;
        System.out.printf("Total de alunos: %d %n", somaAlunos);
        System.out.printf("Média de alunos por turma: %.1f", media);

    }
}
