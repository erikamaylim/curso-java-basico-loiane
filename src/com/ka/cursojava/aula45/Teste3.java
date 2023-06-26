package com.ka.cursojava.aula45;

public class Teste3 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno(); // upcasting
        Pessoa professor = new Professor();  // upcasting

        if (pessoa instanceof Pessoa) {
            System.out.println("pessoa é do tipo Pessoa");
        }
        if (pessoa instanceof Aluno) {
            System.out.println("pessoa é do tipo Aluno");
        }
        if(aluno instanceof Aluno) {
            System.out.println("aluno é do tipo Aluno");
        }
        if (aluno instanceof Pessoa) {
            System.out.println("aluno é do tipo Pessoa");
        }
        if (professor instanceof Professor) {
            System.out.println("professor é do tipo Professor");
        }
    }
}
