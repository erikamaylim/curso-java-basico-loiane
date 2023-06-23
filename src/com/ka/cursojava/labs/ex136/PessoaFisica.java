package com.ka.cursojava.labs.ex136;

public class PessoaFisica extends Contribuinte {
    private double aliquota;
    private double deducao;
    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getDeducao() {
        return deducao;
    }

    public void setDeducao(double deducao) {
        this.deducao = deducao;
    }

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta();
        if (renda >= 0 && renda <= 1400){
            this.setAliquota(0);
            this.setDeducao(0);
            this.setImposto(0);
        } else if (renda > 1400 && renda <= 2100) {
            this.setAliquota(0.10);
            this.setDeducao(100);
            this.setImposto(renda * this.getAliquota() - this.getDeducao());
        } else if (renda > 2100 && renda <= 2800) {
            this.setAliquota(0.15);
            this.setDeducao(270);
            this.setImposto(renda * this.getAliquota() - this.getDeducao());
        } else if (renda > 2800 && renda <= 3600) {
            this.setAliquota(0.25);
            this.setDeducao(500);
            this.setImposto(renda * this.getAliquota() - this.getDeducao());
        } else if (renda > 3600) {
            this.setAliquota(0.30);
            this.setDeducao(700);
            this.setImposto(renda * this.getAliquota() - this.getDeducao());
        }
        return this.getImposto();
    }

    @Override
    public String toString() {
        calcularImposto();
        double rendaLiquida = this.getRendaBruta() - this.getImposto();
        return super.toString() +
                "\n\tTipo: Pessoa Física" +
                "\n\t(+)Renda Bruta: R$ " + String.format("%,.2f", this.getRendaBruta()) +
                "\n\t(-)Alíquota: " + String.format("%.0f", this.getAliquota() * 100) + "%" +
                "\n\t(-)Dedução: R$ " + String.format("%,.2f", this.getDeducao()) +
                "\n\t(-)Imposto: R$ " + String.format("%,.2f", this.getImposto()) +
                "\n\tRenda Líquida: R$ " + String.format("%,.2f", rendaLiquida);
    }
}
