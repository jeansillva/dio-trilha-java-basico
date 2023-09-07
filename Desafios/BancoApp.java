package Desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = calcularInvestimento(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }

    static double calcularInvestimento(double valorInicial, double taxaJuros, int periodo) {
        // M = C * (1 + i)^t.
        double valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodo);
        return valorFinal;
    }

}