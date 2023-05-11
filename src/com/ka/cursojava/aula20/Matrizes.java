package com.ka.cursojava.aula20;

public class Matrizes {
    public static void main(String[] args) {
//        double[][] notasAlunos = new double[3][4];
//        notasAlunos[0][0] = 10;
//        notasAlunos[0][1] = 7;
//        notasAlunos[0][2] = 8;
//        notasAlunos[0][3] = 9.5;
//
//        notasAlunos[1][0] = 9;
//        notasAlunos[1][1] = 8;
//        notasAlunos[1][2] = 7;
//        notasAlunos[1][3] = 9;
//
//        notasAlunos[2][0] = 8;
//        notasAlunos[2][1] = 9;
//        notasAlunos[2][2] = 10;
//        notasAlunos[2][3] = 7;

        // Outra forma de declarar:
         double[][] notasAlunos = {
                 {10, 7, 8, 9.5},
                 {9, 8, 7, 9},
                 {8, 9, 10, 7}
         };

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.printf("Notas do Aluno %d: %n", i + 1);
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.printf("%4.1f | ", notasAlunos[i][j]);
                if (j == notasAlunos[i].length - 1){
                    System.out.println();
                }
            }
        }
        System.out.println();
        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            System.out.printf("Média do Aluno %d: ", i + 1);
            for ( int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.printf("%4.1f %n", soma / notasAlunos[i].length);
        }


    }
}
