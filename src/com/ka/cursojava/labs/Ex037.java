/* O hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
- Filé Duplo:
    Até 5 kg:       R$ 4,90 por kg
    Acima de 5 kg:  R$ 5,80
- Alcatra:
    Até 5 kg:       R$ 5,90 por kg
    Acima de 5 kg:  R$ 6,80
- Picanha:
    Até 5 kg:       R$ 6,90 por kg
    Acima de 5 kg:  R$ 7,80
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se a compra for feita no cartão Tabajara, o cliente receberá ainda um
 desconto de  5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo
 usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de
 pagamento, valor do desconto e valor a pagar.
    */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****   SUPERMERCADO TABAJARA   *****");
        System.out.print("Opções de carne da promoção: \n" +
                "[F] Filé Duplo \n" +
                "[A] Alcatra \n" +
                "[P] Picanha \n" +
                "Digite a opção desejada: ");
        String opcaoCarne = sc.next().toLowerCase();

        if (!opcaoCarne.equals("f") && !opcaoCarne.equals("a") && !opcaoCarne.equals("p") ) {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        System.out.print("Digite a quantidade (kg): ");
        double qtdCarne = sc.nextDouble();

        double precoSemDesconto = 0;
        double precoFinal = 0;

        if(opcaoCarne.equals("f")) {
            if (qtdCarne <= 5) {
                precoSemDesconto = qtdCarne * 4.90;
            } else {
                precoSemDesconto = qtdCarne * 5.80;
            }
        } else if (opcaoCarne.equals("a")) {
            if (qtdCarne <= 5) {
                precoSemDesconto = qtdCarne * 5.90;
            } else {
                precoSemDesconto = qtdCarne * 6.80;
            }
        } else if (opcaoCarne.equals("p")) {
            if (qtdCarne <= 5) {
                precoSemDesconto = qtdCarne * 6.90;
            } else {
                precoSemDesconto = qtdCarne * 7.80;
            }
        }

        System.out.print("Forma de Pagamento:\n" +
                "[D] Dinheiro \n" +
                "[C] Cartão de Crédito \n" +
                "[T] Cartão Tabajara \n" +
                "Digite sua opção: ");
        String opcaoPagamento = sc.next().toLowerCase();

        if (!opcaoPagamento.equals("d") && !opcaoPagamento.equals("c") && !opcaoPagamento.equals("t")) {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        if (opcaoPagamento.equals("t")) {
            precoFinal = precoSemDesconto - ((precoSemDesconto / 100) * 5);
        } else if (opcaoPagamento.equals("d") || opcaoPagamento.equals("c")){
            precoFinal = precoSemDesconto;
        }

        System.out.println("        CUPOM FISCAL");
        switch (opcaoCarne) {
            case "f" -> System.out.println("Carne: File Duplo");
            case "a" -> System.out.println("Carne: Alcatra");
            case "p" -> System.out.println("Carne: Picanha");

        }
        System.out.printf("Quantidade: %.1f kg %n", qtdCarne);
        System.out.printf("Valor Total: R$ %.2f %n", precoSemDesconto);
        if (opcaoPagamento.equals("t")) {
            System.out.printf("Valor do desconto: R$ %.2f %n", ((precoSemDesconto / 100) * 5) );
        }
        System.out.printf("Valor a Pagar: R$ %.2f", precoFinal);



    }

    }



