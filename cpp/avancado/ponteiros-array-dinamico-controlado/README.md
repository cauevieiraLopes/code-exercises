# 📊 O Array Dinâmico Controlado (Gerenciamento de Vetores na Heap)

Este é o quinto e último exercício da trilha de fundamentos de ponteiros, consolidando o uso de arrays dinâmicos, laços de repetição sequenciais e a desalocação completa de blocos de memória.

## 📖 Descrição do Exercício
O programa permite que o usuário defina o tamanho de um vetor de notas em tempo de execução. O sistema utiliza essa informação para alocar dinamicamente um array do tamanho exato na memória Heap. 

O script realiza o ciclo completo de gerenciamento:
1. Captura o tamanho do vetor e aloca a memória usando `new[]`.
2. Alimenta o array e exibe os dados utilizando laços `for`.
3. Desaloca o bloco inteiro de forma segura através do operador `delete[]`.
4. Neutraliza o ponteiro pendente com `nullptr` e valida a operação com um teste condicional de segurança.

## 🛠️ Conceitos Chave Aprendidos
- **Alocação de Vetores Dinâmicos (`new[]`):** Capacidade de criar estruturas indexadas cujo tamanho não precisa ser fixado durante a escrita do código, mas sim adaptado à necessidade do usuário.
- **Liberação de Estruturas (`delete[]`):** O uso correto dos colchetes para garantir que o gerenciador de memória do C++ percorra e libere todo o bloco alocado na Heap, evitando vazamentos.
- **Ciclo de Vida Completo:** Consolidação prática do trio essencial de manipulação de baixo nível: Alocação $\rightarrow$ Utilização $\rightarrow$ Desalocação + Neutralização.

## 🚀 Como Executar
1. Compile o arquivo:
   ```bash
   g++ main.cpp -o array_dinamico
2. Execute o binário gerado:
   ```bash
    g++ main.cpp -o array_dinamico

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
