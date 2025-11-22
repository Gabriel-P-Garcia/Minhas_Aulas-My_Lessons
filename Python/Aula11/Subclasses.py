from Superclasse import conta

class PF(conta):
    def __init__(self, nome, saldo, genero):
        super().__init__(nome, saldo)
        self.genero = genero

    def getgenero(self):
        return self.genero

    def setgenero(self,NovoGenero):
        self.genero = NovoGenero

class PJ(conta):
    def __init__(self, nome, saldo, modalidade):
        super().__init__(nome, saldo)
        self.modalidade = modalidade

    def getmodalidade(self):
        return self.modalidade

    def setmodalidade(self,NovaModalidade):
        self.modalidade = NovaModalidade