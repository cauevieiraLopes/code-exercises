# 🗳️ Simulador de Eleição Preferencial (Votação Ranqueada)

Este projeto apresenta uma implementação customizada do conceito de **Ranked-Choice Voting** (Votação Preferencial), inspirado no problema **"Runoff"** da Semana 3 do curso **CC50** (Harvard CS50), desenvolvido para a cadeira de Lógica de Programação no **SENAI CIMATEC**.

## 📖 Descrição
O programa simula um sistema de votação onde os eleitores não escolhem apenas um candidato, mas sim ranqueiam as suas preferências do 1° ao 3° lugar. O sistema atribui pesos diferentes para cada posição do Rank (recompensa por preferência e penalidade por rejeição) e calcula matematicamente o vencedor através de uma estrutura de ordenação.

O sistema possui regras estritas de integridade eleitoral:
- **Validação de Candidatos:** Impede votos em nomes que não constam no sistema.
- **Bloqueio de Duplicidade:** O eleitor é proibido de votar no mesmo candidato em ranks diferentes no mesmo turno.
- **Tratamento de Strings Especiais:** Tratamento do caractere `"0"` para evitar quebras de lógica com a inicialização dos arrays da STL.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Algoritmos:**
  - **Matriz de Preferências Adaptada:** Uso de estruturas `std::array` para armazenar de forma síncrona nomes, votos acumulados e o histórico de intenção do eleitor atual.
  - **Controle de Estado com Flags:** Uso da variável booleana `continuar` associada a laços `do-while` para higienização e validação das entradas em tempo de execução.
  - **Sistema de Pontuação Linear:** Uso de blocos `switch-case` para distribuir pesos específicos ($+3$, $+2$, $-1$) baseados no nível de prioridade do Rank do candidato.
  - **Ordenação por Troca Estuturada:** Sincronização e movimentação paralela de arrays de tipos diferentes (`std::string` e `int`) via `std::swap`.

## 🚀 Como Executar
1. Certifique-se de possuir um compilador C++ configurado no seu ambiente (como o g++).
2. Realize a compilação do arquivo:
   ```bash
   g++ main.cpp -o ranked_election
3. Execute a aplicação gerada:
   ```bash
    ./ranked_election

## 👤 Autor
- Cauê Vieira Lopes
