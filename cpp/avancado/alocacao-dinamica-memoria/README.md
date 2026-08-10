# 🧠 Gerenciamento e Alocação Dinâmica de Memória (`malloc` & `realloc`)

Este projeto marca o meu início nos conceitos da **Semana 4 do CC50** (Harvard CS50), focado em ponteiros e gerenciamento manual da memória *Heap* utilizando C++.

## 📖 Descrição do Projeto
O programa demonstra na prática como o computador manipula arrays dinâmicos na memória. Inicialmente, o sistema aloca espaço estrito para 3 números inteiros usando `malloc`. Após a inserção e exibição dos dados, o usuário tem a opção de expandir dinamicamente a capacidade do array para 5 elementos. Caso aceite, o programa utiliza `realloc` para realocar e preservar os dados antigos, abrindo espaço para os novos elementos na memória.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++ (com funções de gerenciamento de memória padrão C).
- **Conceitos de Baixo Nível:**
  - **Ponteiros (`*`):** Criação e manipulação de variáveis que armazenam endereços de memória.
  - **Alocação Dinâmica (`malloc`):** Requisição manual de bytes na memória *Heap* baseada no tamanho do tipo de dado (`sizeof(int)`).
  - **Garantia de Estabilidade (Null Check):** Verificação de segurança (`if (valores == NULL)`) para impedir falhas de segmentação caso o sistema operacional não possua memória disponível.
  - **Realocação de Memória (`realloc`):** Redimensionamento de um bloco de memória já alocado, demonstrando como o sistema operacional expande o espaço ou move os dados para um novo endereço caso o bloco atual esteja cercado.
  - **Liberação de Memória (`free`):** Devolução manual dos blocos utilizados para o sistema operacional, mitigando riscos de *Memory Leaks*.

## 🚀 Como Executar
1. Certifique-se de possuir um compilador C++ configurado no seu ambiente (como o g++).
2. Realize a compilação do arquivo:
   ```bash
   g++ main.cpp -o alocacao_memoria
3. Execute a aplicação gerada:
   ```bash
    ./alocacao_memoria

## 👤 Autor
* Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
