package Desafios.HerancaBasica;

import java.text.DecimalFormat;

public class ContaPoupanca extends ContaBancaria {
    public double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void imprimeInfo() {
        super.imprimeInfo();
        DecimalFormat converteDecimal = new DecimalFormat();
        System.out.println("Taxa de Juros: " + converteDecimal.format(taxaJuros) + "%");
    }

}
