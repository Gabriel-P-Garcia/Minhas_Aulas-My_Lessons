#Esse programa é para fazer a media de nota de um aluno e falar se ele foi aprovado ou não

prova1 = float(input("Digite a nota da prova 1: "))
prova2 = float(input("Digite a nota da prova 2: "))

media = (prova1 + prova2) / 2

if media >= 5:
    print("Aprovado")
else:
    print("Reprovado")

print("Média: ", media)