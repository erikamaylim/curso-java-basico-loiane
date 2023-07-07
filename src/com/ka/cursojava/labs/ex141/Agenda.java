package com.ka.cursojava.labs.ex141;

import java.util.Arrays;

public class Agenda {
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                contatos[i] = c;
                cheia = false;
            }
            if (cheia) {
                // lançar exception
                throw new AgendaCheiaException();
            }
        }
    }

    public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }

        }
        // lançar exeption contato não existe
        throw new ContatoNaoExisteException(nome) ;
    }

    @Override
    public String toString() {
        return "Contatos: " + Arrays.toString(contatos);
    }
}
