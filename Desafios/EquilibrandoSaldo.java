package Desafios;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // o programa deve solicitar uma entrada que representa o saldo atual do
        // funcionário
        System.out.println("Olá! Seja bem vindo! "
                + "Digite seu saldo atual:");
        double saldoAtual = sc.nextDouble();

        // O programa deve atualizar o saldo com base nas transações e exibir o saldo
        // final.
        System.out.println("Digite o valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        System.out.println("Digite o valor do saque: ");
        double valorRetirada = sc.nextDouble();

        double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;
        System.out.printf("O valor do saldo atualizado é de: %.1f%n", saldoAtualizado);
        sc.close();
    }
}
