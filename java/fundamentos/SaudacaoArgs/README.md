# 💬 Gerador de Saudação via Argumentos de Linha de Comando (Java)

Este projeto consiste em uma aplicação de terminal desenvolvida em Java, com foco na manipulação dos parâmetros de entrada da função principal (`String[] args`), validação de arrays e conversão de tipos (*type casting*).

## 📖 Descrição do Projeto
O programa recebe informações de Nome, Idade e Cidade passadas diretamente como argumentos de linha de comando na execução. Ele valida se a quantidade necessária de parâmetros foi fornecida e exibe uma mensagem de saudação personalizada com os dados processados.

## 🛠️ Recursos e Conceitos Aplicados
- **Argumentos de Linha de Comando (`String[] args`):** Captura de parâmetros externos fornecidos no momento da execução do programa sem necessidade da classe `Scanner`.
- **Validação de Arrays e Controle de Fluxo:** Verificação da quantidade de argumentos com `args.length` e interrupção preventiva da execução com `return`.
- **Conversão de Tipos (*Parsing*):** Uso de `Integer.parseInt()` para converter o argumento de idade (recebido originalmente como `String`) para o tipo primitivo `int`.
- **Manipulação e Formatação de Textos:** Interpolação e concatenação de variáveis para exibição da resposta no terminal.

## 🚀 Como Executar

### Via Terminal
Compile e execute passando os três parâmetros (Nome, Idade e Cidade):
  ```
  javac SaudacaoArgs.java
  java SaudacaoArgs Liam 24 New_York
  ```

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
