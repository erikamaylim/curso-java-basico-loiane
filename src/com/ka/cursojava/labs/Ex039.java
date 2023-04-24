/* Faça um programa que leia um nome de usuário e a sua senha e não aceite senha igual ao nome do usuário, mostrando
uma mensagem de erro e voltando a pedir as informações.
*/

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeUsuario;
        String senhaUsuario;
        boolean senhaValida = false;


        System.out.print("Digite o nome de usuário: ");
        nomeUsuario = sc.next();

        do {
            System.out.print("Digite a senha: ");
            senhaUsuario = sc.next();

            if (senhaUsuario.equalsIgnoreCase(nomeUsuario) ) {
                System.out.println("Erro! A senha não pode ser igual ao nome de usuário.");
            } else {
                senhaValida = true;
                System.out.println("Nome de usuário e senha registrados!");
            }
        } while (!senhaValida);


    }
}
