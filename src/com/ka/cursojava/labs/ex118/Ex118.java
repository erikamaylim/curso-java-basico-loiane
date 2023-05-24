/* Crie uma classe para representar uma conta-corrente que possua um número, um saldo, um status que informe se é
especial ou não e um limite
*/

package com.ka.cursojava.labs.ex118;

public class Ex118 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.limiteChequeEspecial = 500;
        conta.saldo = -10;

        System.out.printf("Saldo da conta %s: R$ %.2f", conta.numero, conta.saldo);
    }
}
