/*
Curso de Java 41: Orientação a Objetos: Herança: classes abstratas
 */

package com.ka.cursojava.aula41;

public class Aula41 {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa(); // Classes abstratas não podem ser instanciadas
        Pessoa a1 = new Aluno();
        Pessoa prof1 = new Professor();

        a1.setEndereco("Rua 1, número 1");
        prof1.setEndereco("Rua 2, número 2");

//        System.out.println(a1.obterEtiquetaEndereco());
//        System.out.println(prof1.obterEtiquetaEndereco());

        a1.imprimirEtiquetaEndereco();
        prof1.imprimirEtiquetaEndereco();

    }

}
