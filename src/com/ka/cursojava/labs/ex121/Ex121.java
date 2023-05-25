/* Crie uma classe para representar uma conta-corrente que possua um número, saldo, status que informa se é especial
ou não, e um limite. Desenvolva métodos para realizar saque (verificar se o cliente pode realizar saques), depsitar
dinheiro, consultar saldo e verificar se o cliente está usando o cheque especial ou não. Desenvolva um programa para
testar essa classe.)
*/

package com.ka.cursojava.labs.ex121;

public class Ex121 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteChequeEspecial = 500;
        conta.valorUsadoChequeEspecial = 0;
        conta.saldo = -10;

        conta.realizarSaque(10);

        conta.realizarSaque(500);

        conta.depositar(500);

        conta.consultarSaldo();

        conta.verificarUsoChequeEspecial();

        conta.realizarSaque(600);
        
        conta.verificarUsoChequeEspecial();

    }
}
