# 🏥 Sistema de Fila - Clínica Médica

Este projeto é uma atividade prática desenvolvida para a disciplina de **Lógica de Programação** no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O algoritmo simula o gerenciamento de uma fila de espera em uma clínica médica. O sistema registra o nome completo do paciente, permite a classificação por níveis de prioridade (Urgência, Preferencial e Normal) e fornece uma estimativa de tempo de espera com base na triagem realizada. O sistema suporta o registro sequencial de até 20 pacientes por sessão.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Lógica:**
  - **Manipulação de Strings:** Uso da biblioteca `<string>` para capturar nomes e sobrenomes.
  - **Estruturas de Decisão Multi-Escolha:** Uso de `switch-case` para definir o fluxo de atendimento baseado na prioridade selecionada.
  - **Laços de Repetição:** - `do-while` para validação rigorosa de entradas (opções de menu e confirmações 'S/N').
    - `for` para controle de fluxo de múltiplos atendimentos com limite pré-estabelecido.
  - **Interface de Console:** Criação de menus visuais para melhor experiência do usuário (UX).

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ (ex: g++) instalado.
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o sistema_clinica
3. Execute o programa:
   ```
   ./sistema_clinica
   ```

## 👤 Autor
* Cauê Vieira Lopes
