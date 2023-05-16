/* Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter
24 horas, onde, para cada uma destas 24 horas, podemos associar uma tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o
compromisso. Ou então o usuário pode consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] agenda = new String[31][24];

        String opcao = "A";
        int dia, hora;

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                agenda[i][j] = "";
            }
        }

        while (!opcao.equalsIgnoreCase("s")) {
            do {
                System.out.print("Escolha a opção: [A] Agendar, [C] Consultar ou [S] Sair: ");
                opcao = sc.next();

            } while (!opcao.equalsIgnoreCase("A") && !opcao.equalsIgnoreCase("C") && !opcao.equalsIgnoreCase("S"));

            if (opcao.equalsIgnoreCase("S")) {
                break;
            }

            do {
                System.out.print("Digite o dia: ");
                dia = sc.nextInt();
                dia--;
            } while (dia < 0 || dia > 30);

            do {
                System.out.print("Digite a hora: ");
                hora = sc.nextInt();
            } while (hora < 0 || hora > 24);

            if (opcao.equalsIgnoreCase("A")) {
                System.out.print("Digite o compromisso: ");
                agenda[dia][hora] = sc.next();
            } else if (opcao.equalsIgnoreCase("C")) {
                if (agenda[dia][hora].isEmpty()) {
                    System.out.println("Não há nenhum compromisso agendado");
                } else {
                    System.out.printf("Compromisso do dia %d à(s) %d hora(s): ", dia + 1, hora);
                    System.out.println(agenda[dia][hora]);
                }

            }
        }
    }
}
