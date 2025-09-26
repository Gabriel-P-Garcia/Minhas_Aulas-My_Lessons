def calculo_soma(mais_01,mais_02):
    return mais_01 + mais_02

def calculo_subtrai (menos_01, menos_02):
    return menos_01 - menos_02

if __name__ == '__main__':
    num_01 = int(input("Digite o primeiro número: "))
    num_02 = int(input("Digite o segundo número: "))
    print("O valor da soma é: ", calculo_soma(num_01, num_02))
    print("O valor da subtração: ", calculo_subtrai(num_01, num_02))