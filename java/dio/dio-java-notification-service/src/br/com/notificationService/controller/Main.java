package br.com.notificationService.controller;

import br.com.notificationService.service.NotificationService;

public class Main {

    static NotificationService ns = new NotificationService();

    public static void main(String[] args) {

        ns.atribuirMensagem(false);
    }
}
