# 🔄 Verificador de Palíndromos (Java)

Este projeto consiste em uma aplicação de terminal desenvolvida em Java, com foco na manipulação avançada de Strings, limpeza de caracteres especiais, iteração por índices de pontas opostas e estruturação de métodos estáticos em pacotes.

## 📖 Descrição do Projeto
O programa recebe uma palavra ou frase fornecida pelo usuário, higieniza a entrada removendo espaços e pontuações (`.`, `,`, `!`, `?`, `-`), converte os caracteres para maiúsculas e verifica se a sequência lida de trás para frente é idêntica à original.

## 🛠️ Recursos e Conceitos Aplicados
- **Higienização de Strings:** Múltiplas substituições com `.replace()` e padronização com `.toUpperCase()`.
- **Iteração por Caracteres (`charAt`):** Algoritmo de varredura que compara simultaneamente os caracteres do início e do fim da String.
- **Estruturação por Pacotes:** Separação da camada de execução (`br.com.palimdromo`) da camada de funções utilitárias (`br.com.palimdromo.funcoes`).
- **Lógica e Métodos Estáticos:** Implementação de método utilitário `boolean` sem a necessidade de instanciar objetos.

## 🚀 Como Executar
1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório ou navegue até a pasta do projeto.
3. Execute o arquivo `Main.java` via terminal ou pela sua IDE (IntelliJ IDEA):
   ```bash
   java br.com.palimdromo.Main
   ```
# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
