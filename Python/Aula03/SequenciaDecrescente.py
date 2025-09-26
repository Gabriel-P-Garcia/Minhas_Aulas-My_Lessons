#Sequencia decrescentes

count = 0
soma = 0

for numero in range (7,-1,-1):
    print(numero)
    count += 1
    soma -= numero

print('Count foi ', count)
print(soma)