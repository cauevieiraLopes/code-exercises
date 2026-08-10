# 🛡️ O Interruptor de Segurança (Dominando o `nullptr`)

Este é o segundo exercício da trilha de fundamentos de ponteiros, focado no uso de `nullptr` para criar códigos mais seguros e evitar travamentos no sistema operacional.

## 📖 Descrição do Exercício
O programa demonstra o ciclo de vida e a segurança de um ponteiro na memória RAM. Inicialmente, o ponteiro é instanciado apontando para o "nada" (`nullptr`). O código utiliza um laço de repetição para:
1. Validar se o ponteiro é seguro para leitura (evitando o erro fatal de *Segmentation Fault*).
2. Associar dinamicamente o ponteiro ao endereço de uma variável ativa.
3. Acessar com segurança o valor e o endereço de memória guardados no ponteiro após a associação.

## 🛠️ Conceitos Chave Aprendidos
- **`nullptr` (Pointer Literal):** O valor padrão nulo no C++ moderno. Garante que um ponteiro não aponte para um "endereço lixo" aleatório na memória antes de ser inicializado.
- **Validação de Ponteiros:** A boa prática de sempre testar `if (ponteiro == nullptr)` antes de tentar acessar o valor apontado (`*ponteiro`).
- **Escopo e Tempo de Vida:** Entendimento de como variáveis locais existem na memória e como ponteiros dependem de dados válidos e ativos.

## 🚀 Como Executar
1. Compile o arquivo:
   ```bash
   g++ main.cpp -o seguranca_nullptr
2. Execute a aplicação gerada:
   ```bash
    ./agenda_contatos

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
