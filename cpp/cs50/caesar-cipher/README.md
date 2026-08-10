# 🔐 Cifra de César (Criptografia Clássica)

Este projeto é uma implementação do problema **"Caesar"** do curso **CC50** (Harvard CS50), desenvolvido para explorar manipulação de caracteres e aritmética modular no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O programa implementa a famosa Cifra de César, um método de criptografia por substituição onde cada letra do texto original é "rotacionada" um número fixo de vezes (chave) no alfabeto. O sistema preserva a capitalização das letras (maiúsculas e minúsculas) e mantém caracteres não alfabéticos (espaços, pontuação) inalterados.

A lógica central utiliza a fórmula:
$$c_i = (p_i + k) \pmod{26}$$
Onde $c_i$ é o caractere cifrado, $p_i$ o caractere original e $k$ a chave de rotação.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Programação:**
  - **Aritmética Modular:** Uso do operador `% 26` para garantir que a rotação das letras permaneça dentro dos limites do alfabeto (A-Z).
  - **Manipulação de ASCII:** Conversão de caracteres para índices de base zero (subtraindo 'A' ou 'a') para aplicação da fórmula e retorno ao valor ASCII original.
  - **Uso de `<cctype>`:** Validação rigorosa de tipos de caracteres com `isalpha()`, `isupper()` e `islower()`.
  - **Modularização:** Divisão entre as funções de entrada de dados (`receberTexto`) e processamento lógico (`cifra`).
  - **Tratamento de Entradas:** Validação de chave positiva através de laços `do-while`.

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado (como g++).
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o caesar
3. Execute o programa:
   ```bash
   ./caesar
## 👤 Autor
 - Cauê Vieira Lopes
