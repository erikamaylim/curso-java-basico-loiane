/* O Sr. Manuel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas. Para agilizar o cálculo
 de quanto cada cliente deve pagar, ele desenvolveu uma tabela que contém o número de itens que o cliente comprou e o
 valor a pagar. Desta forma, a atendente do caixa precisa apenas contar quantos itens o cliente está levando e
 olhar na tabela de preços. Você foi contratado para desenvolver um programa que monte esta tabela, que conterá os
 preços de 1 a 50 itens, conforme abaixo:
 - 1 item: R$1,99
 - 2 itens : R$ 3,98
 - ...
 - 50 itens: R$ 99,50

*/

package com.ka.cursojava.labs;

public class Ex060 {
    public static void main(String[] args) {

        System.out.println("***  TABELA DE PREÇOS  ***");
        System.out.println("Quantidade       Preço");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("     %2d ....... R$ %5.2f %n", i, 1.99 * i);
        }

    }
}
