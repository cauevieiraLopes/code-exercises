# 🛸 Verificador de Condições de Voo (Drone)

Este projeto é uma atividade prática desenvolvida para consolidar conhecimentos em estruturas de dados compostas (`struct`) e lógica booleana aplicada no curso de ADS do **SENAI CIMATEC**.

## 📖 Descrição
O programa simula um sistema de telemetria básica para drones. Ele recebe dados sobre o estado da bateria e a velocidade do vento, processa essas informações e emite uma recomendação de segurança. O sistema utiliza critérios técnicos para decidir se as condições são favoráveis para o voo, garantindo que o equipamento não opere em situações de risco.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** C++
- **Conceitos de Programação:**
  - **Data Structures (`struct`):** Uso de estruturas para agrupar diferentes tipos de dados sob um único tipo personalizado (`drone`).
  - **Lógica Booleana Avançada:** Aplicação da **Lei de De Morgan** para a negação de condições compostas, otimizando a tomada de decisão no código.
  - **Passagem por Referência:** Uso de referências (`&d`) em funções de entrada para modificar o objeto original e economizar memória.
  - **Validação de Sensores:** Implementação de laços `do-while` para garantir que as entradas simulem dados reais e válidos (ex: bateria entre 0 e 100%).

## 🚀 Como Executar
1. Certifique-se de ter um compilador C++ instalado (como g++).
2. Compile o arquivo:
   ```bash
   g++ main.cpp -o verificador_drone
3. Execute o programa:
   ```bash
   ./verificador_drone

## 👤 Autor
- Cauê Vieira Lopes
