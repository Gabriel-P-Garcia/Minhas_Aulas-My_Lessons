#Esse programa é para calcular a idade de uma pessoa baseado na sua data de nascimento
from datetime import date

ano = int(input("Digite seu ano de nascimento: "))
idade = date.today().year - ano
nome = input("Digite seu nome: ")

print(nome)
print("Sua idade é: ", idade)
if idade >= 16:
    print("Pode votar.")
else:
    print("Não pode votar.")

