def compara_valores(valor_01, valor_02):
    if valor_01 > valor_02:
        return valor_01
    elif valor_01 < valor_02:
        return valor_02
    else:
        return "Os dois números são iguais"

if __name__ == '__main__':
    num_01 = int(input("Digite um valor: "))
    num_02 = int(input("Digite outro valor: "))
    print("O maior número é: ", compara_valores(num_01, num_02))