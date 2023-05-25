/* Escreva uma classe para representar um aluno. Adicione atributos relacionados às características de um aluno como
nome, matrícula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas três
disciplinas. Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma
determinada disciplina
Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e, ao final, informa o nome
das disciplinas, as notas e se o aluno está aprovado ou reprovado
*/

package com.ka.cursojava.labs.ex122;

import java.util.Scanner;

public class Ex122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.nome = sc.next();
        System.out.print("Nome do curso: ");
        aluno.curso = sc.next();
        System.out.print("Matrícula: ");
        aluno.matricula = sc.next();

        for (int i = 0; i < aluno.nomesDisciplinas.length; i++) {
            System.out.printf("Nome da disciplina %d: ", i + 1);
            aluno.nomesDisciplinas[i] = sc.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.printf("Notas da disciplina %s %n", aluno.nomesDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.printf("Nota %d: ", j + 1);
                aluno.notasDisciplinas[i][j] = sc.nextDouble();
            }
        }

        System.out.println();
        aluno.exibirInformacoesAluno();



    }
}
