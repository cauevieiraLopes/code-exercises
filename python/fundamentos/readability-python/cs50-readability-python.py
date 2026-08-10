def receber_texto():
    t = str(input("Escreva o texto: "))

    return t

def calcular_legibilidade (palavras, letras, frases):
    if palavras == 0:
        print("O texto possui 0 palavras, sendo incapaz de realizar o calculo")
        return

    l = float((letras / palavras) * 100)
    s = float((frases / palavras) * 100)

    coleman_Liau = 0.0588 * l - 0.296 * s - 15.8
    coleman_Liau = round(coleman_Liau)    

    if coleman_Liau <= 0:
        print("Before Grade 1")

    elif coleman_Liau >= 16:
        coleman_Liau = 16
        print(f"Grade {coleman_Liau}+")

    else:
        print(f"Grade {coleman_Liau}")

#função main
letras = 0
frases = 0

texto = receber_texto()

for i in texto:
    if i == '?' or i == '!' or i == '.':
        frases += 1

    elif i.isalpha():
        letras += 1

palavras = len(texto.split())

calcular_legibilidade(palavras, letras, frases)
