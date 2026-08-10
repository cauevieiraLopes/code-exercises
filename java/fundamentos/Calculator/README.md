# 🧮 Calculadora com Seleção de Operações (Java)

Este projeto consiste em uma aplicação de terminal desenvolvida em Java, com foco em controle de fluxo com `switch-case`, tratamento de exceções lógicas (divisão por zero) e estruturação modular através de métodos.

## 📖 Descrição do Projeto
O programa solicita ao usuário a digitação de dois números reais (tipo `double`) e exibe um menu interativo com as quatro operações matemáticas básicas (Adição, Subtração, Multiplicação e Divisão). Com base na escolha do usuário, o programa direciona a execução para um método responsável por realizar o cálculo e exibir o resultado formatado.

## 🛠️ Recursos e Conceitos Aplicados
- **Estrutura de Decisão (`switch-case`):** Utilização do bloco `switch` para gerenciar as opções do menu interativo e direcionar o fluxo de execução.
- **Validação Lógica:** Verificação para impedir a divisão por zero (`if (n2 == 0)`), evitando erros aritméticos em tempo de execução.
- **Modularização (Métodos Próprios):** Separação de responsabilidades em funções específicas (`soma`, `subtracao`, `multiplicacao`, `divisao` e `operacoes`).
- **Entrada de Dados (`Scanner`):** Manipulação de valores numéricos de ponto flutuante e inteiros informados pelo usuário via terminal.

## 🚀 Como Executar
1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório ou navegue até a pasta do projeto.
3. Execute o arquivo via terminal ou pela sua IDE (IntelliJ IDEA):
   ```bash
   java Calculator.java

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
