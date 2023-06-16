/* Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada
OBS:
    - Atributos devem ser private;
    - Criar métodos getters, setters e construtores;
    - Métodos que serão utilizados devem ser públicos;
    - Se necessário, crie métodos privados como auxiliares
 */

package com.ka.cursojava.labs.ex124;

public class Ex124 {
    public static void main(String[] args) {
        Lampada lp = new Lampada();
        lp.mostrarEstado();
        lp.ligar();
        lp.mostrarEstado();
        lp.desligar();
        lp.mostrarEstado();
        lp.desligar();
    }
}
