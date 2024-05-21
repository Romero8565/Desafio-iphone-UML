import Aparelho.Iphone;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Iphone myiphone = new Iphone();

        System.out.println("Navegador de internet");
        myiphone.exibirPagina();
        myiphone.atualizarPagina();
        myiphone.adicionarNovaAba();

        System.out.println("Aparelho telefonico");
        myiphone.atender();
        myiphone.ligar();
        myiphone.iniciarCorreioVoz();

        System.out.println("Reprodutor musical");
        myiphone.tocar();
        myiphone.pausar();
        myiphone.selecionarMusica();

    }
    
}
