# 🔄 Algoritmo de Ordenação (Bubble Sort)

Este projeto é uma atividade prática desenvolvida para a disciplina de **Lógica de Programação** no curso de ADS do **SENAI CIMATEC**, com o objetivo de explorar algoritmos clássicos de ordenação e estruturas da biblioteca padrão (STL).

## 📖 Descrição
O programa recebe 5 números inteiros fornecidos pelo usuário, armazena-os em um array estático e realiza a ordenação crescente utilizando o algoritmo **Bubble Sort**. O sistema exibe o estado da lista antes e depois do processamento, garantindo clareza na visualização do fluxo.

O funcionamento do Bubble Sort baseia-se em percorrer o array múltiplas vezes, comparando elementos adjacentes e flutuando o maior elemento para o final a cada iteração (como uma bolha).

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Algoritmos e Estruturas de Dados:**
  - **STL Containers (`std::array`):** Uso de arrays estáticos modernos encapsulados, que oferecem mais segurança e recursos que os arrays tradicionais do C.
  - **Algoritmo Bubble Sort:** Implementação manual com dois loops aninhados (`for`) e otimização do limite do loop interno (`l.size() - 1 - i`).
  - **Funções Utilitárias (`std::swap`):** Uso da função nativa para troca eficiente de posições de memória.
  - **Performance com Referências Constantes:** Uso de `const int& i` nos loops de exibição para evitar cópias desnecessárias de dados na memória.
  - **Modularização:** Organização do código em funções com responsabilidades únicas (`receber_numeros`, `exibir_lista_desordenada` e `ordenar_lista`).

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado (como g++).
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o bubble_sort
3. Execute o programa:
   ```bash
   ./bubble_sort

## 👤 Autor
- Cauê Vieira Lopes
