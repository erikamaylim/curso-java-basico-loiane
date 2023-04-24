/* O Sr. Manuel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha que já é
sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de
 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme exemplo abaixo:
 - Preço do pão: R$ 0,18
 - 1 pão: R$ 0,18
 - 2 pães: R$ 0,36
 - ...
 - 50 pães: R$ 9,00
*/
package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoUnitario;


        System.out.print("Digite o preço unitário do pão: ");
        precoUnitario = sc.nextDouble();

        System.out.println("***  TABELA DE PREÇOS - PÃO FRANCÊS  ***");
        System.out.println("Quantidade       Preço");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("   %2d ......... R$ %6.2f %n", i, precoUnitario * i);
        }
    }
}
