#Esse programa segue a sequencia de acordo com o imput do usuário

primeiro = int(input("Primeiro valor: "))
ultimo = int(input("Último valor: "))
count = 0
soma = 0
media = 0

for numero in range (primeiro, ultimo+1):
    print(numero)
    count += 1
    soma += numero

media = soma/count

print("Foram impressos",count)
print("Valor da soma",soma)
print("Valor da média",media)