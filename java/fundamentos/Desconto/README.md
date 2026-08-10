# 🏷️ Calculadora de Desconto de Produto (Java)

Este projeto consiste em uma aplicação de terminal desenvolvida em Java, com foco em manipulação de variáveis constantes (`final`), cálculo percentual e consumo correto de *buffer* no leitor de entrada de dados.

## 📖 Descrição do Projeto
O programa solicita ao usuário o preço original de um produto e o seu respectivo nome. Em seguida, aplica uma porcentagem de desconto fixa (10%), calcula o novo valor final e exibe os detalhes formatados no terminal.

## 🛠️ Recursos e Conceitos Aplicados
- **Uso de Constantes (`final`):** Definição da taxa de desconto através do modificador `final`, garantindo a imutabilidade do valor durante a execução.
- **Limpeza de Buffer (`Scanner`):** Utilização do método `sc.nextLine()` após a leitura de tipos numéricos (`nextDouble()`) para evitar que a quebra de linha afete as leituras de texto subsequentes.
- **Cálculo de Porcentagem:** Aplicação direta de fórmulas de desconto percentual em valores decimais (`double`).
- **Organização por Pacotes (`package`):** Estruturação do código dentro de pacotes (`br.com.exercicio`) seguindo convenções do ecossistema Java.

## 🚀 Como Executar
1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório ou navegue até a pasta do projeto.
3. Execute o arquivo via terminal ou pela sua IDE (IntelliJ IDEA):
   ```bash
   java Main.java
   ```

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
