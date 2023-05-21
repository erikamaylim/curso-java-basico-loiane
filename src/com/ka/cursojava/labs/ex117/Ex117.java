package com.ka.cursojava.labs.ex117;

import java.util.Date;

public class Ex117 {
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();
        livro.nome = "As mentiras de Locke Lamora";
        livro.autor = "Scott Lynch ";
        livro.anoPublicacao = 2014;
        livro.isbn13 = "978-8580412499";
        livro.numeroPaginas = 464;
        livro.edicao = 1;
        livro.editora = "Editora Arqueiro";
        livro.idioma = "Português";
        livro.disponivel = false;
        livro.reservadoPor = "John Doe";
        livro.dataEntrega = new Date();

        System.out.printf("Nome: %s %n", livro.nome);
        System.out.printf("Autor: %s %n", livro.autor);
        System.out.printf("Disponível: %b %n", livro.disponivel);
        System.out.printf("Reservado por: %s %n", livro.reservadoPor);
        System.out.printf("Data de Entrega: %td/%tm/%ty %n", livro.dataEntrega, livro.dataEntrega, livro.dataEntrega);

    }
}
