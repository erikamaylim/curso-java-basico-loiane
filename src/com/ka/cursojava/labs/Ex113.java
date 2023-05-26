/* Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo
 da velha usando o computador para ver o tabuleiro. Cada jogador vai, alternadamente, informar a posição onde deseja
 colocar a sua peça ('O' ou 'X'), O programa deve impedir jogadas inválidas e determinar automaticamente quando o
 jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação
  do tabuleiro na tela.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] jogoDaVelha = new String[3][3];

        boolean ganhou = false;
        int jogada = 1, linha = 0, coluna = 0;
        String sinal;

        System.out.println("Jogador 1 -> X");
        System.out.println("Jogador 2 -> O");

        for (int i = 0; i < jogoDaVelha.length; i++) {
            for ( int j = 0; j < jogoDaVelha[i].length; j++) {
                jogoDaVelha[i][j] = ".";
                if (j == 1) {
                    System.out.printf(" %s ", jogoDaVelha[i][j]);

                } else {
                    System.out.printf("| %s |", jogoDaVelha[i][j]);
                }
            }
            System.out.println();

        }


        while (!ganhou) {


            if (jogada % 2 != 0) {
                System.out.println("Vez do jogador 1.");
                sinal = "X";
            } else {
                System.out.println("Vez do jogador 2.");
                sinal = "O";
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.print("Escolha a linha da jogada (1, 2 ou 3): ");
                linha = sc.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Valor inválido!");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.print("Escolha a coluna da jogada (1, 2 ou 3): ");
                coluna = sc.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Valor inválido!");
                }
            }
            linha--;
            coluna--;
            if (!jogoDaVelha[linha][coluna].equals(".")) {
                System.out.println("Jogada não permitida. O campo já foi preenchido. Tente novamente.");
            } else {
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < jogoDaVelha.length; i++) {
                for ( int j = 0; j < jogoDaVelha[i].length; j++) {
                    if (j == 1) {
                        System.out.printf(" %s ", jogoDaVelha[i][j]);

                    } else {
                        System.out.printf("| %s |", jogoDaVelha[i][j]);
                    }
                }
                System.out.println();
            }

            if ((jogoDaVelha[0][0].equals("X") && jogoDaVelha[0][1].equals("X") && jogoDaVelha[0][2].equals("X")) ||
                    (jogoDaVelha[1][0].equals("X") && jogoDaVelha[1][1].equals("X") && jogoDaVelha[1][2].equals("X")) ||
                    (jogoDaVelha[2][0].equals("X") && jogoDaVelha[2][1].equals("X") && jogoDaVelha[2][2].equals("X")) ||
                    (jogoDaVelha[0][0].equals("X") && jogoDaVelha[1][0].equals("X") && jogoDaVelha[2][0].equals("X")) ||
                    (jogoDaVelha[0][1].equals("X") && jogoDaVelha[1][1].equals("X") && jogoDaVelha[2][1].equals("X")) ||
                    (jogoDaVelha[0][2].equals("X") && jogoDaVelha[1][2].equals("X") && jogoDaVelha[2][2].equals("X")) ||
                    (jogoDaVelha[0][0].equals("X") && jogoDaVelha[1][1].equals("X") && jogoDaVelha[2][2].equals("X")) ||
                    (jogoDaVelha[0][2].equals("X") && jogoDaVelha[1][1].equals("X") && jogoDaVelha[2][0].equals("X"))) {
                System.out.println("Jogador 1 venceu!");
                ganhou = true;

            } else if ((jogoDaVelha[0][0].equals("O") && jogoDaVelha[0][1].equals("O") && jogoDaVelha[0][2].equals("O")) ||
                    (jogoDaVelha[1][0].equals("O") && jogoDaVelha[1][1].equals("O") && jogoDaVelha[1][2].equals("O")) ||
                    (jogoDaVelha[2][0].equals("O") && jogoDaVelha[2][1].equals("O") && jogoDaVelha[2][2].equals("O")) ||
                    (jogoDaVelha[0][0].equals("O") && jogoDaVelha[1][0].equals("O") && jogoDaVelha[2][0].equals("O")) ||
                    (jogoDaVelha[0][1].equals("O") && jogoDaVelha[1][1].equals("O") && jogoDaVelha[2][1].equals("O")) ||
                    (jogoDaVelha[0][2].equals("O") && jogoDaVelha[1][2].equals("O") && jogoDaVelha[2][2].equals("O")) ||
                    (jogoDaVelha[0][0].equals("O") && jogoDaVelha[1][1].equals("O") && jogoDaVelha[2][2].equals("O")) ||
                    (jogoDaVelha[0][2].equals("O") && jogoDaVelha[1][1].equals("O") && jogoDaVelha[2][0].equals("O"))){
                System.out.println("Jogador 2 venceu!");
                ganhou = true;
            } else if (jogada > 9) {
                System.out.println("Ninguém ganhou.");
                ganhou = true;
            }
        }


    }


}
