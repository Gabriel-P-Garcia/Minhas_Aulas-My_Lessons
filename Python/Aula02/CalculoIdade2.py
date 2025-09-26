#Esse programa é para calcular a idade de uma pessoa baseado na sua data de nascimento e se ela pode votar e/ou dirigir
from datetime import date

ano = int(input("Digite seu ano de nascimento: "))
idade = date.today().year - ano
nome = input("Digite seu nome: ")

print(nome)
print("Sua idade é: ", idade)

if idade < 16:
    print("Não pode votar, não pode dirigir")
elif idade < 18:
    print("Pode votar, não pode dirigir")
else:
    print("Pode votar, pode dirigir")