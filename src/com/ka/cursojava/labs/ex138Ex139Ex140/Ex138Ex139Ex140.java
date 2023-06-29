/*
1- Escreva uma classe FiguraGeometrica com atributos nome e cor. Escreva uma classe Figura2D e uma classe Figura3D.
Ambas classes são subclasses da FiguraGeometrica. Crie ainda as classes Circulo, Quadrado e Triangulo que estendem
a classe Figura2D e crie também as classes Cubo, Cilindro e Piramide que estendem a classe Figura3D.

2- Escreva a interface DimensaoSuperficial que contém o método calcularArea. Ecreva a interface DimensaoVolumetrica
que contém o conteúdo calcularVolume. Aplique a interface DimensaoSuperficial em todas as subclasses de Figura2D
e Figura3D e aplique a interface DimensaoVolumetrica nas subclasses de Figura3D, implementando seus métodos
de acordo com as regras de cada figura geométrica (crie os atributos necessários)

3- Crie pelo menos uma instância de cada classe e adicione em um array do tipo FiguraGeometrica. Itere esse array,
imprimindo na tela a área e o volume (quando aplicável). Dica: você pode usar o operador instanceOf.*/

package com.ka.cursojava.labs.ex138Ex139Ex140;

public class Ex138Ex139Ex140 {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado(2);
        quad.setNome("Quadrado");
        Circulo cir = new Circulo(2);
        cir.setNome("Circulo");
        Triangulo tri = new Triangulo(3, 2);
        tri.setNome("Triangulo");
        Cubo cubo = new Cubo(3);
        cubo.setNome("Cubo");
        Cilindro cil = new Cilindro(3, 2);
        cil.setNome("Cilindro");
        Piramide pir = new Piramide(3, 2, 4, 4, quad);
        pir.setNome("Piramide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quad;
        figuras[1] = cir;
        figuras[2] = tri;
        figuras[3] = cubo;
        figuras[4] = cil;
        figuras[5] = pir;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("----------------------");
            System.out.println(figura.getNome() + ":");
            if(figura instanceof Figura2D) {
                Figura2D f2d = (Figura2D) figura;
                System.out.println("\tÁrea: " + String.format("%.1f", f2d.calcularArea()));
            }
            if(figura instanceof Figura3D) {
                Figura3D f3d = (Figura3D) figura;
                System.out.println("\tÁrea: " + String.format("%.1f", f3d.calcularArea()));
                System.out.println("\tVolume: " + String.format("%.1f", f3d.calcularVolume()));
            }
        }


    }
}
