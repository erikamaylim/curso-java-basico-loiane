/*
Escreva uma classe para representar um aluno. Adicione atributos relacionados às características de um aluno, como
nome, matrícula, curso, nome de 3 disciplinas e as notas destas 3 disciplinas.
Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e, ao final, informa o nome
das disciplinas, mostra as notas e se o aluno foi aprovado.
OBS:
    - Atributos devem ser private;
    - Criar métodos getters, setters e construtores;
    - Métodos que serão utilizados devem ser públicos;
    - Se necessário, crie métodos privados como auxiliares
*/

package com.ka.cursojava.labs.ex126;

import java.util.Scanner;

public class Ex126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.print("Nome do aluno: ");
        a1.setNome(sc.next());
        System.out.print("Nome do curso: ");
        a1.setCurso(sc.next());
        System.out.print("Matrícula: ");
        a1.setMatricula(sc.next());

        for (int i = 0; i < a1.getNomesDisciplinas().length; i++) {
            System.out.printf("Nome da disciplina %d: ", i + 1);
            a1.setNomeDisciplinaPosicao(i, sc.next());
        }

        for (int i = 0; i < a1.getNotasDisciplinas().length; i++) {
            System.out.printf("Notas da disciplina %s %n", a1.getNomesDisciplinas()[i]);
            for (int j = 0; j < a1.getNotasDisciplinas()[i].length; j++) {
                System.out.printf("Nota %d: ", j + 1);
                a1.setNotasDisciplinasPosicaoIJ(i, j, sc.nextDouble());
            }
        }

        System.out.println();

        a1.exibirInformacoesAluno();
    }
}
