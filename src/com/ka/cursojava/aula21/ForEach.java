package com.ka.cursojava.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        double[] notas = new double[10];

        Random random = new Random();

        for (double nota : notas) {
            nota = random.nextDouble(10);
            System.out.printf("%4.1f %n", nota);
        }
        System.out.println();

        double[][] notasAlunos = {
                {10, 7, 8, 9.5},
                {9, 8, 7, 9},
                {8, 9, 10, 7}
        };

        for (double[] notasAluno : notasAlunos) {
            for (double nt : notasAluno) {
                System.out.printf("%4.1f \t", nt);

            }
            System.out.println();
        }

    }
}
