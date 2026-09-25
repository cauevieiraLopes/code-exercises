# Geometry Calculator - Desafio DIO

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Desafio-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

Um sistema interativo via terminal para o cálculo de áreas de diferentes figuras geométricas. Desenvolvido como resolução de um desafio da plataforma DIO (Digital Innovation One), o projeto destaca-se pela aplicação de recursos modernos da linguagem Java, como **Sealed Classes**, para garantir um controle estrito e seguro sobre a hierarquia de herança do domínio.

## Features (Funcionalidades)

* **Cálculo de Área Especializado:** Suporte para três formas geométricas distintas, com lógicas isoladas de cálculo:
  * Quadrado (baseado no lado)
  * Retângulo (baseado em base e altura)
  * Círculo (baseado no raio e PI)
* **Modelagem de Domínio Restrita:** Uso de `sealed classes` para garantir que apenas as figuras geométricas autorizadas pelo sistema possam herdar da classe base `ModelFigure`.
* **Validação de Entrada:** Bloqueio de entradas inválidas (valores menores ou iguais a zero) durante a captação de dados no console.

## Tecnologias Utilizadas

**Core / Back-end:**
* Java (JDK 17+) - *Necessário para suporte a Sealed Classes.*
* Conceitos Avançados de POO: Interfaces, Classes Abstratas, `sealed`, `permits`, e `non-sealed`.
* Tratamento de Exceções (`RuntimeException` para opções inválidas).
* `java.util.Scanner` para captura de dados do usuário.

## Pré-requisitos e Instalação

Para rodar este projeto localmente, siga os passos abaixo.

**Pré-requisitos:**
* [Java Development Kit (JDK) 17 ou superior](https://www.oracle.com/java/technologies/downloads/) (obrigatório devido ao uso de Sealed Classes).
* Git instalado.

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
javac br/com/geometryCalculator/controller/Main.java
```

4. Execute o programa:
```bash
java br.com.geometryCalculator.controller.Main
```

> **Nota sobre Variáveis de Ambiente:** Este projeto roda inteiramente no terminal e não possui integrações com banco de dados ou APIs externas. Portanto, **não exige** a configuração de um arquivo `.env`.

## Uso (Usage)

Após executar a aplicação, escolha a forma geométrica desejada no menu e insira as medidas solicitadas.

Exemplo de uso calculando a área de um retângulo:
```text
===== SET FIGURE ====
[1] - Square
[2] - Rectangle
[3] - Circle
Option: 2
===== RECTANGLE =====
Set base: 10
Set height: 5
a rectangle with base 10.0 and height 5.0 has area: 50.0
```

## Testes

Por ser uma aplicação de console, a homologação pode ser feita via testes manuais cobrindo cenários de exceção:
* Digitar uma opção fora do menu (ex: `4`) para testar o disparo da `RuntimeException`.
* Inserir valores `0` ou negativos para raio, base ou lado, validando se o laço `do-while` impede a progressão indevida.

**Próximos passos (Testes Automatizados):** Implementar suíte com **JUnit 5** para atestar a precisão matemática do método `calcularArea()` de cada figura.

## Roadmap

* [ ] **Refatoração com SOLID (ISP):** Aplicar o Princípio da Segregação de Interfaces (ISP). Atualmente, a `InterfaceFigure` agrupa métodos de todas as figuras (ex: `setRadius` e `setBase`). O objetivo é segregar essas interfaces para que um `SquareFigure` não precise conhecer a existência de um método `setRadius`.
* [ ] **Programação Funcional:** Refatorar a estrutura para utilizar as interfaces `Function` (para receber os dados geométricos e retornar o valor da área calculada de forma pura) e `Consumer` (para lidar com a exibição padronizada das mensagens no console).
* [ ] **Cálculo de Perímetro:** Expandir as funcionalidades adicionando o método `calcularPerimetro()` em toda a hierarquia de figuras.