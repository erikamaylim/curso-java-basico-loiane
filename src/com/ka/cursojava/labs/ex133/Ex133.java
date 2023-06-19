/*
Escreva uma classe Agenda que contém vários contatos do tipo Contato. Cada contato possui um nome, telefone e e-mail.
A Agenda também possui um nome. Crie um programa teste que peça para o usuário entrar com o nome da Agenda e,
em seguida, 3 contatos. Crie métodos que retornem uma String com a informação de cada contato
e também de todos os contatos da agenda.
*/

package com.ka.cursojava.labs.ex133;

import java.util.Scanner;

public class Ex133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da Agenda: ");
        String nomeAgenda = sc.nextLine();
        Agenda a1 = new Agenda(nomeAgenda);
        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            System.out.printf("Digite as informações do %dº contato: %n", i + 1);
            Contato c = new Contato();
            System.out.printf("Nome do %dº contato: ", i + 1);
            String nome = sc.nextLine();
            c.setNomeContato(nome);
            System.out.printf("Telefone do %dº contato: ", i + 1);
            String telefone = sc.nextLine();
            c.setTelefone(telefone);
            System.out.printf("E-mail do %dº contato: ", i + 1);
            String email = sc.nextLine();
            c.setEmail(email);
            contatos[i] = c;
        }

        a1.setContatos(contatos);


        if (a1 != null) {
            System.out.println(a1.obterInfo());
        }


    }
}
