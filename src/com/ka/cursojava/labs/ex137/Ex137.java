package com.ka.cursojava.labs.ex137;

public class Ex137 {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 225, 4, "Amarela", "Deserto", 65);
        Mamifero urso = new Mamifero("Urso Pardo", 240, 4, "Castanha", 56, "Mel");
        Peixe tubarao = new Peixe("Tubarão-branco", 340, 56);

        System.out.println("\t*** Zoo ***" + "\n---------------------");


        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = urso;
        animais[2] = tubarao;

        for (Animal a : animais) {
            System.out.println(a);
        }

    }
}
