/* Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas da avenida mais
movimentada da cidade onde você mora.
A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome de cada filho. Guarde essas informações
em uma matriz de forma que cada pessoa entrevistada ocupe somente o espaço necessário na memória para guardar os
nomes dos filhos.
Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada entrevistado e os respectivos nomes dos
 filhos.
*/

package com.ka.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de pessoas a serem entrevistadas: ");
        int numEntrevistados = sc.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for ( int i = 0; i < nomesFilhos.length; i++) {
            System.out.printf("Digite a quantidade de filhos do entrevistado %d: ", i + 1);
            int qtdFilhos = sc.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for ( int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.printf("Digite o nome do %dº filho: ", j + 1);
                nomesFilhos[i][j] = sc.next();
            }
        }

        for ( int i = 0; i < nomesFilhos.length; i++) {
            System.out.printf("Entrevistado %d tem %d filhos: %n", i + 1, nomesFilhos[i].length);
            for ( int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.printf("%s ", nomesFilhos[i][j]);
                if (j == nomesFilhos[i].length - 1) {
                    System.out.println();
                }
            }
        }


    }
}
