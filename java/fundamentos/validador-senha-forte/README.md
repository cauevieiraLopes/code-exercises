# 🔒 Validador de Senha Forte (Java)

Este projeto consiste em uma aplicação de terminal desenvolvida em Java, focada em validação de regras de segurança para senhas, manipulação de Strings, uso de argumentos de linha de comando e arquitetura organizada por pacotes.

## 📖 Descrição do Projeto
O programa recebe o nome do usuário via parâmetro CLI (`args[0]`) e solicita a digitação de uma senha no terminal. Ele aplica uma série de validações encadeadas: verificação de comprimento mínimo (8 caracteres), checagem de presença do nome do usuário na senha (case-insensitive) e obrigatoriedade de caracteres especiais.

## 🛠️ Recursos e Conceitos Aplicados
- **Argumentos de Linha de Comando (`String[] args`):** Captura do nome do usuário na inicialização do programa.
- **Cláusulas Guardiãs (*Guard Clauses*):** Validações antecipadas com retornos precoces para manter o código limpo e sem aninhamento excessivo.
- **Manipulação de Strings:** Utilização de `.length()`, `.contains()`, `.toLowerCase()` e varredura por `.charAt()`.
- **Modularização por Pacotes:** Separação entre a classe de execução (`br.com.validador.modelo.Main`) e a camada de serviços (`br.com.validador.servico.Funcoes`).

## 🚀 Como Executar
1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório e navegue até a pasta `src`.
3. Compile e execute informando o seu nome como argumento:
   ```bash
   javac br/com/validador/modelo/Main.java br/com/validador/servico/Funcoes.java
   java br.com.validador.modelo.Main Caue
   ```

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
