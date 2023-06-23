package com.ka.cursojava.labs.ex136;

public class PessoaJuridica extends Contribuinte {

    private final double aliquota = 0.10;
    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }


    @Override
    public double calcularImposto() {
        this.setImposto(this.getRendaBruta() * aliquota);
        return this.getImposto();
    }

    @Override
    public String toString() {
        calcularImposto();
        double rendaLiquida = this.getRendaBruta() - this.getImposto();
        return super.toString() +
                "\n\tTipo: Pessoa Jurídica" +
                "\n\tReceita Bruta: R$ " + String.format("%,.2f", this.getRendaBruta()) +
                "\n\t(-) Dedução da Receita Bruta: " +
                "\n\t\tImposto: R$ " + String.format("-%,.2f", this.getImposto()) +
                "\n\t(=) Receita Líquida: R$ " + String.format("%,.2f", rendaLiquida);
    }
}
