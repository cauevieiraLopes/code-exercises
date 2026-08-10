# 🧩 Algoritmo de Ordenação Avançado (Merge Sort)

Este projeto apresenta uma implementação iterativa e recursiva do algoritmo **Merge Sort**, integrada a um sistema dinâmico de captura e validação de dados via terminal, desenvolvida para o curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O programa gerencia a criação de um vetor de inteiros em tempo de execução, aplicando uma estrutura de controle baseada em loops infinitos (`while true`) para garantir a consistência dos dados. O sistema exige uma barreira mínima de dois elementos inseridos antes de liberar a opção de encerramento do fluxo (acionada ao digitar `0`). 

Uma vez coletados os dados, o algoritmo executa a ordenação estável utilizando o paradigma de **Divisão e Conquista** do Merge Sort, exibindo o estado do vetor antes e depois do processamento recursivo.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Algoritmos:**
  - **Fluxo de Interrupção Controlada (`break`/`continue`):** Uso de desvios condicionais dentro de um loop de escopo aberto para criar regras de negócios de entrada de dados.
  - **Divisão e Conquista Recursiva:** Divisão lógica sucessiva do vetor original até estruturas unitárias e remontagem ordenada via intercalação (*merging*).
  - **Containers Dinâmicos da STL (`std::vector`):** Utilização de alocação sob demanda via `.push_back()`, minimizando o desperdício de memória estática.
  - **Loops de Varredura Otimizados:** Uso do Range-based `for` com dedução automática de tipo (`auto i : lista`) para renderização limpa dos dados em tela.

## 🚀 Como Executar
1. Certifique-se de possuir um compilador C++ configurado no seu ambiente (como o g++).
2. Realize a compilação do arquivo:
   ```bash
   g++ main.cpp -o mergesort
3. Execute a aplicação gerada:
   ```bash
   ./mergesort

## 👤 Autor
- Cauê Vieira Lopes
