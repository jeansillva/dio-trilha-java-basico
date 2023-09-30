package Desafios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // O programa deve solicitar ao cliente o valor do depósito e verificar se o
        // valor é válido.
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        double saldo = 0;

        // Se o valor for maior do que zero, o programa deve adicionar o valor ao saldo
        // da conta.
        if (valor > 0) {
            saldo = valor + saldo;
            System.out.printf("Deposito realizado com sucesso! \nSaldo atual: %.2f", saldo);
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }

        scanner.close();
    }
}
