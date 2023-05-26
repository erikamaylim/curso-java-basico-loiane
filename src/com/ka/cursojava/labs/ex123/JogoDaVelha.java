package com.ka.cursojava.labs.ex123;

import java.util.Scanner;

public class JogoDaVelha {
    String[][] jogoDaVelha = new String[3][3];

    int jogada = 1;



    boolean validarJogada(int linha, int coluna, String sinal) {
        if (!jogoDaVelha[linha][coluna].equals(".")) {
            return false;
        } else {
            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    void imprimirTabuleiroVazio() {
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
        System.out.println();
    }

    void imprimirTabuleiro() {
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
        System.out.println();
    }

    boolean verificarGanhador(String sinal) {
        if ((jogoDaVelha[0][0].equals(sinal) && jogoDaVelha[0][1].equals(sinal) && jogoDaVelha[0][2].equals(sinal)) ||
                (jogoDaVelha[1][0].equals(sinal) && jogoDaVelha[1][1].equals(sinal) && jogoDaVelha[1][2].equals(sinal)) ||
                (jogoDaVelha[2][0].equals(sinal) && jogoDaVelha[2][1].equals(sinal) && jogoDaVelha[2][2].equals(sinal)) ||
                (jogoDaVelha[0][0].equals(sinal) && jogoDaVelha[1][0].equals(sinal) && jogoDaVelha[2][0].equals(sinal)) ||
                (jogoDaVelha[0][1].equals(sinal) && jogoDaVelha[1][1].equals(sinal) && jogoDaVelha[2][1].equals(sinal)) ||
                (jogoDaVelha[0][2].equals(sinal) && jogoDaVelha[1][2].equals(sinal) && jogoDaVelha[2][2].equals(sinal)) ||
                (jogoDaVelha[0][0].equals(sinal) && jogoDaVelha[1][1].equals(sinal) && jogoDaVelha[2][2].equals(sinal)) ||
                (jogoDaVelha[0][2].equals(sinal) && jogoDaVelha[1][1].equals(sinal) && jogoDaVelha[2][0].equals(sinal))) {
            return true;
        }
        return false;
    }

    boolean vezJogador1() {
        if (jogada % 2 != 0) {
            return true;
        }
        return false;
    }



}
