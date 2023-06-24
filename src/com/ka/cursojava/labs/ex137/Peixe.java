package com.ka.cursojava.labs.ex137;

public class Peixe extends Animal {
    private final String caracteristicas = "Barbatanas e cauda";

    public Peixe() {
        this.setNumeroPatas(0);
        this.setCor("Cinzenta");
        this.setAmbiente("Mar");
    }

    public Peixe(String nome, double comprimento, int velocidade) {
        this.setNome(nome);
        this.setComprimento(comprimento);
        this.setVelocidade(velocidade);
        this.setNumeroPatas(0);
        this.setCor("Cinzenta");
        this.setAmbiente("Mar");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n\tCaracterísticas: " + caracteristicas ;
    }
}
