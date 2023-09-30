public class AparelhoTelefonico implements InterfaceAparelho {

    // Comportamento esperado: ligar, atender, iniciarCorrerioVoz
    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
