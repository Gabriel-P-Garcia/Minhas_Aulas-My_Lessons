#Esse programa é para calcular a média aritmetica de uma turma

count = 0
soma = 0
media = 0

while True:
    numero = int(input("Digite a nota: "))
    if numero == -1:
        break
    count += 1
    soma = soma + numero
    media = soma / count

print("O número de alunos é: ", count)
print("A média da turma é: ", media)
