package com.ka.cursojava.labs.ex134;

import java.util.Arrays;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String nomeAluno, String matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }

    public Aluno(String nomeAluno, String matricula, double[] notas) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double obterMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String obterInfo(){

        String info = "Aluno " + nomeAluno + "\n";
        info += "Matricula " + matricula + "\n";
        info += "Notas: ";

        double soma = 0;
        for (double nota : notas){
            soma += nota;
            info += nota + " | ";
        }
        double media = soma/ notas.length;
        info += "\n" + "Média: " + media + " - ";
        if (media >= 7){
            info += "APROVADO!";
        } else {
            info += "REPROVADO!";
        }

        return info;
    }
}
