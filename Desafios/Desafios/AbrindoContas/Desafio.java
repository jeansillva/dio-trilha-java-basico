package Desafios.AbrindoContas;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroConta = sc.nextInt();
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        conta.imprimeInfo();

    }
}
