import time

while True:
    try:
        n1 = int(input("Primeiro numero: "))
        n2 = int(input("Segundo numero: "))
    except:
        print("Digite um valor válido!")
        continue

    print("---Qual formula deseja realizar:")
    print("[1]Soma")
    print("[2]Subtração")
    print("[3]Multiplicação")
    print("[4]Divisão")
    print("[5]Potência")

    escolha = int(input("Opção: "))

    print("Resultado: ", end="")

    try:
        if escolha == 1:
            print(n1 + n2)
        if escolha == 2:
            print(n1 - n2)
        if escolha == 3:
            print(n1 * n2)
        if escolha == 4:
            print(n1 / n2)
        if escolha == 5:
            print(n1 ** n2)

    except ZeroDivisionError:
        print("Não é possivel realizar divisão por 0")
    except:
        print("Ocorreu um erro no calculo")

    encerrar = input("Deseja encerrar o sistema? [S/N]: ")

    try:
        if encerrar == "S" or encerrar == "s":
            print("Encerrando...")
            time.sleep(3)
            break
        else: 
            continue
    except:
        print("Ocorreu um erro em sua validação")

    
