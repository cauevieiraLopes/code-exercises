# 🧬 Simulação de Herança Genética com Ponteiros (`CS50 - Inheritance`)

Este projeto consiste na resolução do clássico problema **Inheritance** (Semana 5 do curso CS50 de Harvard), focado no gerenciamento de memória de baixo nível, estruturas encadeadas e recursão em C++.

## 📖 Descrição do Projeto
O programa simula a transmissão de alelos do tipo sanguíneo ('A', 'B', 'O') ao longo de múltiplas gerações de uma mesma família. A estrutura de dados é montada como uma **Árvore Genealógica Binária** na memória Heap, onde cada indivíduo aponta para os seus respectivos pai e mãe através de ponteiros.

O fluxo de execução ocorre de forma totalmente recursiva:
1. **Construção e Alocação (`criarFamilia`):** O sistema percorre as gerações até atingir a mais antiga (Caso Base), sorteando alelos aleatórios para os ancestrais primordiais e alocando dinamicamente cada `Pessoa` com o operador `new`.
2. **Herança Genética:** Ao retornar da recursão, cada filho herda aleatoriamente um alelo do pai e um alelo da mãe.
3. **Exibição (`imprimirFamilia`):** Percorre a árvore imprimindo a combinação genética de cada geração com formatação e recuo visual.
4. **Desalocação de Memória (`liberarFamilia`):** Realiza a limpeza pós-ordem da memória Heap com `delete`, garantindo que os nós filhos e pais sejam liberados sem deixar *memory leaks* (vazamentos).

## 🛠️ Conceitos e Tecnologias Utilizadas
- **Linguagem:** C++
- **Alocação Dinâmica de Memória:** Uso explícito de `new` e `delete` para gerenciamento na memória Heap.
- **Estrutura Encadeada Recursiva:** `struct` contendo ponteiros (`Pessoa* pai`, `Pessoa* mae`) apontando para instâncias da própria estrutura.
- **Recursão Avançada:** Funções recursivas para criação, navegação e destruição de estruturas de dados hierárquicas.
- **Passagem por Referência (`&`):** Uso de referências em funções auxiliares de sorteio para manipulação direta de variáveis.

## 💡 Processo de Desenvolvimento & Aprendizado
A implementação deste projeto representou um marco importante na compreensão de conceitos avançados de baixo nível:
- **Uso de IA como Tutora:** O desenvolvimento contou com o suporte contínuo de Inteligência Artificial para guiar a sintaxe correta de ponteiros, desmistificar o papel do parâmetro `geracao` na recursão e auxiliar no escopo das funções.
- **Pesquisa e Iteração:** Foram realizadas diversas pesquisas sobre o comportamento da memória Heap em relação à Stack, permitindo migrar de um modelo inicial baseado em `std::vector` para uma árvore binária apontada dinamicamente, conforme a proposta do CS50.

## 🚀 Como Executar
1. Compile o código:
   ```bash
   g++ main.cpp -o heranca_genetica

2. Execute a aplicação gerada:
   ```bash
    ./heranca_genetica

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
