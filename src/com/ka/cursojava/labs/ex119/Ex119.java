package com.ka.cursojava.labs.ex119;

public class Ex119 {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.nome = "John Doe";
        contato1.endereco = "Rua dos Alfeneiros, 4";
        contato1.email = "johndoe@email.com";

        contato1.telefones = new String[2];
        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "2522-2222";

        System.out.printf("Informações de %s: %n", contato1.nome);
        System.out.printf("\tE-mail: %s %n", contato1.email);
        System.out.printf("\tEndereço: %s %n", contato1.endereco);
        System.out.printf("\tCelular: %s %n", contato1.telefones[0]);
        System.out.printf("\tTelefone residencial: %s %n", contato1.telefones[1]);


    }
}
