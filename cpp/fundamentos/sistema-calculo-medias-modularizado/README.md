# 📉 Sistema de Médias Modularizado

Este projeto é uma atividade prática desenvolvida para a disciplina de **Lógica de Programação** no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O programa é um sistema avançado de cálculo de notas que permite ao usuário escolher entre três diferentes métodos estatísticos de média. O diferencial técnico deste projeto é a sua estrutura **modularizada**, onde as responsabilidades são divididas em funções específicas, facilitando a leitura e a escalabilidade do código.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Programação:**
  - **Modularização (Funções):** Divisão do sistema em funções de boas-vindas, entrada de dados, processamento de cálculo e exibição de resultados.
  - **Passagem de Parâmetros:** Uso de funções que recebem e retornam valores (`float`, `std::string`).
  - **Múltiplos Algoritmos de Média:**
    - **Aritmética:** Média simples das notas.
    - **Ponderada:** Atribuição de pesos (5, 3 e 2) para as unidades.
    - **Harmônica:** Cálculo baseado no inverso das notas (ideal para taxas e proporções).
  - **Validação de Dados:** Uso de `do-while` para garantir que as notas estejam no intervalo de 0 a 10 e que as opções do menu sejam válidas.
  - **Manipulação de Strings:** Uso de `std::getline` para capturar o nome completo do aluno.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ (ex: g++) instalado.
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o sistema_medias
3. Execute o programa:
   ```bash
   ./sistema_medias

# 👤 Autor
* Cauê Vieira Lopes
