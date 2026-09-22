package br.com.carro.model;

public class Car implements Controlador{
    private boolean isOn;
    private int speed;
    private int gear;

    public Car () {

    }

    public Car (boolean isOn, int speed, int gear) {
        this.isOn = isOn;
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public void ligar() {
        this.isOn = true;
    }

    @Override
    public void desligar() {
        this.isOn = false;
    }

    @Override
    public boolean estaLigado() {
        return isOn;
    }

    @Override
    public void aumentarVelocidade() {
        this.speed += 1;
    }

    @Override
    public void reduzirVelocidade() {
        this.speed -= 1;
    }

    @Override
    public int verificarVelocidade() {
        return speed;
    }

    @Override
    public void aumentarMarcha() {
        this.gear += 1;
    }

    @Override
    public void reduzirMarcha() {
        this.gear -= 1;
    }

    @Override
    public int verificarMarcha() {
        return gear;
    }

}
