package br.com.notificationService.service;

import br.com.notificationService.model.Mensagem;

import java.util.Scanner;
import java.util.function.Consumer;

public class NotificationService {

    Scanner sc = new Scanner(System.in);
    Mensagem mensagem = new Mensagem();

    public void atribuirMensagem(boolean modificarMensagem) {
        System.out.println("===== SERVÇO DE MARKETING =====");
        System.out.print("Escreva a mensagem: ");

        //Caso o metodo seja chamado no menu para modificar a mensagem
        if (modificarMensagem) {
            sc.nextLine();
        }

        String text = sc.nextLine();
        mensagem = new Mensagem(text);

        menu();
    }

    public void menu() {
        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("Mensagem atual: " + mensagem.viewMensage());
        System.out.println("Serviços de envio ==========");
        System.out.println("[1] - SMS");
        System.out.println("[2] - E-mail");
        System.out.println("[3] - Redes sociais");
        System.out.println("[4] - WhatsApp");
        System.out.println("[5] - Alterar mensagem");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> enviarSms();
            case 2 -> enviarEmail();
            case 3 -> enviarRedeSocial();
            case 4 -> enviarWhatsApp();
            case 5 -> atribuirMensagem(true);
        }
    }

    public void enviarSms() {
        System.out.println(); //espaço

        Consumer<Mensagem> enviarSms = mensagem1 -> {
            //Acessar todos os sms dentro do banco de dados
            System.out.println("Enviando mensagem para os SMS cadastrados...");
            //Registrar o envio
            System.out.println("Registrando o envio no Banco de dados...");
            System.out.println("A mensagem: / " + mensagem1.viewMensage() + " / foi enviada para todos os SMS!");
        };

        enviarSms.accept(mensagem);

        sc.close();
    }

    public void enviarEmail() {
        System.out.println(); //espaço

        Consumer<Mensagem> enviarEmail = mensagem1 -> {
            //Acessar todos os sms dentro do banco de dados
            System.out.println("Enviando mensagem para os E-mails cadastrados...");
            //Registrar o envio
            System.out.println("Registrando o envio no Banco de dados...");
            System.out.println("A mensagem: / " + mensagem1.viewMensage() + " / foi enviada para todos os E-mails!");
        };

        enviarEmail.accept(mensagem);

        sc.close();
    }

    public void enviarRedeSocial() {
        System.out.println(); //espaço

        Consumer<Mensagem> enviarRedeSocial = mensagem1 -> {
            //Acessar todos os sms dentro do banco de dados
            System.out.println("Enviando mensagem para todas as redes sociais...");
            //Registrar o envio
            System.out.println("Registrando o envio no Banco de dados...");
            System.out.println("A mensagem: / " + mensagem1.viewMensage() + " / foi enviada para todos as redes sociais!");
        };

        enviarRedeSocial.accept(mensagem);

        sc.close();
    }

    public void enviarWhatsApp() {
        System.out.println(); //espaço

        Consumer<Mensagem> enviarWhatsApp = mensagem1 -> {
            //Acessar todos os sms dentro do banco de dados
            System.out.println("Enviando mensagem para os WhatsApp cadastrados...");
            //Registrar o envio
            System.out.println("Registrando o envio no Banco de dados...");
            System.out.println("A mensagem: / " + mensagem1.viewMensage() + " / foi enviada para todos os WhatsApp!");
        };

        enviarWhatsApp.accept(mensagem);

        sc.close();
    }
}
