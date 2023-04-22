/* O Sr. Manuel Joaquim expandiu os seus negócios para além dos negócios de R$ 1,99 e agora possui uma loja de
conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número
 desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para
 indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o
 cliente forneceu, para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao
 ponto inicial para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
 - Lojas Tabajara
    Produto 1: R$ 2,20
    Produto 2: R$ 5,80
    Produto 3: R$ 0,00
    Total: R$ 9,00
    Dinheiro: R$ 20,00
    Troco: R$ 11,00
*/

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validacao = true;
        double preco = 1, soma = 0, dinheiro;
        int cont;

        while (true) {
            System.out.println("***  LOJAS TABAJARA  ***");
            cont = 1;
            validacao = true;
            soma = 0;
            do {
                System.out.printf("Produto %d: R$ ", cont);
                preco = sc.nextDouble();
                soma += preco;
                cont++;
                if (preco == 0) {
                    validacao = false;
                } else if (preco == -1) {
                    System.exit(0);
                }

            } while (validacao);

            System.out.printf("Total: R$ %.2f %n", soma);
            System.out.print("Dinheiro: R$ ");
            dinheiro = sc.nextDouble();
            System.out.printf("Troco: R$ %.2f %n", dinheiro - soma);
            System.out.println(" ");
        }

    }
}
