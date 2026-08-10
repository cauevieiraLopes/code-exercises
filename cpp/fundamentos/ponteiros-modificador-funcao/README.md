# 📉 O Modificador Indireto (Passagem de Ponteiros para Funções)

Este quarto exercício da série de fundamentos de ponteiros explora como enviar endereços de memória para funções, permitindo a modificação direta de dados sem a necessidade de retornar valores.

## 📖 Descrição do Exercício
O programa simula um sistema de caixa onde o preço de um produto é armazenado dinamicamente na memória Heap através do operador `new`. O sistema interage com o usuário exigindo uma taxa de desconto válida (entre 1% e 100%) por meio de uma estrutura de controle de fluxo contínua. 

Após a validação, o ponteiro é repassado para uma função especializada que acessa o endereço físico da variável, calcula o abatimento percentual e altera diretamente o valor original na memória.

## 🛠️ Conceitos Chave Aprendidos
- **Passagem por Ponteiro:** Enviar o endereço de uma variável para uma função, dando a ela o poder de alterar o dado original (comportamento similar à passagem por referência).
- **Desreferenciação em Funções (`*parametro`):** Uso do operador asterisco dentro do escopo da função para manipular o "morador" da célula de memória recebida.
- **Validação Estrita de Entrada:** Uso de operadores lógicos (`||`) dentro de loops infinitos para blindar regras de negócio (limites do desconto).

## 🚀 Como Executar
1. Compile o arquivo:
   ```bash
   g++ main.cpp -o modificador_funcao
2. Execute a aplicação:
   ```bash
    ./modificador_funcao

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
