package com.ka.cursojava.labs.ex127;

public class JogoDaVelha {
    private String[][] jogoDaVelha;
    private int jogada;

    public JogoDaVelha() {
        this.setJogoDaVelha(new String[3][3]);
        this.setJogada(1);
    }

    public String[][] getJogoDaVelha() {
        return jogoDaVelha;
    }

    public void setJogoDaVelha(String[][] jogoDaVelha) {
        this.jogoDaVelha = jogoDaVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarJogada(int linha, int coluna, String sinal) {
        if (!jogoDaVelha[linha][coluna].equals(" ")) {
            return false;
        } else {
            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    public void imprimirTabuleiroVazio() {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for ( int j = 0; j < jogoDaVelha[i].length; j++) {
                jogoDaVelha[i][j] = " ";
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

    public void imprimirTabuleiro() {
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

    public boolean verificarGanhador(String sinal) {
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

    public boolean vezJogador1() {
        if (jogada % 2 != 0) {
            return true;
        }
        return false;
    }

}
