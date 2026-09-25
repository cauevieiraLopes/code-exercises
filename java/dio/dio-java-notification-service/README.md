# Serviço de Notificações de Marketing - Desafio DIO

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Desafio-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-success?style=for-the-badge)

Um sistema de gerenciamento e despacho de mensagens de marketing multiplataforma via terminal. Desenvolvido como resolução de um desafio prático da plataforma DIO (Digital Innovation One), este projeto aplica os conceitos de Programação Funcional no Java (especificamente a interface `Consumer`) para criar rotinas isoladas de envio de campanhas publicitárias.

## Features (Funcionalidades)

- **Criação e Edição de Campanhas:** Permite ao usuário escrever uma mensagem customizada e alterá-la dinamicamente antes do disparo.
- **Despacho Multiplataforma:** Simula o envio de uma mesma mensagem para diferentes serviços através do uso da interface funcional `Consumer<Mensagem>`.
- **Canais de Distribuição Suportados:**
  - SMS
  - E-mail
  - Redes Sociais
  - WhatsApp
- **Menu Interativo e Dinâmico:** Navegação contínua que mantém o estado da mensagem atual salvo em memória.

## Tecnologias Utilizadas

**Core / Back-end:**
- Java (JDK 11+)
- `java.util.function.Consumer` para execução das ações de disparo sem retorno de dados.
- `java.util.Scanner` para captura de I/O no terminal.
- Princípios de Design: MVC simplificado (Model, Controller, Service).

## Pré-requisitos e Instalação

Para rodar este projeto localmente, siga os passos abaixo.

**Pré-requisitos:**
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) instalado na máquina.
- Git instalado.

**Passo a passo:**

1. Clone o repositório:
```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
```

2. Acesse a pasta do projeto:
```bash
cd NOME_DO_REPOSITORIO/src
```

3. Compile os arquivos Java:
```bash
javac br/com/notificationService/controller/Main.java
```

4. Execute o programa:
```bash
java br.com.notificationService.controller.Main
```

> **Nota sobre Variáveis de Ambiente:** Este projeto roda inteiramente no terminal simulando os despachos e não possui integrações externas ativas no momento, portanto, **não exige** a configuração de um arquivo `.env`.

## Uso (Usage)

Ao iniciar a aplicação, redija a mensagem que deseja enviar. Em seguida, o painel de opções será aberto, permitindo a escolha da plataforma de disparo.

Exemplo de interação no console:
```text
===== SERVÇO DE MARKETING =====
Escreva a mensagem: Aproveite as promoções de Black Friday!

===== MENU PRINCIPAL =====
Mensagem atual: Aproveite as promoções de Black Friday!
Serviços de envio ==========
[1] - SMS
[2] - E-mail
[3] - Redes sociais
[4] - WhatsApp
[5] - Alterar mensagem
Opção: 4

Enviando mensagem para os WhatsApp cadastrados...
Registrando o envio no Banco de dados...
A mensagem: / Aproveite as promoções de Black Friday! / foi enviada para todos os WhatsApp!
```

## Testes

Por ser uma aplicação baseada em I/O de console, os testes atuais são validados através de fluxos de execução manuais:
- Redigir uma mensagem, navegar pelas opções do menu e realizar o disparo (Caminho Feliz).
- Escolher a opção `5` para modificar o texto, e validar se o terminal recarrega o menu mantendo a nova mensagem atualizada.

**Próximos passos (Testes Automatizados):**
Implementação de testes com JUnit 5 para validar o comportamento da classe `Mensagem` (ex: verificar se o método `.trim()` está removendo os espaços corretamente na criação da mensagem).