/* Ler duas notas bimestrais para um conjunto de 5 alunos. Armazenar as notas informadas em dois vetores "nota1" e
"nota2" do tipo real. Escrever um programa que calcule a média aritmética simples das notas informadas e armazenando
o resultado em um vetor "result" de mesmo tipo e tamanho. Ao mostrar os resultados, exibir a situação de cada aluno.
Se a média calculada for igual ou superior a 7, o aluno estará aprovado. Cado contrário, será reprovado.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas1 = new double[5];
        double[] notas2 = new double[notas1.length];
        double[] results = new double[notas1.length];

        for(int i = 0; i < notas1.length; i++) {
            System.out.printf("Nota 1 do aluno %d: ", i + 1);
            notas1[i] = sc.nextDouble();
            System.out.printf("Nota 2 do aluno %d: ", i + 1);
            notas2[i] = sc.nextDouble();
            results[i] = (notas1[i] + notas2[i]) / 2;
        }

        for (int i = 0; i < results.length; i++) {
            System.out.printf("Média do aluno %d: %.1f", i + 1, results[i]);
            if (results[i] >= 7) {
                System.out.println(" -> APROVADO");
            } else {
                System.out.println(" -> REPROVADO");
            }
        }
    }
}
