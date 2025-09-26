#Esse programa é para determinar se um número é positivo, negativo ou nulo

numero = float(input("Digite um número positivo, nulo ou negativo: "))

print("Você digitou o número: ", numero)
if numero > 0:
    print("Número positivo")
elif numero < 0:
    print("Número negativo")
else:
    print("Nulo")

