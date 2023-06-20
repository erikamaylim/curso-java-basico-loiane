/*
Curso de Java 42: Orientação a Objetos: Palavra-chave final + constantes
 */

package com.ka.cursojava.aula42;

public class Aula42 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
//        Pessoa a1 = new Aluno();
        Aluno a1 = new Aluno();
//        Pessoa prof1 = new Professor();
        Professor prof1 = new Professor();

        p1.setEndereco("Rua 1, Número 1");
//        a1.setEndereco("Rua 2, Número 2");
//        prof1.setEndereco("Rua 3, Número 3");

        p1.imprimirEtiquetaEndereco();
//        a1.imprimirEtiquetaEndereco();
//        prof1.imprimirEtiquetaEndereco();

        String frase = "Constante: ";
        frase += Constante.CONSTANTE_EXEMPLO;
        System.out.println(frase);
//        Constante.CONSTANTE_EXEMPLO = "Tentando alterar valor da constante";
    }
}
