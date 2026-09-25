package br.com.notificationService.model ;

public class Mensagem implements MessageDispatcher{
    private String texto;

    public Mensagem() {

    }

    public Mensagem(String texto) {
        mensageCreator(texto);
    }


    @Override
    public void mensageCreator(String texto) {
        this.texto = texto.trim();
    }

    @Override
    public String viewMensage() {
        return this.texto;
    }
}
