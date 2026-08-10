def receber_dinheiro_para_troco():
    while True:
        try:
            dinheiro = float(input("Dinnheiro: R$"))

            if dinheiro <= 0:
                raise Exception()
        except ValueError:
            print("Digite um número positivo!")
            continue
        except:
            print("Ocorreu um erro de validação!")
            continue
        else:
            return round(dinheiro * 100)

def exibir_troco(vinte_cinco_centavos, dez_centavos, cinco_centavos, um_centavo):
    print("Seu troco foi:")
    print(f"{vinte_cinco_centavos} moedas de 25 centavos")
    print(f"{dez_centavos} moedas de 10 centavos")
    print(f"{cinco_centavos} moedas de 5 centavos")
    print(f"{um_centavo} moedas de 1 centavos")

            
def contar_troco(dinheiro_troco):
    vinte_cinco_centavos = 0
    dez_centavos = 0
    cinco_centavos = 0
    um_centavo = 0

    while dinheiro_troco > 0:
        if dinheiro_troco >= 25:
            dinheiro_troco -= 25
            vinte_cinco_centavos += 1
            

        elif dinheiro_troco >= 10:
            dinheiro_troco -= 10
            dez_centavos += 1
            

        elif dinheiro_troco >= 5:
           dinheiro_troco -= 5
           cinco_centavos += 1 
            
                   
        elif dinheiro_troco >= 1:
            dinheiro_troco -= 1
            um_centavo += 1

    exibir_troco(vinte_cinco_centavos, dez_centavos, cinco_centavos, um_centavo)

# Código principal (main)
dinheiro_troco = receber_dinheiro_para_troco()
contar_troco(dinheiro_troco)
