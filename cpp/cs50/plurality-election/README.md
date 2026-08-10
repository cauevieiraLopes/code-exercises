# 🗳️ Simulador de Eleição por Pluralidade (Semana 3)

Este projeto apresenta a minha implementação do problema **"Plurality"** pertencente à Semana 3 do curso **CC50** (Harvard CS50), desenvolvido como parte dos estudos práticos de algoritmos de ordenação e busca na trilha de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O programa simula um sistema de votação por pluralidade para 3 candidatos pré-definidos, aceitando a entrada de até 9 eleitores. O sistema valida os votos digitados individualmente e barra qualquer string que não corresponda a um candidato elegível.

O grande diferencial deste código foi a escolha da estratégia de resolução: para determinar o resultado do pleito, foi implementado um algoritmo baseado em ordenação por troca de elementos adjacentes. Dessa forma, as estruturas de nomes e votos são reorganizadas de maneira síncrona, deslocando o candidato com maior pontuação para o final do array (`.back()`), facilitando a verificação de vitórias e empates.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Estruturas de Dados e Algoritmos:**
  - **Sincronização de Arrays Espelhados:** Movimentação coordenada entre o array de contagem de votos (`int`) e o array de identificação dos candidatos (`std::string`) através da função `std::swap`.
  - **Lógica de Ordenação por Troca:** Abordagem alternativa inspirada no Bubble Sort para o ranqueamento de dados numéricos.
  - **Métodos da STL (`std::array`):** Uso de `.size()` e `.back()` para manipular limites e acessar os extremos dos containers de forma segura.
  - **Consistência de Entrada:** Laços estruturados com `do-while` que garantem o cumprimento das regras do escopo de eleitores do exercício.

## 🚀 Como Executar
1. Certifique-se de possuir um compilador C++ configurado no seu ambiente (como o g++).
2. Realize a compilação do arquivo:
   ```bash
   g++ main.cpp -o plurality
3. Execute a aplicação gerada:
   ```bash
    ./plurality
 
## 👤 Autor
- Cauê Vieira Lopes
