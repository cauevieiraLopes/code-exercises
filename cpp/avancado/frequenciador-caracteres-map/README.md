# 🔠 Frequenciador de Caracteres (`std::map` em C++)

Este projeto demonstra a utilização prática da estrutura de dados `std::map` para realizar a contagem e análise de frequência de caracteres em textos fornecidos pelo usuário.

## 📖 Descrição do Projeto
O programa solicita uma cadeia de caracteres (`std::string`) ao usuário, validando a entrada para evitar strings vazias. Em seguida, percorre o texto mapeando cada caractere para uma chave em uma Árvore Binária de Busca interna (`std::map`). Cada ocorrência do caractere incrementa o seu contador. 

Por utilizar o `std::map`, ao final do processamento os caracteres são automaticamente exibidos em **ordem alfabética/tabela ASCII**, acompanhados da sua quantidade total de aparições.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++ Moderno.
- **Estrutura de Dados Non-Linear:** `std::map` (mapeamento de chave-valor `char -> int` baseado em Árvore Red-Black).
- **Tratamento de Strings:** Captura completa de linha com `std::getline` e navegação indexada.
- **Iteradores de Mapeamento:** Uso de iteradores (`begin()`, `end()`) e ponteiros de membros (`first` para chave e `second` para valor).
- **Passagem por Referência (`&`):** Manipulação direta de variáveis de texto através do parâmetro de funções sem custo de cópia de memória.

## 🚀 Como Executar
1. Compile o arquivo:
   ```bash
   g++ main.cpp -o frequenciador
2. Execute a aplicação gerada:
   ```bash
    ./frequenciador

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
