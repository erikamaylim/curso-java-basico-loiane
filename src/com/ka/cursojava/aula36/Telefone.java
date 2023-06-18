package com.ka.cursojava.aula36;

public class Telefone {
    private String tipo;
    private String ddd;
    private String numeroTelefone;

    public Telefone() {
    }

    public Telefone(String tipo, String ddd, String numeroTelefone) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "{" +
                "tipo: '" + tipo + '\'' +
                ", ddd: '" + ddd + '\'' +
                ", numeroTelefone: '" + numeroTelefone + '\'' +
                '}';
    }
}
