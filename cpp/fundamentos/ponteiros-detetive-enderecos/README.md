# 🕵️‍♂️ O Detetive de Endereços (Fundamentos de Ponteiros)

Este projeto é o primeiro exercício de uma série prática desenvolvida para desmistificar o uso de ponteiros (`*`) e referências de endereços (`&`) em C++, consolidando a base conceitual da **Semana 4 e 5 do CC50** (Harvard CS50).

## 📖 Descrição do Exercício
O objetivo deste programa é rastrear e entender como as variáveis e os ponteiros se comportam fisicamente na memória RAM do computador. O script demonstra:
1. Como obter o endereço de memória de uma variável usando o operador de referência (`&`).
2. Como armazenar esse endereço dentro de um ponteiro (`int*`).
3. Como ler e modificar indiretamente o valor de uma variável acessando diretamente a sua "casa" na memória através da desreferenciação (`*`).

## 🛠️ Conceitos Chave Aprendidos
- **Operador de Endereço (`&`):** Retorna a localização física exata (em hexadecimal) de uma variável na memória RAM.
- **Ponteiro (`Type*`):** Uma variável especial cuja única função é armazenar endereços de memória.
- **Desreferenciação (`*ptr`):** O ato de "entrar na casa" apontada pelo ponteiro para ler ou alterar o valor contido lá dentro.

## 🚀 Como Executar
1. Compile o arquivo:
   ```bash
   g++ main.cpp -o detetive_ponteiros
2. Execute a aplicação:
   ```bash
   g++ main.cpp -o detetive_ponteiros

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
