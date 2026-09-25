# Simulador de Mecânica Automotiva - Desafio DIO

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Desafio-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

Um simulador interativo de veículos via terminal construído em Java, desenvolvido como resolução de um desafio prático da plataforma DIO (Digital Innovation One). Este projeto resolve o problema de demonstrar na prática a aplicação de Programação Orientada a Objetos (POO), encapsulamento e tratamento rigoroso de regras de negócio estipuladas em requisitos de software.

## Features (Funcionalidades e Regras de Negócio)

O sistema foi programado seguindo rigorosamente os requisitos do desafio:

- **Estado Inicial Seguro:** O carro é instanciado sempre desligado, em ponto morto (marcha 0) e a 0 km/h.
- **Bloqueio de Ignição:** Um carro desligado está bloqueado e não pode realizar nenhuma função.
- **Sistema de Desligamento:** O motor só pode ser desligado se o carro estiver parado (0 km/h) e em ponto morto (marcha 0).
- **Aceleração e Frenagem Realistas:** Incremento e decremento progressivo de 1 km/h (Mínimo: 0 km/h | Máximo: 120 km/h).
- **Transmissão Manual Sequencial:** Possui 6 marchas e não permite pular marchas na troca. O sistema de marchas respeita limites estritos de velocidade:
  - **Marcha 0 (Ponto morto):** Não é permitido acelerar.
  - **Marcha 1:** 0 km/h a 20 km/h.
  - **Marcha 2:** 21 km/h a 40 km/h.
  - **Marcha 3:** 41 km/h a 60 km/h.
  - **Marcha 4:** 61 km/h a 80 km/h.
  - **Marcha 5:** 81 km/h a 100 km/h.
  - **Marcha 6:** 101 km/h a 120 km/h.
- **Direção Segura:** O volante (virar à esquerda/direita) só é desbloqueado se o carro estiver em movimento (mínimo 1 km/h) e em velocidade segura (máximo 40 km/h).

## Tecnologias Utilizadas

**Core / Back-end:**
- Java (JDK 11+)
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
javac br/com/carro/controller/Main.java
```

4. Execute o programa:
```bash
java br.com.carro.controller.Main
```

> **Nota sobre Variáveis de Ambiente:** Este projeto é uma aplicação de console focada em lógica de programação pura e não possui integrações externas. Portanto, **não exige** a configuração de um arquivo `.env`.

## Uso (Usage)

Após iniciar a aplicação, você será apresentado a um menu interativo. Para testar o fluxo principal estipulado pelo desafio:

1. Digite `1` para **Ligar o Carro**.
2. Digite `6` (Trocar marcha) e depois `1` para **Engatar a 1ª Marcha**.
3. Pressione `3` (Acelerar) repetidamente até atingir 20 km/h.
4. Tente pressionar `3` novamente — o sistema bloqueará a aceleração devido ao limite da 1ª marcha.
5. Digite `5` para Virar o Carro (ação será permitida, pois a velocidade está entre 1 e 40 km/h).
6. Para desligar, pare o carro (opção `4`), retorne para a marcha 0 (opção `6` -> `2`) e escolha a opção `2` (Desligar).

## Testes

O projeto conta com validações dinâmicas utilizando tratamento de exceções (`RuntimeExceptions`). Para homologar o sistema, execute os seguintes testes manuais (caminhos tristes):
- Tente acelerar sem ligar o veículo.
- Tente acelerar na marcha 0.
- Com o carro a 20 km/h, tente virar o carro (Sucesso). Acelere até 41 km/h e tente virar novamente (Falha - Bloqueio de segurança).
- Tente desligar o carro enquanto estiver engatado em qualquer marcha diferente de 0.

**Próximos passos para testes automatizados:**
O sistema está preparado para receber uma suíte de testes com JUnit 5.
```bash
# Comando futuro para rodar a suíte (Maven/Gradle)
mvn test
```

# Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)