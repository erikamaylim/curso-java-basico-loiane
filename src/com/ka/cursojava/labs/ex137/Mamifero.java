package com.ka.cursojava.labs.ex137;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        this.setAmbiente("Terra");
    }

    public Mamifero(String nome, double comprimento, int numeroPatas, String cor, int velocidade, String alimento) {
        this.setNome(nome);
        this.setComprimento(comprimento);
        this.setNumeroPatas(numeroPatas);
        this.setCor(cor);
        this.setAmbiente("Terra");
        this.setVelocidade(velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tAlimento: " + alimento ;
    }
}
