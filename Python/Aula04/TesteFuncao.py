def calculo_dobro(parametro):
    dobro = parametro * 2
    return dobro

if __name__ == '__main__':
    valor = int(input("Valor inteiro: "))

    print("Valor retornado pela função: ", calculo_dobro(valor))

#Alternativamente você pode colocar uma variável com valor da função e depois imprime essa variável (ex: variavel = calculo_dobro(valor))