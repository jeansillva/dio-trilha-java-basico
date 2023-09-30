package Desafios.AbrindoContas;

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
        System.out.println("Informacoes: \n" + "Conta:" + numero + "\n"
                + "Titular:" + titular + "\nSaldo: R$ " + saldo);

    }
}
