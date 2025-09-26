def calculo_soma (valor_01,valor_02):
    return valor_01 + valor_02

if __name__ == '__main__':
    num_01 = int(input("Digite o primeiro número: "))
    num_02 = int(input("Digite o segundo número: "))
    print("O valor da soma dos números digitados é: ", calculo_soma(num_01,num_02))

    num_03 = float(input("Digite um número fracionado: "))
    num_04 = float(input("Digite outro número fracionado: "))
    print("O valor dessa soma é: ", calculo_soma(num_03, num_04))

