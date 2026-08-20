package br.com.mercado.controller;

import br.com.mercado.service.Sericos;

public class Main {

    static Sericos serv = new Sericos();

    public static void main(String[] args) {

        try {
            serv.menu();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
