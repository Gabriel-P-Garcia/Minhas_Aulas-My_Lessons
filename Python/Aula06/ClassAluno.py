class Aluno:
    def __init__(self, nome, mensalidade, idade):
        self.nome = nome
        self.mensalidade = mensalidade
        self.idade = idade
    def GetNome(self):
        return self.nome
    def GetMensalidade(self):
        return self.mensalidade
    def GetIdade(self):
        return self.idade
    def SetNome(self, novo_valor):
        self.nome = novo_valor
    def SetMensalidade(self, novo_valor):
        self.mensalidade = novo_valor
    def SetIdade(self, novo_valor):
        self.idade = novo_valor

if __name__ == '__main__':
    aluno1 = Aluno('Paulo', 1100.00, 21)
    print('Endereço hex do objeto 1: ', aluno1)
    aluno2 =Aluno('Emily', 1300.00, 17)
    print('Endereço hex do objeto 2: ', aluno2)

    print('Nome do aluno: ', aluno1.GetNome(), ', mensalidade do aluno: ', aluno1.GetMensalidade(), 'reais, idade do aluno: ', aluno1.GetIdade())
    print('Nome do aluno: ', aluno2.GetNome(), ', mensalidade do aluno: ', aluno2.GetMensalidade(), 'reais, idade do aluno: ', aluno2.GetIdade())

    aluno1.SetNome('Marquinho ruindade pura')
    aluno1.SetMensalidade(3.00)
    aluno1.SetIdade(31)

    print('Nome atualizado: ', aluno1.GetNome(), ', mensalidade atualizada: ', aluno1.GetMensalidade(), 'reais, idade atualizada: ', aluno1.GetIdade())