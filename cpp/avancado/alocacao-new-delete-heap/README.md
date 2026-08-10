# 🧠 Alocação Dinâmica na Heap (`new` vs `delete`)

Este terceiro exercício foca no entendimento da memória dinâmica em C++, explorando os conceitos de alocação na **Heap**, liberação de recursos e gerenciamento de ponteiros pendentes.

## 📖 Descrição do Exercício
O programa aloca dinamicamente espaço na memória Heap para armazenar um valor de ponto flutuante de dupla precisão (`double`) usando o operador `new`. Em seguida:
1. Exibe o valor atribuído e o endereço dinâmico reservado.
2. Desaloca o espaço de forma segura usando o operador `delete`.
3. Limpa o ponteiro associando-o ao `nullptr`.
4. Realiza uma verificação condicional de segurança para garantir que o ponteiro não seja acessado de forma inválida após a desalocação.

## 🛠️ Conceitos Chave Aprendidos
- **Memória Heap:** Área de memória de tamanho flexível e controle manual pelo programador.
- **Operador `new`:** Aloca e reserva bytes na Heap em tempo de execução.
- **Operador `delete`:** Libera o bloco alocado na Heap, essencial para evitar o consumo desnecessário de RAM (*Memory Leaks*).
- **Ponteiros Pendentes (Dangling Pointers):** O perigo de tentar acessar um endereço que já foi desalocado e como o `nullptr` atua como um escudo de segurança neutralizando o ponteiro.

## 🚀 Como Executar
1. Compile o arquivo:
   ```bash
   g++ main.cpp -o alocacao_heap
2. Execute o binário gerado:
   ```bash
   ./alocacao_heap

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
