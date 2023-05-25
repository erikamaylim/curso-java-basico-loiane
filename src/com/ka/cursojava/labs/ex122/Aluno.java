package com.ka.cursojava.labs.ex122;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] nomesDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];


    void exibirInformacoesAluno() {
        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Matrícula: %s %n", matricula);
        System.out.printf("Curso: %s %n", curso);
        for (int i = 0; i < notasDisciplinas.length; i++) {
            double soma = 0;
            System.out.printf("Notas da disciplina %s: %n", nomesDisciplinas[i]);
            for ( int j = 0; j < notasDisciplinas[i].length; j++) {
                soma += notasDisciplinas[i][j];
                System.out.printf("\tNota %d: %.1f %n", j + 1, notasDisciplinas[i][j]);
            }
            double media = soma / 4;
            System.out.printf("Média da disciplina %s: %.1f", nomesDisciplinas[i], media);
            if (media >= 7) {
                System.out.println("\t APROVADO");;
            } else {
                System.out.println("\tREPROVADO");
            }
            System.out.println();

        }

    }



}
