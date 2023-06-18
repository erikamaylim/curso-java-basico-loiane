/*
Escreva uma classe chamada Contador que tem um atributo estático que é incrementado sempre que a classe for
instanciada. Crie métodos para zerar, incrementar e retornar o valor do contador. Desenvolva um programa para testar
essa classe.
*/

package com.ka.cursojava.labs.ex128;



public class Ex128 {
    static void imprimir() {
        System.out.println(Contador.retornarContador());
    }
    public static void main(String[] args) {

        imprimir();
        Contador.incrementar();
        imprimir();
        Contador.zerar();
        imprimir();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        imprimir();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        imprimir();


        // Quanto static é usado em uma variável, esta mesma variável será acessada
        // por todas as instâncias de objetos desta classe como uma variável comum, ou seja,
        // a variável criada será a mesma em todas as instâncias
        // e quando seu conteúdo é modificado numa das instâncias, a modificação ocorre em todas as demais.
    }
}
