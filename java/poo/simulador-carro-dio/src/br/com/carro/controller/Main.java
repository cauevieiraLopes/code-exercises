package br.com.carro.controller;

import br.com.carro.service.Functions;

public class Main {

    static Functions fc = new Functions();

    public static void main(String[] args) {

        boolean continuar = true;
        fc.criarCarro();

        while (continuar){
            try {
                fc.menu();
            } catch (RuntimeException e) {
                if (e.getMessage().equals("Encerrar")) {
                    continuar = false;
                } else {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
