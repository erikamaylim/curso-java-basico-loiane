/* Reescreva o exercício 113 (jogo da velha). Desenvolva uma classe para representar o jogo da velha. Desenvolva uma
classe para testar o jogo.
*/

package com.ka.cursojava.labs.ex123;

import java.util.Scanner;

public class Ex123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 -> X");
        System.out.println("Jogador 2 -> O");

        boolean ganhou = false;
        int linha = 0, coluna = 0;
        String sinal;

        jogoDaVelha.imprimirTabuleiroVazio();

        while (!ganhou) {
            if (jogoDaVelha.vezJogador1()) {
                System.out.println("Vez do jogador 1.");
                sinal = "X";
            } else {
                System.out.println("Vez do jogador 2.");
                sinal = "O";
            }

            linha = valor("linha", sc);
            coluna = valor("coluna", sc);

            jogoDaVelha.validarJogada(linha, coluna, sinal);

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador("X")) {
                System.out.println("Jogador 1 venceu!");
                ganhou = true;
            } else if (jogoDaVelha.verificarGanhador("O")){
                System.out.println("Jogador 2 venceu!");
                ganhou = true;
            } else if (jogoDaVelha.jogada > 9) {
                System.out.println("Ninguém ganhou.");
                ganhou = true;
            }

        }
    }

    static int valor(String tipoValor, Scanner sc) {
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.printf("Escolha a %s da jogada (1, 2 ou 3): ", tipoValor);
            valor = sc.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Valor inválido!");
            }
        }
        valor--;
        return valor;
    }

}


