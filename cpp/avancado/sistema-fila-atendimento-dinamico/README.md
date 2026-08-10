# 🏥 Sistema de Fila com Vetores Dinâmicos

Este projeto é uma atividade prática de lógica aplicada para o curso de ADS do **SENAI CIMATEC**, focada no uso de estruturas de dados dinâmicas em C++.

## 📖 Descrição
O sistema implementa uma fila de atendimento onde o usuário pode cadastrar múltiplos pacientes em tempo real. O programa utiliza a estrutura de dados `std::vector` para gerenciar a lista de nomes dinamicamente, permitindo que o atendimento ocorra de forma interativa até que a fila esteja vazia.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Estrutura de Dados:**
  - **STL (Standard Template Library):** Uso do container `std::vector` para armazenamento flexível de elementos.
  - **Gerenciamento de Memória:** Manipulação dinâmica com `push_back()` (inserção) e `pop_back()` (remoção).
  - **Iteração com Range-based for:** Uso de `for(std::string n : l)` para percorrer a lista de forma limpa e eficiente.
  - **Entrada e Saída:** Uso de `std::getline` para permitir nomes compostos, superando a limitação de espaços no `std::cin`.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado.
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o fila_atendimento
3. Execute o programa:
   ```
   ./fila_atendimento
   ```
## 👤 Autor
* Cauê Vieira Lopes
   
 
