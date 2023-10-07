package Strategy;

public class Main {
    public static void main(String[] args) {

        Clima estrategia = new ClimaIdeal();
        estrategia.exibirClima();

        estrategia = new Exercicio();
        estrategia.exibirClima();
    }
}
