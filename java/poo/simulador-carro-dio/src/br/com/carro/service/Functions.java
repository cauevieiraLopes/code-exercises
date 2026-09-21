package br.com.carro.service;

import br.com.carro.model.Car;

import java.util.Scanner;

public class Functions {

    Car newcar = new Car();
    Scanner sc = new Scanner(System.in);

    //Inicialização do carro
    public void criarCarro() {
        boolean isOn = false;
        int speed = 0;
        int gear = 0;
        //Fazer o interator iniicar o carro
        newcar = new Car(isOn, speed, gear);
    }

    //Menu principal
    public void menu() {
        int opcao;

        System.out.println("========== MENU ==========");
        System.out.println("Marcha: " + newcar.verificarMarcha());
        System.out.println("Velocidade: " + newcar.verificarVelocidade() +"Km/h");
        System.out.println("Ligado: " + newcar.estaLigado());
        System.out.println("==========================");
        System.out.println("[1] Ligar Carro");  //ok
        System.out.println("[2] Desligar Carro");
        System.out.println("[3] Acelerar");
        System.out.println("[4] Diminuir velocidade");
        System.out.println("[5] Virar para esquerda/direita");
        System.out.println("[6] Trocar a marcha");
        System.out.println("[7] Finalizar programa");
        System.out.print("Opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> ligarCarro();
            case 2 -> desligarCarro();
            case 3 -> acelerarCarro();
            case 4 -> diminuirVelocidade();
            case 5 -> virarCarro();
            case 6 -> trocarMarcha();
            case 7 -> throw new RuntimeException("Encerrar");
            default -> throw new RuntimeException("""
                    
                    AVISO =================
                    Selecione uma opção válida
                    =======================
                    """);
        }
    }

    //Ligar o carro
    public void ligarCarro() {
        if (newcar.estaLigado()) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro já está ligado!
                    =======================
                    """);
        } else {
            newcar.ligar();
            System.out.println("O carro foi ligado!\n");
        }
    }

    //Desligar o carro
    public void desligarCarro() {
        if (!newcar.estaLigado()) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro já está desligado!
                    =======================
                    """);
        } else if (newcar.verificarMarcha() == 0 && newcar.verificarVelocidade() == 0){
            newcar.desligar();
            System.out.println("O carro foi desligado!\n");
        } else {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro não está parado ou não está na marcha 0
                    =======================
                    """);
        }
    }

    //função para acelearar o carro
    public void acelerarCarro() {
        if (!newcar.estaLigado()){
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro deve estar ligado para acelerar!
                    =======================
                    """);
        } else if (newcar.verificarVelocidade() == 120) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro está na velocidade máxima!
                    =======================
                    """);
        } else if (newcar.verificarMarcha() == 0) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro está na marcha 0, ele não pode acelerar!
                    =======================
                    """);
        }

        if (newcar.verificarMarcha() == 1 && newcar.verificarVelocidade() < 20) {
            newcar.aumentarVelocidade();
        } else if (newcar.verificarMarcha() == 2 && newcar.verificarVelocidade() < 40) {
            newcar.aumentarVelocidade();
        } else if (newcar.verificarMarcha() == 3 && newcar.verificarVelocidade() < 60) {
            newcar.aumentarVelocidade();
        } else if (newcar.verificarMarcha() == 4 && newcar.verificarVelocidade() < 80) {
            newcar.aumentarVelocidade();
        } else if (newcar.verificarMarcha() == 5 && newcar.verificarVelocidade() < 100) {
            newcar.aumentarVelocidade();
        } else if (newcar.verificarMarcha() == 6 && newcar.verificarVelocidade() < 120) {
            newcar.aumentarVelocidade();
        } else {
            throw new RuntimeException("""
                    
                    AVISO =================
                    Aumente mais uma marcha para aumentar a velocidade
                    =======================
                    """);
        }
    }

    //Diminuir a velocidade do carro
    public void diminuirVelocidade() {
        if (!newcar.estaLigado()) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro está desligado!
                    =======================
                    """);
        }

        if (newcar.verificarVelocidade() == 0) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro já está parado
                    =======================
                    """);
        }

        newcar.reduzirVelocidade();
    }


    //Virar o carro
    public void virarCarro() {
        if (!newcar.estaLigado()) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro está desligado!
                    =======================
                    """);
        }

        if (newcar.verificarVelocidade() > 40) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro está rápido demais para virar
                    =======================
                    """);
        } else if (newcar.verificarVelocidade() < 1) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro está parado
                    =======================
                    """);
        }

        int opcao;

        System.out.println("========== VIRAR CARRO ==========");
        System.out.println("[1] Esquerda");
        System.out.println("[2] Direita");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("O carro virou para esquerda");
            case 2 -> System.out.println("O carro virou para direita");
            default -> throw new RuntimeException("""
                    
                    AVISO =================
                    Selecione uma opção válida!
                    =======================
                    """);
        }
    }





    /*
        FUNÇÕES PARA CONTROLAR A MARCHA
     */
    public void trocarMarcha() {
        if (!newcar.estaLigado()) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    Ligue o carro primeiro
                    =======================
                    """);
        }

        int opcao;

        System.out.println("========== MARCHA ==========");
        System.out.println("[1] Aumentar");  //ok
        System.out.println("[2] Reduzir");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> aumentarMarcha();
            case 2 -> reduzirMarcha();
            default -> throw new RuntimeException("""
                    
                    AVISO =================
                    Selecione uma opção válida!
                    =======================
                    """);
        }
    }

    public void aumentarMarcha() {
        if (newcar.verificarMarcha() == 6){
            throw new RuntimeException("""
                    
                    AVISO =================
                    Você já está na maior marcha (6)
                    =======================
                    """);
        }

        if (newcar.verificarMarcha() == 0) {
            newcar.aumentarMarcha();
        } else if (newcar.verificarMarcha() == 1 && newcar.verificarVelocidade() == 20) {
            newcar.aumentarMarcha();
        } else if (newcar.verificarMarcha() == 2 && newcar.verificarVelocidade() == 40) {
            newcar.aumentarMarcha();
        } else if (newcar.verificarMarcha() == 3 && newcar.verificarVelocidade() == 60) {
            newcar.aumentarMarcha();
        } else if (newcar.verificarMarcha() == 4 && newcar.verificarVelocidade() == 80) {
            newcar.aumentarMarcha();
        } else if (newcar.verificarMarcha() == 5 && newcar.verificarVelocidade() == 100) {
            newcar.aumentarMarcha();
        } else {
            throw new RuntimeException("""
                    
                    AVISO =================
                    Aumente a velocidade para aumentar a marcha
                    =======================
                    """);
        }
    }

    public void reduzirMarcha() {
        if (newcar.verificarMarcha() == 0) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    Você já está na ultima marcha (0)
                    =======================
                    """);
        } else if (newcar.verificarMarcha() == 1 && newcar.verificarVelocidade() != 0) {
            throw new RuntimeException("""
                    
                    AVISO =================
                    O carro precisa está parado para mudar para marcha 0
                    =======================
                    """);
        }

        if (newcar.verificarMarcha() == 6 && newcar.verificarVelocidade() <= 100) {
            newcar.reduzirMarcha();
        } else if (newcar.verificarMarcha() == 5 && newcar.verificarVelocidade() <= 80) {
            newcar.reduzirMarcha();
        } else if (newcar.verificarMarcha() == 4 && newcar.verificarVelocidade() <= 60) {
            newcar.reduzirMarcha();
        } else if (newcar.verificarMarcha() == 3 && newcar.verificarVelocidade() <= 40) {
            newcar.reduzirMarcha();
        } else if (newcar.verificarMarcha() == 2 && newcar.verificarVelocidade() <= 20) {
            newcar.reduzirMarcha();
        } else if (newcar.verificarMarcha() == 1 && newcar.verificarVelocidade() == 0) {
            newcar.reduzirMarcha();
        } else {
            throw new RuntimeException("""
                    
                    AVISO =================
                    Diminua a velocidade para reduzir a marcha
                    =======================
                    """);
        }
    }
}