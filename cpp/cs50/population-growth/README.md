# 📈 Cálculo de Crescimento Populacional (Lab 1)

Este projeto é uma implementação do problema **"Population"** do curso **CC50** (Harvard CS50), desenvolvido como parte dos meus estudos em lógica e programação no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O objetivo deste programa é calcular o número de anos necessários para que uma população de "lhama" atinja um determinado tamanho final. O cálculo baseia-se em uma taxa anual onde, a cada ano, nasce $1/3$ da população atual e morre $1/4$.

O programa garante a integridade dos dados através de validações:
- A população inicial não pode ser menor que 9.
- A população final não pode ser menor ou igual à inicial.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Desafios CC50:**
  - **Modularização:** Uso de funções (`void`) para organização e reutilização de código (ex: exibição de títulos).
  - **Estruturas de Controle:** Implementação de `do-while` para garantir que o usuário insira valores válidos antes de prosseguir.
  - **Lógica de Acúmulo:** Uso do laço `for` para realizar o cálculo iterativo do crescimento anual até que a meta seja atingida.
  - **Tratamento de Gramática:** Lógica condicional para exibir corretamente o resultado no singular ("1 ano") ou plural ("X anos").

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ (como o g++) instalado.
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o populacao
3. Execute o programa:
   ```bash
   ./populacao

## 👤 Autor
* Cauê Vieira Lopes
