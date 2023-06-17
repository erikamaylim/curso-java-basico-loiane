/* Reescreva o exercício 113/123 (jogo da velha). Desenvolva uma classe para representar o jogo da velha. Desenvolva uma
classe para testar o jogo.
OBS:
    - Atributos devem ser private;
    - Criar métodos getters, setters e construtores;
    - Métodos que serão utilizados devem ser públicos;
    - Se necessário, crie métodos privados como auxiliares
*/

package com.ka.cursojava.labs.ex127;

import java.util.Scanner;

public class Ex127 {
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

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
                System.out.println();
                System.out.println("Posição preenchida. Tente novamente.");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador("X")) {
                System.out.println("Jogador 1 venceu!");
                ganhou = true;
            } else if (jogoDaVelha.verificarGanhador("O")){
                System.out.println("Jogador 2 venceu!");
                ganhou = true;
            } else if (jogoDaVelha.getJogada() > 9) {
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


