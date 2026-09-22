# Pipeline Funcional de Salário (Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

Um projeto interativo via terminal criado para explorar e consolidar os conceitos de Programação Funcional introduzidos no Java 8. O programa resolve o problema de calcular o salário final de um funcionário aplicando regras sequenciais de bônus e impostos de forma limpa, demonstrando o poder das `Functional Interfaces` e do encadeamento de métodos (Pipelines).

## Features (Funcionalidades)

* **Validação de Entrada:** Um laço de repetição (`do-while`) garante que o sistema não aceite salários negativos ou zerados.
* **Funções Independentes (Function):** Separação de responsabilidades lógicas em funções anônimas (lambdas) independentes para `aplicarBonus` e `aplicarImposto`.
* **Pipeline Funcional:** Utilização do método `andThen` da interface `Function` para encadear as operações matemáticas, criando um fluxo de dados (pipeline) limpo, legível e previsível.
* **Feedback em Tempo Real:** O sistema imprime no console o status de cada etapa funcional ("Aplicando bônus...", "Descontando imposto...").

## Tecnologias Utilizadas

**Core / Back-end:**

* Java (JDK 8+)
* `java.util.function.Function` para implementação das regras de negócio através de interfaces funcionais.
* `java.util.Scanner` para captura de dados no terminal.

## Pré-requisitos e Instalação

Para rodar este projeto localmente, siga os passos abaixo:

**Pré-requisitos:**

* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (versão 8 ou superior) instalado.
* Git instalado na sua máquina.

**Passo a passo:**

1. Clone o repositório:
```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
```

2. Acesse a pasta onde o arquivo Java se encontra:
```bash
cd NOME_DO_REPOSITORIO
```

3. Compile o arquivo Java:
```bash
javac Main.java
```

4. Execute o programa:
```bash
java Main
```

> **Nota sobre Variáveis de Ambiente:** Este projeto é executado inteiramente via terminal e não requer a configuração de `.env`.

## Uso (Usage)

Ao rodar a aplicação, o console pedirá que você insira o valor inicial do salário. O sistema então passará o valor pelas duas funções (Bônus de R$200 e Imposto de R$50).

**Exemplo de uso:**
```text
Salário: R$1500
Aplicando bonus...
Descontando imposto...
Salário com o bonus e desconto do imposto
R$1650
```

*Se você tentar inserir `0` ou `-500`, o sistema repetirá a pergunta até receber um valor válido.*

## Testes

Por ser um projeto focado no aprendizado inicial de APIs Funcionais, os testes são manuais via console. Teste os seguintes cenários:
* **Cenário de Sucesso:** Insira um valor como `1000` e verifique se o retorno é `1150`.
* **Cenário de Falha:** Insira valores negativos como `-100` ou `0` para testar a trava de validação do laço `do-while`.
