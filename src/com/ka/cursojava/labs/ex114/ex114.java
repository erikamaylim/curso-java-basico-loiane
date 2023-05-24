/* Escreva uma classe para representar uma lâmpada que está à venda em um supermercado
*/

package com.ka.cursojava.labs.ex114;

public class ex114 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potenciaWatts = 7;
        lampada.corLuz = "Amarela";
        lampada.tipo = new String[5];
        lampada.tipo[0] = "Abajur";
        lampada.tipo[1] = "Lampeão";
        lampada.tipo[2] = "Luminária";



    }
}
