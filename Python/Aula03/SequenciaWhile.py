#Sequencia so que usando while

count = 0
soma = 0
numero = 0

while True:
    numero += 1
    print(numero)
    count += 1
    soma += numero
    if numero == 10:
        break

print('Foram impressos ', count, 'números')
print(soma)
print('Repetição encerrada')
