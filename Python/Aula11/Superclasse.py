class conta:
    def __init__(self, nome, saldo):
        self.nome = nome
        self.saldo = saldo

    def getnome(self):
        return self.nome
    def getsaldo(self):
        return self.saldo

    def setnome(self, NovoNome):
        self.nome = NovoNome
    def setsaldo(self, NovoSaldo):
        self.saldo = NovoSaldo

    def deposito(self, ValorDep):
        self.saldo = self.saldo + ValorDep

    def saque (self, ValorSaq):
        if ValorSaq > self.saldo:
            print('Valor de saque inválido')
        else:
            self.saldo = self.saldo - ValorSaq