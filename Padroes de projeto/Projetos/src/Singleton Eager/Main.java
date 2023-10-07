public class Main {
    public static void main(String[] args) {

        ImprimirMensagem messagePrinter = ImprimirMensagem.getInstance();
        messagePrinter.printMessage();
    }
}