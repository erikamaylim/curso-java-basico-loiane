/*Escreva uma classe Contato que contenha nome, telefone e um identificador. Esse identificador deve ser gerado
automaticamente pela classe de um contador (cada vez que um Contato é criado, o contador é incrementado e atribuído
ao identificador). Crie uma classe Agenda que irá funcionar para gerenciar os Contatos. Essa classe precisa de um
método para adicionar um Contato e também para consultar.
Crie uma classe Teste que informe um menu ao usuário:
    1- para consultar um contato da agenda
    2- para adicionar um contato na agenda
Se o contato não existir, o programa deve lançar uma exceção de ContatoNaoExisteException. Caso a agenda esteja cheia
quando o usuário quiser adicionar um novo contato, o programa deve lançar uma exceção AgendaCheiaException. Trate as
exceções de tipos de dados (caso o usuário entre com um tipo de dado inválido).
*/

package com.ka.cursojava.labs.ex141;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    }

    public static int obterOpcaoMenu(Scanner sc) {
        boolean valido = false;
        int opcao = 0;
        while (!valido) {
            System.out.println("\t*** MENU DE OPÇÕES ***");
            System.out.println("1: Consultar contato ");
            System.out.println("2: Adicionar contato");
            System.out.println("0: Sair ");
            System.out.print("Digite a opção desejada: ");

            try {
                opcao = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente.");
            }
        }
        return opcao;

    }

}
