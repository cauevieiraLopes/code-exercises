# 🎓 Cadastro de Aluno com Validação e Pacotes (Java)

Este projeto consiste em uma aplicação de terminal desenvolvida em Java, com foco na organização de código em pacotes (*packages*), comunicação entre classes através do comando `import`, manipulação de textos e validação de dados de entrada.

## 📖 Descrição do Projeto
O programa solicita ao usuário o nome e a média final de um aluno via terminal. Ele aplica tratamentos na entrada de texto (remoção de espaços desnecessários e conversão para maiúsculas), valida a nota garantindo que esteja no intervalo permitido (0 a 10) e armazena as informações em um objeto do tipo `Aluno` localizado em um pacote distinto.

## 🛠️ Recursos e Conceitos Aplicados
- **Modularização por Pacotes (*Packages* & *Imports*):** Separação clara entre a classe do modelo de dados (`ba.com.Cadastro.Dado.Aluno`) e a classe de execução (`ba.com.Cadastro.Execucao.Main`).
- **Manipulação de Strings:** Utilização de `.trim()` e `.toUpperCase()` para higienização e padronização dos textos digitados pelo usuário.
- **Validação de Entrada com Laço de Repetição (`do-while`):** Garantia de integridade dos dados, impedindo o avanço do programa até que uma média válida (entre 0.0 e 10.0) seja inserida.
- **Programação Orientada a Objetos (POO):** Instanciação de objetos e uso de construtores parametrizados (`this.nome`, `this.media`).
- **Entrada de Dados (`Scanner`):** Captura interativa de dados de texto e ponto flutuante via terminal.

## 🚀 Como Executar
1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório ou navegue até a pasta do projeto.
3. Execute o arquivo `Main.java` via terminal ou pela sua IDE (IntelliJ IDEA):
   ```bash
   java ba.com.Cadastro.Execucao.Main
   ```

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
