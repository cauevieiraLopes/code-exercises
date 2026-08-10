# 🔠 Scrabble Score Game

Este projeto é uma implementação do problema **"Scrabble"** do curso **CC50** (Harvard CS50), desenvolvido como atividade de aprofundamento em manipulação de caracteres no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O programa simula uma rodada do jogo Scrabble entre dois jogadores. Cada jogador insere uma palavra e o sistema calcula automaticamente a pontuação total com base nos valores internacionais das letras (ex: 'A' vale 1, 'Q' vale 10). Ao final, o programa compara as pontuações e declara o vencedor ou o empate.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Programação:**
  - **Manipulação de Strings e Characters:** Uso de `std::vector<char>` para decompor palavras em caracteres individuais para análise.
  - **Matrizes (Arrays Multidimensionais):** Uso de matrizes para armazenar as palavras e os pontos de múltiplos jogadores de forma organizada.
  - **Lógica de Pontuação Dinâmica:** Implementação de uma árvore de decisão (`if/else if`) para atribuir pesos diferentes a cada letra do alfabeto, tratando letras maiúsculas e minúsculas de forma equivalente.
  - **Iteradores Modernos:** Uso de *range-based for loops* para percorrer os vetores de caracteres.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado.
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o scrabble
3. Execute o programa:
   ```bash
   ./scrabble

## 👤 Autor
- Cauê Vieira Lopes   
