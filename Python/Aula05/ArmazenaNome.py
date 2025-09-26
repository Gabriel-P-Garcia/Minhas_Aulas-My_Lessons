#Esse programa é para criar uma lista em array e fazer operações dentro dela

l_nomes = []

def menu():
    print('[c] Create (Inserir um item)\n'
          '[r] Read (Mostrar toda a lista)\n'
          '[u] Update (Substituir um item)\n'
          '[d] Delete (Remover um item)\n'
          '[e] Exit (Sair)\n')
    escolha = input('Escolha a operação: ')
    return escolha

def create():
    l_nomes.append(input('Digite o item que gostaria de inserir: ')) #O '.append' é para inserir novos valores no array

def read():
    print(l_nomes)

def update():
    novo_valor = input("Digite o que você gostaria de inserir: ")
    indice = int(input("Qual posição será atualizada (Onde 0 é o primeiro termo): "))
    l_nomes[indice] = novo_valor

def delete():
    print(l_nomes)
    indice = int(input('Qual a posição do item a ser deletado (Onde 0 é o primeiro termo): '))
    l_nomes.pop(indice) #.pop é para deletar um item do array


if __name__ == '__main__':
    while True:
        opcao = menu()

        if opcao == 'c':
            create()
        elif opcao == 'r':
            read()
        elif opcao == 'u':
            update()
        elif opcao == 'd':
            delete()
        elif opcao == 'e':
            break
        else:
            print('Operação inválida')
