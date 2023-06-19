package com.ka.cursojava.labs.ex134;

public class Professor {
    private String nomeProfessor;
    private String departamento;
    private String emailProfessor;

    public Professor() {
    }

    public Professor(String nomeProfessor, String departamento, String emailProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.departamento = departamento;
        this.emailProfessor = emailProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public String obterInfo(){
        return "Professor = " + nomeProfessor + "\n";
    }
}
