package com.ka.cursojava.labs.ex126;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] nomesDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        this.setNomesDisciplinas(new String[3]);
        this.setNotasDisciplinas(new double[3][4]);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNomesDisciplinas() {
        return nomesDisciplinas;
    }

    public void setNomesDisciplinas(String[] nomesDisciplinas) {
        this.nomesDisciplinas = nomesDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void exibirInformacoesAluno() {
        System.out.printf("Nome: %s %n", this.getNome());
        System.out.printf("Matrícula: %s %n", this.getMatricula());
        System.out.printf("Curso: %s %n", this.getCurso());
        for (int i = 0; i < this.getNotasDisciplinas().length; i++) {
            double soma = 0;
            System.out.println();
            System.out.printf("Notas da disciplina %s: %n", this.getNomesDisciplinas()[i]);
            for ( int j = 0; j < this.getNotasDisciplinas()[i].length; j++) {
                soma += this.getNotasDisciplinas()[i][j];
                System.out.printf("\tNota %d: %.1f %n", j + 1, this.getNotasDisciplinas()[i][j]);
            }
            double media = soma / 4;
            System.out.printf("Média da disciplina %s: %.1f", this.getNomesDisciplinas()[i], media);
            if (media >= 7) {
                System.out.println("\t APROVADO");;
            } else {
                System.out.println("\tREPROVADO");
            }
        }
    }

    public void setNomeDisciplinaPosicao(int posicao, String nomeDisciplina) {
        this.nomesDisciplinas[posicao] = nomeDisciplina;
    }

    public void setNotasDisciplinasPosicaoIJ(int posicaoI, int posicaoJ, double nota) {
        this.notasDisciplinas[posicaoI][posicaoJ] = nota;
    }
}
