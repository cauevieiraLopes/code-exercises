def solicitar_tamanho():
    try:
        tamanho = int(input("Tamanho da piramide: "))

        if tamanho < 2:
            raise Exception("Tamanho mínimo é 2")
        elif tamanho > 8:
            raise Exception("Tamanho máximo é 8")
        else:
            return tamanho
        
    except ValueError:
            print("Digite um número inteiro!")

def imprimir_tamanho(tamanho):
    for i in range(1, tamanho + 1):
        espaco = " " * (tamanho - i)
        bloco = "#" * i

        print(f"{espaco}{bloco}")

altura = solicitar_tamanho()
imprimir_tamanho(altura)
