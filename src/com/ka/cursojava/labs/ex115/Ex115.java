/* Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.
*/

package com.ka.cursojava.labs.ex115;

public class Ex115 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "As mentiras de Locke Lamora";
        livro.autor = "Scott Lynch ";
        livro.anoPublicacao = 2014;
        livro.isbn13 = "978-8580412499";
        livro.numeroPaginas = 464;
        livro.edicao = 1;
        livro.editora = "Editora Arqueiro";
        livro.idioma = "Português";

        System.out.printf("Nome: %s %n", livro.nome);
        System.out.printf("Autor: %s %n", livro.autor);
        System.out.printf("Editora: %s %n", livro.editora);
        System.out.printf("Edição: %dª edição %n", livro.edicao);
        System.out.printf("Idioma: %s %n", livro.idioma);
        System.out.printf("Número de Páginas: %d páginas %n", livro.numeroPaginas);
        System.out.printf("Ano de Publicação: %d %n", livro.anoPublicacao);
        System.out.printf("ISBN-13: %s %n", livro.isbn13);
    }
}
