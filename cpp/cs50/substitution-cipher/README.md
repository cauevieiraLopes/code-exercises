# 🔏 Cifra de Substituição Dinâmica

Este projeto é uma implementação do problema **"Substitution"** do curso **CC50** (Harvard CS50), desenvolvido como parte dos estudos de criptografia e manipulação de arrays no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
Diferente da Cifra de César, que utiliza um deslocamento fixo, este programa utiliza uma **chave de substituição** de 26 caracteres para criptografar mensagens. Cada letra do alfabeto original é mapeada para a letra correspondente na posição da chave fornecida pelo usuário.

O sistema garante:
- **Preservação de Case:** Letras maiúsculas permanecem maiúsculas e vice-versa.
- **Integridade de Símbolos:** Espaços, números e pontuações não são alterados.
- **Validação de Chave:** O programa exige uma chave completa de exatos 26 caracteres.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Programação:**
  - **Mapeamento de Caracteres:** Uso de uma lógica de indexação para associar o alfabeto padrão ($A=0, B=1...$) à chave customizada.
  - **Vetores Dinâmicos (`std::vector`):** Conversão de strings para vetores de caracteres para manipulação individual e segura.
  - **Tratamento de Strings:** Uso de `toupper()` e `tolower()` da biblioteca `<cctype>` para garantir que a saída respeite a formatação original do usuário.
  - **Validação de Entrada:** Implementação de laço `do-while` para garantir que a chave possua o comprimento necessário para o funcionamento do algoritmo.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado (como g++).
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o substitution
3. Execute o programa:
    ```bash
    ./substitution

## 👤 Autor
- Cauê Vieira Lopes
