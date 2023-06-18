/*
Curso de Java 36 - Orientação a Objetos: Relacionamento entre Classes (tem um e tem muitos)
*/

package com.ka.cursojava.aula36;

public class TesteContato {
    public static void main(String[] args) {
        Contato c1 = new Contato();

        //relacionamento tem-um endereco
        Endereco e1 = new Endereco("Morro das Sombras", "n/a"
                , "n/a", "22222-222", "Camorr", "Therin");

        //relacionamento tem-um telefone
        Telefone telefone1 = new Telefone("Celular", "21", "9999-9999");
        Telefone telefone2 = new Telefone("Residencial", "21", "2555-5555");

        Telefone[] t1 = new Telefone[2];
        t1[0] = telefone1;
        t1[1] = telefone2;

        c1.setNome("Locke Lamora");
        c1.setEndereco(e1);
        c1.setTelefones(t1);

        //Teste saída no console
        System.out.println(c1.getNome());

        if (c1 != null && c1.getEndereco() != null) {   // Este if é para evitar que ocorra um NullPointerException
            System.out.println(c1.getEndereco().getCidade());
        }
//        if (c1 != null && c1.getTelefones() != null) {
//            System.out.println(c1.getTelefones().getDdd() + " " + c1.getTelefones().getNumeroTelefones());
//        }

        if (c1 != null && c1.getTelefones() != null) {
            for (Telefone t : c1.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumeroTelefone());
            }
        }

    }
}
