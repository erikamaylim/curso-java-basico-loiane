package com.ka.cursojava.aula40;

public class Aula40 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa a1 = new Aluno();
        Aluno a2 = new Aluno();
        Pessoa prof1 = new Professor();

        p1.setEndereco("Rua 1, número 1");
        a1.setEndereco("Rua 2, número 2");
        prof1.setEndereco("Rua 3, número 3");
        p1.metodoClasseMaePessoa();
        a1.metodoClasseMaePessoa();
//        a1.metodoClasseFilha();  // Não é possível invocar método da classe Aluno
        a2.metodoClasseMaePessoa();
        a2.metodoClasseFilhaAluno();

        System.out.println(p1.obterEtiquetaEndereco());
        System.out.println(a1.obterEtiquetaEndereco());
        System.out.println(prof1.obterEtiquetaEndereco());
    }
}
