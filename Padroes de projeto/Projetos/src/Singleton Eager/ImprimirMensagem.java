public class ImprimirMensagem {

    private static ImprimirMensagem instance = new ImprimirMensagem();

    private ImprimirMensagem() {

    }

    public static ImprimirMensagem getInstance() {
        return instance;
    }

    public void printMessage() {
        System.out.println("Testando singleton eager com mensagem");
    }
}