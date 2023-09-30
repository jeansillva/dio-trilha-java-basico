public class main {
    public static void main(String[] args) {

        Iphone iPhone2007 = new Iphone();

        ReprodutorMusical reprodutor = iPhone2007.getReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        AparelhoTelefonico telefone = iPhone2007.getAparelhoTelefonico();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = iPhone2007.getNavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
