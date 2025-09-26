#Esse programa é para imprimir uma sequencia de numeros usando for

count = 0
soma = 0

for numero in range (1,11,1):
    print(numero)
    count += 1
    soma += numero

print('Foram impressos ', count, 'números')
print(soma)
print('Repetição encerrada')

