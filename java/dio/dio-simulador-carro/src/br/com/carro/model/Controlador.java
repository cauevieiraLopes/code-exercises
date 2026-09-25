package br.com.carro.model;

public interface Controlador {
    void ligar();
    void desligar();
    void aumentarVelocidade();
    void reduzirVelocidade();
    void aumentarMarcha();
    void reduzirMarcha();

    boolean estaLigado();
    int verificarVelocidade();
    int verificarMarcha();
}
