#Esse programa é para imprimir uma sequencia de numeros pares

count = 0
soma = 0

for numero in range (0,13,2):
    print (numero)
    count += 1
    soma += numero

print('Count foi ', count)
print(soma)