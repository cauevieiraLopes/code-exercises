# 📇 Agenda de Contatos Dinâmica em C++ (`new` & `delete[]`)

Este projeto foi desenvolvido para praticar a transição dos conceitos de alocação de memória da linguagem C para os operadores nativos de **C++ modernos**, consolidando os aprendizados da **Semana 4 do CC50** (Harvard CS50).

## 📖 Descrição do Projeto
O programa simula uma agenda de contatos onde o tamanho total da estrutura é definido pelo usuário em tempo de execução. Utilizando estruturas customizadas (`struct`), o sistema aloca dinamicamente na memória *Heap* um array de objetos `Contato`. 

Além de capturar e armazenar Strings completas via `std::getline`, o software manipula índices específicos da String para extrair e armazenar de forma isolada a primeira letra do nome do contato (`inicial_nome`), servindo como base para futuros sistemas de indexação alfabética.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++ Moderno.
- **Conceitos de Baixo e Médio Nível:**
  - **Operador `new`:** Alocação dinâmica de objetos do tipo `struct` diretamente na memória *Heap* do C++.
  - **Operador `delete[]`:** Desalocação segura de arrays dinâmicos, evitando desperdício de memória (*Memory Leaks*).
  - **Manipulação de Strings (`std::string`):** Acesso direto a caracteres indexados de uma string (`inicial[0]`) para obter propriedades específicas.
  - **Gerenciamento de Fluxo de Entrada (`Buffer`):** Uso estratégico de `std::cin.ignore()` combinado com `std::getline` para evitar o pulo de capturas de texto ocasionado pelo caractere de quebra de linha (`\n`).

## 🚀 Como Executar
1. Certifique-se de possuir um compilador C++ configurado no seu ambiente (como o g++).
2. Realize a compilação do arquivo:
   ```bash
   g++ main.cpp -o agenda_contatos
3. Execute a aplicação gerada:
   ```bash
    ./agenda_contatos

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
