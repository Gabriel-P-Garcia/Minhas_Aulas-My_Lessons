#Esse programa é para calcular a media de uma turma usando for

numAluno = int(input("Digite o numero de alunos: "))
count = 0
soma = 0
media = 0

for numero in range (numAluno):
    nota = int(input(f"Digite a nota do aluno {count+1} : "))
    count += 1
    soma += nota

media = soma/count

print(f'\nA media das notas é: {media:.2f}')