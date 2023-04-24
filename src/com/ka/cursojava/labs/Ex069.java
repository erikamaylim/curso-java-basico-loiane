/* O cardápio de uma lanchonete é o seguinte:
    Opção               Código      Preço
    Cachorro Quente     100         R$ 1,20
    Bauru Simples       101         R$ 1,30
    Bauru c ovo         102         R$ 1,50
    Hamburguer          103         R$ 1,20
    Cheeseburguer       104         R$ 1,30
    Refrigerante        105         R$ 1,00
Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago
 por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve
  ser encerrado.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validacao = true;
        int codigo, qtd;
        double custo = 0, soma;
        String output = "", cont = "s";

        do {
            System.out.println("               CARDÁPIO ");
            System.out.println("...........................................");
            System.out.println("Opção               Código      Preço");
            System.out.println("Cachorro Quente     100         R$ 1,20");
            System.out.println("Bauru Simples       101         R$ 1,30");
            System.out.println("Bauru c ovo         102         R$ 1,50");
            System.out.println("Hamburguer          103         R$ 1,20");
            System.out.println("Cheeseburguer       104         R$ 1,30");
            System.out.println("Refrigerante        105         R$ 1,00");
            System.out.println(" ");
            System.out.println("NOVO PEDIDO");
            codigo = 1;
            soma = 0;
            qtd = 0;
            do {
                while (codigo != 0 && codigo != 100 && codigo != 101 && codigo != 102 && codigo != 103 && codigo != 104 && codigo != 105) {
                    System.out.print("Digite o código (0 para encerrar): ");
                    codigo = sc.nextInt();
                    if (codigo == 0) {
                        break;
                    }
                }

                if (codigo == 0) {
                    break;
                } else {
                    while (qtd <= 0) {
                        System.out.print("Quantidade: ");
                        qtd = sc.nextInt();
                    }
                }
                switch (codigo) {
                    case 100 -> custo = 1.20 * qtd;
                    case 101 -> custo = 1.30 * qtd;
                    case 102 -> custo = 1.50 * qtd;
                    case 103 -> custo = 1.20 * qtd;
                    case 104 -> custo = 1.30 * qtd;
                    case 105 -> custo = 1.00 * qtd;
                }
//
                switch (codigo) {
                    case 100 -> output += "Cachorro Quente x " + qtd + ": R$ " + custo + "\n";
                    case 101 -> output += "Bauru Simples x " + qtd + ": R$ " + custo + "\n";
                    case 102 -> output += "Bauru c ovo x " + qtd + ": R$ " + custo + "\n";
                    case 103 -> output += "Hamburguer x " + qtd + ": R$ " + custo + "\n";
                    case 104 -> output += "Cheeseburguer x " + qtd + ": R$ " + custo + "\n";
                    case 105 -> output += "Refrigerante x " + qtd + ": R$ " + custo + "\n";
                }

                soma += custo;
                qtd = 0;
                codigo = 1;

            } while (codigo != 0);

            System.out.println(" ");
            System.out.print(output);
            System.out.printf("Valor total da compra: R$ %,.2f %n", soma);
            output = "";
            System.out.println(" ");
            do {
                System.out.print("Novo pedido? [S/N] ");
                cont = sc.next().toUpperCase();
            } while (!cont.equals("S") && !cont.equals("N"));
            if (cont.equals("N")) {
                validacao = false;
            }

        } while (validacao) ;
    }
    }

