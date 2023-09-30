package Desafios;

import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();
        int saldoDisponível;
        if (saldoTotal >= valorSaque) {
            saldoDisponível = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoDisponível);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
        scanner.close();
    }
}
