class veiculo:
    def __init__(self, valor, km):
        self.valor = valor
        self.km = km

    def getValor(self):
        return self.valor
    def getKm(self):
        return self.km

    def setValor(self, novoValor):
        self.valor = novoValor
    def setKm(self, novoKm):
        self.km = novoKm

    def aumentaValor(self, valorMais):
        self.valor = self.valor + valorMais



class moto(veiculo):
    def __init__(self, valor, km, cilindrada):
        super().__init__(valor, km)
        self.cilindrada = cilindrada

    def getCilindrada(self):
        return self.cilindrada

    def setCilidradra(self, novoCilindrada):
        self.cilindrada = novoCilindrada


class carro(veiculo):
    def __init__(self, valor, km, portas=2):
        super().__init__(valor,km)
        self.portas = portas

    def getPortas(self):
        return self.portas

    def setPortas(self, novoPortas):
        self.portas = novoPortas
