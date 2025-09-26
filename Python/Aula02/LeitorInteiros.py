#Esse programa é para contar quantos números foram digitados

contador = 0
soma = 0

while True:
    numero = int(input("Digite um número (Digite -1 para sair da repetição): "))
    if numero == -1:
        break
    contador += 1
    soma = soma + numero

print("Quantidade de números registrados: ", contador)
print("Soma dos números escritos: ", soma)