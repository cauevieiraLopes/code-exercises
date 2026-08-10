# 💳 Validador de Cartão de Crédito (Algoritmo de Luhn)

Este projeto é uma implementação do problema **"Credit"** do curso **CC50** (Adaptação do CS50 de Harvard), desenvolvido como atividade complementar aos meus estudos no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O algoritmo foi projetado para validar a autenticidade de números de cartões de crédito utilizando o **Algoritmo de Luhn**. O programa analisa a estrutura numérica para determinar se o cartão é matematicamente válido e identifica a bandeira correspondente:
- **American Express:** 15 dígitos, começa com 34 ou 37.
- **MasterCard:** 16 dígitos, começa com 51, 52, 53, 54 ou 55.
- **VISA:** 13 ou 16 dígitos, começa com 4.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Desafios CC50:**
  - **Gerenciamento de Tipos:** Uso de `long long` para lidar com overflow de inteiros padrão.
  - **Aritmética de Posição:** Extração de dígitos ímpares e pares utilizando operadores de módulo e divisão.
  - **Lógica de Luhn:** Multiplicação de cada segundo dígito por 2, soma dos algarismos resultantes e verificação final por Módulo 10.
  - **Otimização de Condicionais:** Estrutura de decisão aninhada para filtragem precisa de bandeiras.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado.
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o credit
3. Execute o programa:
   ```
   ./credit
   ```

## 👤 Autor
* Cauê Vieira Lopes
