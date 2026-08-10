# 🔊 Simulador de Modificação de Volume de Áudio (Semana 4)

Este projeto simula o comportamento lógico do laboratório **"Volume"** da Semana 4 do curso **CC50** (Harvard CS50), aplicando conceitos de ponteiros e manipulação direta de valores na memória *Heap*.

## 📖 Descrição do Projeto
O programa simula um vetor de dados que representa amostras de áudio (escalonadas originalmente de 0 a 100). Utilizando alocação dinâmica, o sistema armazena essa sequência na memória e, em seguida, solicita ao usuário um "multiplicador de áudio" (fator de ganho). O software percorre a memória multiplicando cada valor pelo fator informado, simulando o processo digital de aumentar ou diminuir o volume de um arquivo de áudio (.wav), exibindo os resultados em tempo real.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++ (com gerenciamento de memória em baixo nível).
- **Conceitos de Algoritmos:**
  - **Alocação Dinâmica Estrita:** Uso de `malloc` e `sizeof(double)` para reservar blocos de memória precisos para ponto flutuante de dupla precisão.
  - **Aritmética de Ponteiros Implícita:** Modificação sequencial de valores indexados diretamente na região de memória alocada.
  - **Processamento de Sinais Digitais (Simulado):** Aplicação de ganho linear através de multiplicação escalar em um vetor de dados numéricos.
  - **Higiene de Memória:** Uso do método `free()` para garantir que o bloco alocado seja totalmente liberado ao término da execução do script.

## 🚀 Como Executar
1. Certifique-se de possuir um compilador C++ configurado no seu ambiente (como o g++).
2. Realize a compilação do arquivo:
   ```bash
   g++ main.cpp -o modificador_volume
3. Execute o binário gerado:
   ```bash
   ./modificador_volume

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
