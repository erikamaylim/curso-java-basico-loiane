package com.ka.cursojava.labs.ex141;

public class Contato {
    private int id;
    private static int contador = 0;
    private String nome;
    private String telefone;

    public Contato() {
        contador++;
        id = contador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nome: " + nome +
                ", Telefone: " + telefone ;
    }
}
