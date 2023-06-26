/*
Curso de Java 45: Orientação a Objetos: Casting e instaceof
 */

package com.ka.cursojava.aula45;

public class Teste1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno;  // upcasting
        Pessoa aluno2 = (Pessoa) new Aluno();  // upcasting manual

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;  // Ao executar o programa, dá ClassCastException



    }
}
