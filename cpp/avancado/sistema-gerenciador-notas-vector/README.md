# 📝 Gerenciador de Notas (Vector API)

Este projeto é uma atividade prática de lógica aplicada para o curso de ADS do **SENAI CIMATEC**, focada no uso da `Standard Template Library` (STL) do C++ para gerenciamento de dados.

## 📖 Descrição
O programa implementa um sistema de gerenciamento de notas escolares utilizando a estrutura de dados `std::vector`. O sistema oferece um menu interativo que permite manipular uma coleção de notas em tempo real, 
realizando operações de inserção, remoção, busca e limpeza da lista, garantindo a integridade dos dados através de validações.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Estrutura de Dados:**
  - **STL (Standard Template Library):** Uso extensivo do container `std::vector` para armazenamento dinâmico de notas.
  - **Métodos da API Vector:** Implementação prática de:
    - `push_back()` e `pop_back()`: Manipulação dinâmica.
    - `front()` e `back()`: Acesso aos extremos da coleção.
    - `size()` e `clear()`: Controle de estado e limpeza de memória.
    - `empty()`: Validação booleana para evitar erros de acesso em coleções vazias.
  - **Interface de Controle:** Uso de `do-while` e `if-else` encadeados para navegação entre opções do sistema.
  - **Modularização:** Organização da lógica de controle em uma função `menu()` dedicada.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado.
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o gerenciador_notas
   ```
3. Execute o programa:
  ```bash
   ./gerenciador_notas
   ```

## 👤 Autor
- Cauê Vieira Lopes
   
