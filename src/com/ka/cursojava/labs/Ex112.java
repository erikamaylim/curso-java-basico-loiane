/* Modifique o programa anterior (Ex111) de maneira a guardar os compromissos de todo o ano, organizados por mês, dia
                                                                                   e hora (só 8 horas por dia)
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][][] agenda = new String[12][31][8];

        String opcao = "A";
        int mes, dia, hora;

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                for (int k = 0; k < agenda[i][j].length; k++) {
                    agenda[i][j][k] = "";
                }
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
                System.out.print("Digite o mês: ");
                mes = sc.nextInt();
                mes--;
            } while (mes < 0 || mes > 11);

            do {
                System.out.print("Digite o dia: ");
                dia = sc.nextInt();
                dia--;
            } while (dia < 0 || dia > 30);

            do {
                System.out.print("Digite a hora: ");
                hora = sc.nextInt();
            } while (hora < 0 || hora > 7);

            if (opcao.equalsIgnoreCase("A")) {
                System.out.print("Digite o compromisso: ");
                agenda[mes][dia][hora] = sc.next();
            } else if (opcao.equalsIgnoreCase("C")) {
                if (agenda[mes][dia][hora].isEmpty()) {
                    System.out.println("Não há nenhum compromisso agendado");
                } else {
                    System.out.printf("Compromisso do dia %d/%d à(s) %d hora(s): ", dia + 1, mes + 1, hora);
                    System.out.println(agenda[mes][dia][hora]);
                }

            }
        }

    }

}

