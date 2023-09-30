package Desafios.HerancaBasica;

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void imprimeInfo() {
        Object decimalFormat;
        System.out.println(titular + "\n" + numero + "\n" + "Saldo: R$ " + ((Object) decimalFormat).format(saldo));
    }
}
