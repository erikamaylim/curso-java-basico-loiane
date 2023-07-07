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

        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(sc);

            if (opcao == 1) {  // Consultar contato
                consultarContato(sc, agenda);
            } else if (opcao == 2) {  // Adicionar contato
                adicionarContato(sc, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner sc, Agenda agenda) {
        try {
            System.out.println("Cadastrando um contato");
            String nome = lerInformacao(sc, "Nome: ");
            String telefone = lerInformacao(sc, "Telefone: ");
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado:");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println(agenda);

        }
    }

    public static void consultarContato(Scanner sc, Agenda agenda) {
        String nomeContato = lerInformacao(sc, "Entre com o nome do contato desejado: ");
        try {
            if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacao(Scanner sc, String msg) {
        System.out.println(msg);
        String entrada = sc.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner sc) {
        boolean valido = false;
        int opcao = 0;
        while (!valido) {
            System.out.println("*** MENU DE OPÇÕES ***");
            System.out.println("[1] Consultar contato ");
            System.out.println("[2] Adicionar contato");
            System.out.println("[0] Sair ");
            System.out.print("Digite a opção desejada: ");

            try {
                String entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao == 1 || opcao == 2 || opcao == 0 ){
                    valido = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente.\n");
            }
        }
        return opcao;

    }

}
