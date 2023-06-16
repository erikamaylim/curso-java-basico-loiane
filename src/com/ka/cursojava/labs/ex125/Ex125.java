/*
Crie uma classe para representar uma conta-corrente que possui um númerp, um saldo, um status que informa se ela é
especial ou não, um limite. Desenvolva métodos para realizar saque (verificar se o cliente pode realizar saques),
depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um
programa para testar esta classe.
OBS:
    - Atributos devem ser private;
    - Criar métodos getters, setters e construtores;
    - Métodos que serão utilizados devem ser públicos;
    - Se necessário, crie métodos privados como auxiliares
*/

package com.ka.cursojava.labs.ex125;

public class Ex125 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("123456", "1234", -10);
        cc.realizarSaque(10);
        cc.realizarSaque(500);
        cc.depositar(500);
        cc.consultarSaldo();
        cc.verificarUsoChequeEspecial();
        cc.realizarSaque(600);
        cc.verificarUsoChequeEspecial();

        System.out.println(cc);

    }
}
