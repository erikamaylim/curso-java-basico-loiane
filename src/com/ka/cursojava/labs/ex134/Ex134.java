/*
Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso tem um professor, que possui nome,
depatamento e e-mail. Cada curso também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome,
matrícula e 4 notas. Escreva um programa teste que crie um Curso com 5 alunos,
e que peça para o usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média de cada aluno,
se o mesmo está aprovado (média maior ou igual a 7), e qual é a média da turma.
*/

package com.ka.cursojava.labs.ex134;


import java.util.Scanner;

public class Ex134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor("Filio Flitwick"
                , "Feitiços", "flitwick@email.com");

        Curso curso = new Curso("Magia e Bruxaria", "11h", professor);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Nome do aluno %d: ", i + 1);
            String nomeAluno = sc.next();
            System.out.printf("Matrícula do aluno %d: ", i + 1);
            String matriculaAluno = sc.next();

            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++) {
                System.out.printf("Nota %d: ", j + 1);
                notas[j] = sc.nextDouble();
            }
            Aluno aluno = new Aluno(nomeAluno, matriculaAluno, notas);
            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}
