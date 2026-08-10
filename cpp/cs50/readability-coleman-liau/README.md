# 📚 Analisador de Legibilidade (Índice Coleman-Liau) - Versão Refatorada

Este projeto é uma implementação do problema **"Readability"** do curso **CC50** (Harvard CS50), desenvolvido para aplicar conceitos de processamento de texto e algoritmos de análise linguística no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O programa calcula o nível de escolaridade necessário para compreender um determinado texto através do **Índice Coleman-Liau**. O algoritmo analisa a densidade de letras e frases em relação ao número de palavras para aplicar a fórmula:

$$index = 0.0588 \times L - 0.296 \times S - 15.8$$

Esta versão foi refatorada para utilizar funções nativas da biblioteca padrão do C++, tornando o código mais eficiente e profissional.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Refatoração e Boas Práticas:**
  - **Uso de `<cctype>`:** Implementação das funções `isalpha()` e `isspace()` para validação de caracteres, substituindo verificações manuais extensas.
  - **Otimização de Memória:** Iteração direta sobre a `std::string`, eliminando a necessidade de containers adicionais (vetores de caracteres).
  - **Tratamento de Edge Cases:** Lógica aprimorada para contabilizar a primeira palavra do texto através da verificação de string não vazia (`texto.empty()`).
  - **Matemática e Arredondamento:** Uso de `std::round` da biblioteca `<cmath>` para garantir que o resultado final da série escolar (Grade) seja um inteiro preciso.
  - **Modularização:** Separação clara de responsabilidades entre as funções `verificarTexto` e `indice`.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado (como g++).
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o readability
3. Execute o programa:
   ```bash
   ./readability

## 👤 Autor
- Cauê Vieira Lopes
