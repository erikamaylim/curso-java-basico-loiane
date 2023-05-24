/* Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada.
*/

package com.ka.cursojava.labs.ex120;

public class Ex120 {
    public static void main(String[] args) {
        Lampada lp = new Lampada();
        lp.ligarLampada();
        lp.mostrarEstadoLampada();
        lp.desligarLampada();
        lp.mostrarEstadoLampada();
    }


}
