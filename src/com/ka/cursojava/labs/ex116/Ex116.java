/* Usando o resultado do exercício anterior como base, crie uma classe LivroLivraria que represente os dados básicos
de um livro que está à venda em uma livraria
*/

package com.ka.cursojava.labs.ex116;

import com.ka.cursojava.labs.ex115.Livro;

public class Ex116 {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();
        livro.nome = "As mentiras de Locke Lamora";
        livro.autor = "Scott Lynch ";
        livro.anoPublicacao = 2014;
        livro.isbn13 = "978-8580412499";
        livro.numeroPaginas = 464;
        livro.edicao = 1;
        livro.editora = "Editora Arqueiro";
        livro.idioma = "Português";
        livro.preco = 59.90;

        System.out.printf("Nome: %s %n", livro.nome);
        System.out.printf("Autor: %s %n", livro.autor);
        System.out.printf("Editora: %s %n", livro.editora);
        System.out.printf("Edição: %dª edição %n", livro.edicao);
        System.out.printf("Idioma: %s %n", livro.idioma);
        System.out.printf("Número de Páginas: %d páginas %n", livro.numeroPaginas);
        System.out.printf("Ano de Publicação: %d %n", livro.anoPublicacao);
        System.out.printf("ISBN-13: %s %n", livro.isbn13);
        System.out.printf("Preço: R$ %.2f", livro.preco);
    }
}
