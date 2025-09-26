
veiculos = []

class Veiculo:

    def __init__(self, modelo, ano, valor):
        self.modelo = modelo
        self.ano = ano
        self.valor = valor
        veiculos.append(self)

    #Funções de get (para pegar o valor do self, ou seja, do veiculo que vc quer):
    def getModelo(self):
        return self.modelo
    def getAno(self):
        return self.ano
    def getValor(self):
        return self.valor

    #Funções de set (para mudar os valores do self)
    def setModelo(self, novo_modelo):
        self.modelo = novo_modelo
    def setAno(self, novo_ano):
        self.ano = novo_ano
    def setValor(self, novo_valor):
        self.valor = novo_valor

    #Função para adicionar ao valor
    def aumentaValor(self, valorAdicionado):
        self.valor = self.valor + valorAdicionado


#Função para o usuário escolher mudar os valores
def mudaModelo():
    checkModelo = input('Deseja mudar o modelo s/n: ')
    if checkModelo == 's':
        checkVeiculo = int(input('Qual o número do veículo: '))
        if checkVeiculo == 1:
            veiculo1.setModelo(input('Digite o novo modelo: '))
        elif checkVeiculo == 2:
            veiculo2.setModelo(input('Digite o novo modelo: '))
        else:
            print('Veículo inválido')
    else:
        return

def mudaAno():
    checkAno = input('Deseja mudar o ano s/n: ')
    if checkAno == 's':
        checkVeiculo = int(input('Qual o número do veículo: '))
        if checkVeiculo == 1:
            veiculo1.setAno(input('Digite o novo ano: '))
        elif checkVeiculo == 2:
            veiculo2.setAno(input('Digite o novo ano: '))
        else:
            print('Veiculo inválido')
    else:
        return

def mudaValor():
    checkValor = input('Deseja mudar de valor s/n: ')
    if checkValor == 's':
        checkVeiculo = int(input('Qual o número do veículo: '))
        if checkVeiculo == 1:
            veiculo1.setValor(int(input('Digite o novo valor: ')))
        elif checkVeiculo == 2:
            veiculo2.setValor(int(input('Digite o novo valor: ')))
        else:
            print('Veiculo inválido')
    else:
        return

def somaValor():
    checkAumento = input("Deseja adicionar um valor extra a um veículo s/n: ")
    if checkAumento != 's':
        return

    idx = int(input('Qual o número do veículo: ')) - 1
    if idx >= len(veiculos):
        print("veiculo invalido")
        return

    valor_add = float(input('Qual valor deve ser adicionado: '))



    veiculo = veiculos[idx]
    veiculo.aumentaValor(valor_add)


#Função principal (main)
if __name__ == '__main__':
    veiculo1 = Veiculo('Monza', 1982, 30.00)
    veiculo2 = Veiculo('HB20', 2015, 30000.00)

    print('Modelo do veículo', veiculo1.getModelo(), ', Ano do veículo', veiculo1.getAno(), ', Valor do veículo', veiculo1.getValor())
    print('Modelo do veículo', veiculo2.getModelo(), ', Ano do veículo', veiculo2.getAno(), ', Valor do veículo', veiculo2.getValor())

    mudaModelo()
    mudaAno()
    mudaValor()
    somaValor()

    print('Modelo do veículo', veiculo1.getModelo(), ', Ano do veículo', veiculo1.getAno(), ', Valor do veículo', veiculo1.getValor())
    print('Modelo do veículo', veiculo2.getModelo(), ', Ano do veículo', veiculo2.getAno(), ', Valor do veículo',veiculo2.getValor())